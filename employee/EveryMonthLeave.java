package employee;

import java.util.ArrayList;
import java.util.List;

public class EveryMonthLeave {
	/*
	 * creating a month class for permanent employee to enter the details in to 
	 * the contructor and return the values in string.
	 */
	public String permanent_month_leave(int eid,int d,int al,int le) {
		LeaveEntities l=new LeaveEntities(eid,d,al,le);
		int ei=l.get_eid();
		int da=l.get_joining_date();
		int all=l.get_allocatedLeave();
		int used=l.get_leaves_used();
		return String.valueOf(eid)+" "+String.valueOf(da)+" "+String.valueOf(all)+" "+String.valueOf(used);
	}
	/*
	 * creating a month class for contract employee to enter the details in to 
	 * the contructor and return the values in string.
	 */
	public String contract_month_leave(int eid,int hours) {
		LeaveEntities l=new LeaveEntities(eid,hours);
		int ei=l.get_eid();
		int ho=l.get_hours_worked();
		return String.valueOf(ei)+" "+String.valueOf(ho);
	}
	
}