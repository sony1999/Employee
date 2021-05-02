package employee;
/*
 * since address have many fields like address line, city,pincode, 
 * we are using composition
 */
public class Address {
	String addressline;
	String city;
	String pincode;
	Address(String addressline , String city,String pincode){
		this.addressline=addressline;
		this.city=city;
		this.pincode=pincode;
	}
	String printdetails(){
		return this.addressline+" "+this.city+" "+this.pincode;
	}
}
