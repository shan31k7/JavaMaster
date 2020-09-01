package practisePrograms;

import printValues.*;

public class StartUpCompany {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(100030,"Henry",500000);
		
		emp1.performTask();
		
		emp2.askForHike();
		
		System.out.println(emp1.empName);
		// System.out.println(emp1.empID);   // tried to access outside package

		// System.out.println(emp1.appraisalRating);

		//System.out.println(emp1.salary);
	}

}
