package employee;

public class PermanentEmployee extends Employee{
	/*
	 * in this class 
	 * permanent employee is a employee so it is extends the employee
	 * and every permanent employee has ctc and basic.
	 * 
	 */
	private double ctc;
	private double basic;
	PermanentEmployee(int id,String name,Address a,String type,double ctc){
		super(id,name,a,type);
		this.ctc=ctc;
	}
	public double getCtc() {
		return ctc;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = getCtc()/12;
	}
}
