package chapter9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chapter6.Employee;

/**
 *@author fish fly
 *@version 1.8
 *@date 2019年7月22日
 * This program demonstrates the use of a map with key type String and value type Employee. 
 */
public class MapTest {
	
	public static void main(String[] args) {
		Map<String,Employee> staff = new HashMap<String, Employee>();
		staff.put("144-25-5464", new Employee("Amy Lee"));
		staff.put("567-24-2546", new Employee("Harry Hacker"));
		staff.put("157-62-7935", new Employee("Cary Cooper")); 
		staff.put("456-62-5527", new Employee("Francesca Cruz"));

		// print all entries
		System.out.println(staff);
		
		// remove an entry 
		staff.remove("567-24-2546");

		// replace an entry 
		staff.put("456-62-5527", new Employee("Francesca Hiller"));
		
		// look up a value 
		System.out.println(staff.get("157-62-7935"));

		// iterate through all entries 
		staff.forEach(	(k,v) ->
				System.out.println("key="+k+", value="+v)	)	;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
