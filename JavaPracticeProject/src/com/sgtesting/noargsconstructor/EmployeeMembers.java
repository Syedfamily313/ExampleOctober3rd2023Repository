package com.sgtesting.noargsconstructor;

class Employee1 {
	String FirstName;
	int idnum;
	int age;
	String Address;
	char bloodGroup;

	Employee1() {
		FirstName = "MANJUNATH";
		idnum = 313;
		age = 25;
		Address = "HASSAN";
		bloodGroup = 'A';
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

	Department() {
		deptName = "Electrician  Department";
		idnum = 133;
		Hod = "RAJANNA";
		Address = "HASSAN";
		bloodGroup = 'A';
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

	Insurance() {
		Nameofinsurance = "HEATLH INSURANCE";
		age = 25;
		gender = "MALE";
		Healthstatus = "CANCER";
		System.out.println("Nameofinsurance: " + Nameofinsurance);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
		System.out.println("Healthstatus: " + Healthstatus);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}

public class EmployeeMembers {

	public static void main(String[] args) {
		Employee1 obj1 = new Employee1();

		Department obj2 = new Department();

		Insurance obj3 = new Insurance();

	}

}
