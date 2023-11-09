package com.sgtesting.parameterized;

class Employee1 {
	String FirstName;
	int idnum;
	int age;
	String Address;
	char bloodGroup;

	Employee1(String ad,String fn,char bd,int in,int ag) {
		FirstName =fn ;
		idnum = in;
		age = ag;
		Address = ad;
		bloodGroup = bd;
		System.out.println("FirstName:" + FirstName);
		System.out.println("idnum: " + idnum);
		System.out.println(" age: " + age);
		System.out.println("Address: " + Address);
		System.out.println("bloodGroup: " + bloodGroup);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}

class Department {
	String deptName;
	int idnum;
	String Hod;
	String Address;
	char bloodGroup;

	Department(String dn,String h,String ad, char bd,int in) {
		deptName =dn;
		idnum = in;
		Hod = h;
		Address = ad;
		bloodGroup = bd;
		System.out.println("deptName: " + deptName);
		System.out.println("idnume: " + idnum);
		System.out.println("Hod: " + Hod);
		System.out.println("Address: " + Address);
		System.out.println("bloodGroup: " + bloodGroup);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}

class Insurance {
	String Nameofinsurance;
	int age;
	String gender;
	String Healthstatus;

	Insurance(String ni,String gn,String hs,int ag) {
		Nameofinsurance = ni;
		age = ag;
		gender = gn;
		Healthstatus = hs;
		System.out.println("Nameofinsurance: " + Nameofinsurance);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
		System.out.println("Healthstatus: " + Healthstatus);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}

public class EmployeeMembers {

	public static void main(String[] args) {
		Employee1 obj1 = new Employee1("MANJUNATH","HASSAN",'A', 313,25);

		Department obj2 = new Department( "Electrician  Department","RAJANNA","HASSAN",'A',133);

		Insurance obj3 = new Insurance("HEATLH INSURANCE", "MALE","CANCER",25);

	}

}
