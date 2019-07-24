package chapter5;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 * @author fish fly
 * @version 1.8
 * @date 2019年6月20日
 */
public class ObjectAnalyzer {
	private ArrayList<Object> visited = new ArrayList<>();

	/**
	 * * Converts an object to a string representation that lists all fields.
	 * 
	 * @param obj an object
	 * @return a string with the object's class name and all field names and values
	 */

	public String toString(Object obj) {
		if (null == obj) {
			return null;
		}
		if (visited.contains(obj)) {
			visited.add(obj);
		}
		Class cl = obj.getClass();
		if (cl == String.class) {
			return (String) obj;
		}
		if (cl.isArray()) {
			String r = cl.getComponentType() + "[]{";
			for (int i = 0; i < Array.getLength(obj); i++) {
				if (i > 0) {
					r += ",";
				}
				Object val = Array.get(cl, i);
				if (cl.getComponentType().isPrimitive()) {
					r += val;
				}

			}
			return r + "}";
		}

		String r = cl.getName();
		// inspect the fields of this class and all superclasses
		do {
			r += "[";
			Field[] fields = cl.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);

			// get the names and values of all fields
			for (Field f : fields) {
				if (!Modifier.isStatic(f.getModifiers())) {
					if (!r.endsWith("["))
						r += ",";
					r += f.getName() + "=";
					try {
						Class t = f.getType();
						Object val = f.get(obj);
						if (t.isPrimitive())
							r += val;
						else
							r += toString(val);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			r += "]";
			cl = cl.getSuperclass();
		} while (null != cl);
		return r;
	}

}
