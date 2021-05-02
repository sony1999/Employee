package employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EmployeeDatabase{
	/*
	 * the arraylist of emp is of employee type and stores all the employee details.
	 */
	
	ArrayList<Employee> emp= new ArrayList<>();
	
	/*
	 * this methods returns the employee details through arraylist
	 */
	public ArrayList<Employee> empdetails(){
		Address a1=new Address("PLotNO22,Venkataramanacolony","NAgole","500065");
		Employee e1=new PermanentEmployee(001,"Sowmya",a1,"permanent",600000);
		emp.add(e1);
		Address a2=new Address("PLotNO52,Venkatacolony","KURNOOL","500065");
		Employee e2=new PermanentEmployee(002,"Sathwika",a2,"permanent",500000);
		emp.add(e2);
		Address a3=new Address("Plotno2-2/254","Hyderabad","500065");
		Employee e3=new Employee(003,"padma",a3,"contract");
		emp.add(e3);
		return emp;
	}
}
