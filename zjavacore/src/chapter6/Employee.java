package chapter6;

public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	
	public Employee() {	
		
	}
		
	public Employee(String name) {
		this.name = name;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent;
		salary += raise;
	}
	
	
	
	@Override
	public int compareTo(Employee other) {

		return Double.compare(salary, other.salary);
	}

}
