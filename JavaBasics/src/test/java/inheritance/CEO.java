package inheritance;

public class CEO extends Employee {
	// public, default, protected and private
	
	// child class - relationship should be - is a relationship
	// child class relateion 'has a relationship // avoid such class
	
	public String regulations;
	public String empName= "Tom Cruise";
	
	public CEO()
	{
		super();
	}
	
	public static void main(String[] args)
	{
		CEO brian = new CEO();
		
		brian.askForHike();
		brian.performTask();
		
	}
	
	public void addValueStatements() {
		
	}
	
	public void printName()
	{
		System.out.println("local empName " + this.empName);
		System.out.println("parent empName " + super.empName);

	}
	
	//Overridden method
	// Method Signature should be as of Parent class method
	@Override
	public void circular(int employeeCount) {
		System.out.println("Hello Partners !!. You are the important member of the company, you ....."
				+ "We appreciate each Partners and their efforts" + employeeCount);
	}
	
	
	public static void parentMethod()
	{
		System.out.println("inside child method");
	}

}
