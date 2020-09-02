package inheritance;

public class Employee {
	public static String qualification = "Masters"; 
	public String empName; // public information - within project
	int empID; // package level - within package
	protected int appraisalRating; // protected - within class and subclasses
	private double salary; // private - within class

	public Employee() // default constructor
	{
		empID = 10001;
		empName = "Expert";
		salary = 1000000;
		appraisalRating = 2;
	}

	public Employee(int id, String name, double sal) // parameterized constructor
	{
		empID = id;
		empName = name;
		salary = sal;
		appraisalRating = 2;

	}
	
	public Employee(int id, double sal, String name) // parameterized constructor
	{
		empID = id;
		salary = sal;
		appraisalRating = 2;

	}

	public void performTask() {
		System.out.println("Task Performed " + empName);
	}

	public double askForHike() {
		System.out.println("Give me 10 % hike " + salary + " " + empName);
		return 10;
	}

	final public void goodBye() {
		System.out.println("Give me 10 % hike " + salary + " " + empName);
	}
	
	public void getSalary()
	{
		System.out.println(salary);
	}
	
	public void setSalary(double value)
	{
		salary = value;
	}
	
	public void circular(int employeeCount) {
		System.out.println("Hello Employee !!. You are the important member of the company, you ....."
				+ "We appreciate each employee and their efforts" + employeeCount);
	}
	
	public static void parentMethod()
	{
		System.out.println("inside Parent method");
	}

}
