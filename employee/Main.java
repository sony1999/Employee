package employee;

import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		/*
		 * from january to till april all the employee details are stored 
		 * and by entering the month all the details i.e 3 employee details in the database
		 * is printed along with the details. 
		 */
		Scanner sc=new Scanner(System.in);
		EmployeeDatabase emp=new EmployeeDatabase();
		System.out.println("enter month");
		int month=sc.nextInt();
		LeaveDatabase ld=new LeaveDatabase();
		CalculateMonthSalary mse=new  CalculateMonthSalary();
		mse.check_emp_type(emp.empdetails(),ld.leave(),month);
		sc.close();
	}
}
