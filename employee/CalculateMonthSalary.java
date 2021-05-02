package employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
public class CalculateMonthSalary extends Exception{
	Date date;
	int allocated_leave;
	int leaves_used;
	/*
	 * in this method we check the emp type by iterating the emp details. 
	 */
	public void check_emp_type(ArrayList<Employee> empdetails, ArrayList<ArrayList<String>> leave, int month) {
		/*
		 * if the emp type is permanent the it pass the details of that employee to calculate_salary method
		 */
		try {
			Iterator<Employee> i=empdetails.iterator();
			while(i.hasNext()) {
				PermanentEmployee e=(PermanentEmployee)i.next();
				if(e.getType()=="permanent") {
					calculate_salary(e,month,leave,e.getCtc());
				}
			}	
		}
		catch(Exception e) {
			System.out.println("");
		}
		/*
		 * if the emp type is contract then get that employee and leave details are passed to get that hours worked
		 * 
		 */
		try {
			GetLeaveDetailsOfEmployee get_details=new GetLeaveDetailsOfEmployee();
			Iterator<Employee> i=empdetails.iterator();
			while(i.hasNext()) {
				Employee e=(Employee)i.next();
				if(e.getType()=="contract") {
					String g=get_details.cal(leave,month,e.getEid());
					String f[]=g.split(" ");
					double salary=Integer.parseInt(f[1])*250;
					Printdetails p=new Printdetails();
					p.printdetails(e,salary);
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
	/*
	 * in calculate_salary method() :
	 *  we calculate the salary of the permanent employee based on the Employee and 
	 *  arraylist of employee,leave,ctc
	 */
	void calculate_salary(Employee e,int month,ArrayList<ArrayList<String>> leave ,double ctc) {
		double basic = ctc/12;
		GetLeaveDetailsOfEmployee get_details=new GetLeaveDetailsOfEmployee();
		String g=get_details.cal(leave,month,e.getEid());
		String f[]=g.split(" ");
		int joiningdate= Integer.parseInt(f[1]);
		allocated_leave=Integer.parseInt(f[2]);
		leaves_used =Integer.parseInt(f[3]);
		SalaryStructure s=new SalaryStructure();
		s.setda(0.1); s.sethra(0.17);s.setpf(0.15);
		int l=check_leave(basic,joiningdate,allocated_leave,leaves_used);
		if(l==0) {
			double salary= basic+(basic*s.getda())+(basic*s.gethra())-(basic*s.getpf());
			Printdetails p=new Printdetails();
			p.printdetails(e,salary);	
		}
		else {
			int days=daysofmonth(month);
			double per_day=basic/days;
			double salary= basic-(per_day*l)+(basic*s.getda())+(basic*s.gethra())-(basic*s.getpf());
			Printdetails p=new Printdetails();
			p.printdetails(e,salary);
		}
	}
	/*
	 * in check_leave method : we check whether the leave are validate or not  
	 */
	int check_leave(double basic,int date,int allocated_leave,int leaves_used) {
		if(date<7 && leaves_used<2) {
			return 0;
		}
		else if(date>6 && leaves_used<2) {
			return 0;
		}
		return leaves_used-1;
	}
	/*
	 * daysofmonth():
	 * returning no of days in a month based on month
	 */
	int daysofmonth(int month) {
		switch(month){
		case 1: return 31;
		case 2: return 28;
		case 3: return 31;
		case 4: return 30;
		}
		return 31;
	}

}
