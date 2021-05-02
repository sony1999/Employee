package employee;

public class LeaveEntities {
	/*
	 * in this class initialize the leave details for the employee and store these values in arraylist
	 * eid, joining_date,allocated leaves,leaves_used are considered for the permanent employee
	 * eid, hours worked for the contract employee 
	 */
	private int eid;
	private int joining_date;
	private int allocated_leave;
	private int leaves_used;
	private int hours_worked;
	LeaveEntities(int eid,int date,int allocated_leave,int leaves_used){
		this.eid=eid;
		this.joining_date=date;
		this.allocated_leave=allocated_leave;
		this.leaves_used=leaves_used;	
	}
	/*
	 * since, contract employee has only the hours he work in a month and the id
	 */
	LeaveEntities(int eid,int hours_worked){
		this.eid=eid;
		this.hours_worked=hours_worked;
	}
	public int get_hours_worked() {
		return hours_worked;
	}
	public int get_eid() {
		return eid;
	}
	public int get_joining_date() {
		return joining_date;
	}
	public int get_allocatedLeave() {
		return allocated_leave;
	}
	public int get_leaves_used() {
		return leaves_used;
	}
}
