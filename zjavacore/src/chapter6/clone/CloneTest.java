package chapter6.clone;

public class CloneTest {
	public static void main(String[] args) {
		
		try {
			Employee original = new Employee("Joey", 10000);
			original.setHireDay(2019, 11, 1);
			Employee copy = original.clone();
			copy.raiseSalary(50);
			copy.setHireDay(2019, 12, 1);
			System.out.println("original:"+original);
			System.out.println("copy:"+copy);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
