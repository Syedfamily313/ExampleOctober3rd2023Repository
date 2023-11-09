package com.sgtesting.constractoroverloading;

class University
{
	University(String universityname)
	{
		System.out.println("Universityname:"+ universityname);
	}
	University(String principalname,double salary)
	{
		System.out.println("Principalname:"+principalname);
		System.out.println("Salary:"+salary);
	}
	University(String address,int pincode)
	{
		System.out.println("Address:"+address);
		System.out.println("Pincode:"+pincode);
	}
}
public class UniversityDemo {

	public static void main(String[] args) {
		University O1 =new University("EAST WEST INSITITUTE OF TECHNOLOGY");
		University O2 =new University("SYED MOHIUDDIN",100000.01);
		University O3 =new University("ANJANA NAGAR",572132);
	}

}
