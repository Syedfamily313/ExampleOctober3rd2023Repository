package com.sgtesting.constractoroverloading;
class Collage
{
	Collage(String collagename)
	{
		System.out.println("Collagename:"+collagename);
	}
	Collage(String principalname,double salary)
	{
		System.out.println("Principalname:"+principalname);
		System.out.println("Salary:"+salary);
	}
	Collage(String address,int pincode)
	{
		System.out.println("Address:"+address);
		System.out.println("Pincode:"+pincode);
	}
}
public class CollageDemo {

	public static void main(String[] args) {
		Collage o1 =new Collage("H.M.S INSITITUTE OF TECHNOLOGY");
		Collage O2 =new Collage("RAHAMAHULLA KHAN",50000.5);
		Collage O3 =new Collage("SHATTYHALLI TUMKUR",57212);
		

	}

}
