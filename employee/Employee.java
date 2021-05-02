package employee;

public class Employee {
	/*
	 * in this class we intialize the employee details
	 * employee id, name , address, type is declared private 
	 * using setter and getter method for its access.
	 */
	private int eid;
	private String name;
	/*
	 * employee has a address so we use composition
	 */
	private Address address;
	private String type;
	
	Employee(int eid, String name, Address a1,String type){
		this.eid=eid;
		this.name=(name);
		this.address=a1;
		this.type=type;
	}
	public String getAddress(){
		return address.printdetails();
	}
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
}
