package inheritance;

import java.util.Collections;

public class Runner {
	final static float PI = 3.14f;    //Constant variable
	
	public static void main(String[] args) {
		CEO c1 = new CEO();
		c1.printName();
		
			//PI = 5;
		
		int i = 50;
		int j = i;
		j= 55;			// value is copied
		
		System.out.println("i" + i);
		System.out.println("j" + j);
		
		Employee emp1 = new Employee();
		emp1.empName = "Victor";
		
		Employee emp2 = emp1;	// reference is copied
		
		emp2.empName = "John";	
		System.out.println(emp1.empName);
		System.out.println(emp2.empName);

		emp1.empName = "Williams";	
		System.out.println(emp1.empName);
		System.out.println(emp2.empName);
		
		
		
		// Overriding methods
		Employee emp3 = new Employee();
		CEO ceo1 = new CEO();
		
		emp3.circular(25000);
		ceo1.circular(35000);
		
		// Child object can be assigned to parent reference
		
		Employee emp4 = new CEO();
		emp4.circular(80000);
		
		/*WebDriver 
		Chrome
		IE
		Firefox
		MicroEdge*/
		
		
		System.out.println("Array for Employee class");
		Employee[] employees = new Employee[55];
		
		//employees[0].getSalary();
		
		System.out.println("Overriding Parent static method");
		CEO ceo = new CEO();
		ceo.parentMethod();

	}

}
