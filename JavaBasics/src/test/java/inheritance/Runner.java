package inheritance;

public class Runner {

	public static void main(String[] args) {
		
		//	 how to use an existing class
		Employee emp = new Employee();	// parent object
		emp.getSalary();				// parent method
		emp.goodBye();					// parent method
		System.out.println(emp.empID);
		
		// improve the parent class
		CEO ceo = new CEO();	// child object
		ceo.getSalary();	// parent methods
		ceo.goodBye();		// parent methods
		ceo.printName();
	}

}