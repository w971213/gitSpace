package chapter6;

import java.util.Arrays;

public class EmployeeSortTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3]; 
		staff[2] = new Employee("Harry Hacker", 35000); 
		staff[1] = new Employee("Carl Cracker", 75000); 
		staff[0] = new Employee("Tony Tester", 38000);
		
		int comp = staff[1].compareTo(staff[0]);
		System.out.println("comp:"+comp);
		
		Arrays.sort(staff);
		
		for (Employee e : staff) {
			System.out.println("name:"+e.getName()+",salary:"+e.getSalary());
		}
	
		
		
	}
	
	
}
