package employee;

import java.util.ArrayList;

public class GetLeaveDetailsOfEmployee {
	/*
	 * in this method 
	 * Returning the string of the employee 
	 * by checking the eid and the month.
	 * arrayList<ArrayList<String>> 
	 */
	String cal(ArrayList<ArrayList<String>> leaveList,int month,int eid) {
		if(month == 01) {
			for(int i=0;i<leaveList.size();i++) {
				String g=leaveList.get(i).get(0);
				String f[]=g.split(" ");
				if(Integer.parseInt(f[0])==eid) {
					return leaveList.get(i).get(0);
				}
			}
		}
		else if(month == 02) {
			for(int i=0;i<leaveList.size();i++) {
				String g=leaveList.get(i).get(1);
				String f[]=g.split(" ");
				if(Integer.parseInt(f[0])==eid) {
					return leaveList.get(i).get(1);
				}
			}
		}
		else if(month == 03) {
			for(int i=0;i<leaveList.size();i++) {
				String g=leaveList.get(i).get(2);
				String f[]=g.split(" ");
				if(Integer.parseInt(f[0])==eid) {
					return leaveList.get(i).get(2);
				}
			}
		}
		else if(month == 04) {
			for(int i=0;i<leaveList.size();i++) {
				String g=leaveList.get(i).get(3);
				String f[]=g.split(" ");
				if(Integer.parseInt(f[0])==eid) {
					return leaveList.get(i).get(3);
				}
			}
		}
		return null;
	}
}
