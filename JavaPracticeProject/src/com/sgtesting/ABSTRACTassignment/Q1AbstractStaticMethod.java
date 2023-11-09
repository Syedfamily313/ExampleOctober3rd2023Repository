package com.sgtesting.ABSTRACTassignment;
abstract class Manager
{
	 static void showManagerName(String name)
	 {
		 System.out.println("ManagerName:"+name);
	 }
	 static void showManagerIdnum(int idnum)
	 {
		 System.out.println("showManagerIdnum:"+idnum);
	 }
	 static void showManagerCompanyName(String companyname)
	 {
		 System.out.println("ManagerCompanyName:"+companyname);
	 }
}
class Employee extends Manager
{
	 static void showEmployeeName(String name)
	{
		System.out.println("Employee Name:"+name);
	}
	 static void showEmployeeIdnum(int idnum)
	 {
		 System.out.println("Employee Idnum:"+idnum);
	 }
	 static void showEmployeeCompanyName(String companyname)
	 {
		 System.out.println("Employee CompanyName:"+companyname);
	 }
}
public class Q1AbstractStaticMethod {

	public static void main(String[] args) {
		Employee .showManagerName("AKBAR");
		Employee .showManagerIdnum(313);
		Employee .showManagerCompanyName("INFOSYS");
		Employee .showEmployeeName("TIPPU");
		Employee .showEmployeeIdnum(321);
		Employee .showEmployeeCompanyName("SYED'S LTD");

	}

}
