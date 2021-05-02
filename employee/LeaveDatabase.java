package employee;


import java.util.ArrayList;

public class LeaveDatabase {
	/*
	 * Returning list of employee details(these employee details are stored in a list)
	 * 
	 */
	public  ArrayList<ArrayList<String>> leave() {
		
		ArrayList<ArrayList<String>> al=new ArrayList<>();
		ArrayList<String> emp=new ArrayList<>();
		/*
		 * creating a object of everymonthleave and accessing its methods to enter
		 * the details of the eid, dateof joining(month),leaves alloted, leaves taken 
		 */
		EveryMonthLeave eml=new EveryMonthLeave();
		String j=eml.permanent_month_leave(001,1, 15, 0);
		String f=eml.permanent_month_leave(001,1,14,3);
		String m=eml.permanent_month_leave(001,1,14,0);
		String a=eml.permanent_month_leave(001,1,13,1);
		/*
		 * these months are stored in a arraylist 
		 */
		emp.add(j);
		emp.add(f);
		emp.add(m);
		emp.add(a);
		/*
		 * the arraylist emp is added to the employee_leaves arraylist 
		 */
		al.add(emp);
		ArrayList<String> emp1=new ArrayList<>();
		EveryMonthLeave eml1=new EveryMonthLeave();
		String j1=eml1.permanent_month_leave(002,3, 12, 0);
		String f1=eml1.permanent_month_leave(002,3,11,1);
		String m1=eml1.permanent_month_leave(002,3,9,2);
		String a1=eml1.permanent_month_leave(002,3,10,1);
		emp1.add(j1);
		emp1.add(f1);
		emp1.add(m1);
		emp1.add(a1);		
		al.add(emp1);

		ArrayList<String> emp2=new ArrayList<>();
		EveryMonthLeave eml2=new EveryMonthLeave();
		String j2=eml2.contract_month_leave(003, 154);
		String f2=eml2.contract_month_leave(003, 123);
		String m2=eml2.contract_month_leave(003, 134);
		String a2=eml2.contract_month_leave(003, 104);
		emp2.add(j2); emp2.add(f2);emp2.add(m2);emp2.add(a2);
		al.add(emp2);
		return al;
	}
}

