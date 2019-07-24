package chapter5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * This program use reflection to print all features of a class.
 * 
 * @author fish fly
 * @version 1.8
 * @date 2019年6月20日
 */
public class ReflectionTest {

	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getConstructors();
		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.println("  ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0) {
				System.out.println("construcotr name:" + name + ",constructor modifier:" + modifiers);
				System.out.println("     ");
			}

			// print parameter types
			Class[] parameters = c.getParameterTypes();
			if (parameters.length > 0) {

				for (Class cla : parameters) {
					System.out.println("parameters classname: " + cla.getName());
				}
				System.out.println();
			}

		}

	}

	public static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		for (Method m : methods) {
			Class resType = m.getReturnType();
			String name = m.getName();
			System.out.println("     ");
			// print modifiers,return type, method name
			String modifier = Modifier.toString(m.getModifiers());
			if (modifier.length() > 0) {
				System.out.print(modifier + " " + resType + " " + name + "(");
			}
			Class[] paramTypes = m.getParameterTypes();
			for (Class c : paramTypes) {
				System.out.print(c.getTypeName()+" ");
			}
			System.out.print(");");

		}
		System.out.println();

	}
	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		for(Field f:fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.println("   ");
			String modifier = Modifier.toString(f.getModifiers());
			if (modifier.length() > 0) {
				System.out.println(modifier + " "+type+" "+name+";");
			}
		}
		
	}
	public static void main(String[] args) {
		// read class name from command line or use user input
		String name;
		if (args.length > 0) {
			name = args[0];
		} else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name (e.g. java.util.Date):");
			name = in.next();
		}

		// print class name and superclass name (if != object)
		try {
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) {
				System.out.println("modifiers:" + modifiers);
				System.out.println("name" + name);
			}
			if (supercl != null && supercl != Object.class) {
				System.out.println("extends" + supercl.getName());
			} else {
				System.out.println("extends Object");
			}

			// 调用参数信息方法
			System.out.println("parameters:(");
			printConstructors(cl);
			
			//调用类里方法信息
			System.out.println("类里方法信息");
			printMethods(cl);
			
			//调用类里域信息
			System.out.println("类里域信息");
			printFields(cl);

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
