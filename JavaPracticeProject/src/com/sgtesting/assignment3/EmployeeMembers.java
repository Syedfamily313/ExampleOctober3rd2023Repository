package com.sgtesting.assignment3;
class Employee1
{
	String  FirstName;
	int idnum;
	int  age;
	String Address;
	char bloodGroup;
}
class Department
{
	String deptName;
	int idnum;
	String Hod;
	String Address;
	char bloodGroup;
}
class Insurance
{
	String Nameofinsurance;
	int age;
	String gender;
	String Healthstatus;
}

public class EmployeeMembers {
	
	public static void main(String[] args) {
		Employee1 obj1 =new Employee1();
		obj1.FirstName="MANJUNATH";
		obj1.idnum=313;
		obj1.age=25;
		obj1.Address="HASSAN";
		obj1.bloodGroup='A';
		System.out.println("FirstName:"+ obj1.FirstName);
		System.out.println("idnum: "+ obj1.idnum);
		System.out.println(" age: "+ obj1.age);
		System.out.println("Address: "+ obj1.Address);
		System.out.println("bloodGroup: "+ obj1.bloodGroup);
		System.out.println("++++++++++++++++++++++++++++++++");
		Department obj2=new  Department();
		obj2.deptName="Electrician  Department";
		obj2.idnum=133;
		obj2.Hod="RAJANNA";
		obj2.Address="HASSAN";
		obj2.bloodGroup='A';
		System.out.println("deptName: "+obj2.deptName);
		System.out.println("idnume: "+obj2.idnum);
		System.out.println("Hod: "+obj2.Hod);
		System.out.println("Address: "+obj2.Address);
		System.out.println("bloodGroup: "+obj2.bloodGroup);
		System.out.println("++++++++++++++++++++++++++++++++++");
		Insurance obj3=new  Insurance();
		obj3.Nameofinsurance="HEATLH INSURANCE";
		obj3.age=25;
		obj3.gender="MALE";
		obj3.Healthstatus="CANCER";
		System.out.println("Nameofinsurance: "+obj3.Nameofinsurance);
		System.out.println("age: "+obj3.age);
		System.out.println("gender: "+obj3.gender);
		System.out.println("Healthstatus: "+obj3.Healthstatus);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}

}
