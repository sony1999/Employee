package employee;

public class Printdetails {
	/*
	 * printing the details of the  given employee and the salary
	 */
	void printdetails(Employee e,double salary) {
		System.out.println("the details of employee are:");
		System.out.println("the employee id are : "+e.getEid());
		System.out.println("the employee name is: "+e.getName());
		System.out.println("the employee address is : "+e.getAddress());
		System.out.println("the types of employee is: "+e.getType());
		System.out.println("the employee salary : "+salary);
	}
}
