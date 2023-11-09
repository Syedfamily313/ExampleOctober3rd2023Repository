package com.sgtesting.assignment3;
class Desktop
{
	String  DesktopName;
	int Window;
	int Ram ;
	int Genration;
}
class Laptop
{
	String laptopName;
	int Window;
	int Ram ;
	int Genration;;

}
class Mobile
{
	String MobileName;
	int partnum;
	String Type;
	String camera;
}
public class DesktopMembers {

	public static void main(String[] args) {
		Desktop obj1 =new  Desktop();
		obj1.DesktopName="HP Pavilion Desktop ";
		obj1.Window=11;
		obj1.Ram=16;
		obj1.Genration=7;
		System.out.println("DesktopName:"+ obj1.DesktopName);
		System.out.println("Window: "+ obj1.Window);
		System.out.println(" Ram: "+ obj1.Ram);
		System.out.println("Genration: "+ obj1.Genration);
		System.out.println("++++++++++++++++++++++++++++++++");
		Laptop obj2=new Laptop();
		obj2.laptopName="ASUS Vivobook Ryzen 5";
		obj2.Window=11;
		obj2.Ram=16;
		obj2.Genration=8;
		System.out.println("laptopName: "+obj2.laptopName);
		System.out.println("Window: "+obj2.Window);
		System.out.println("Ram: "+obj2.Ram);
		System.out.println("Genration: "+obj2.Genration);
		System.out.println("++++++++++++++++++++++++++++++++++");
		Mobile obj3=new   Mobile();
		obj3.MobileName="Apple unveils iPhone 13 Pro ";
		obj3.partnum=1662559772;
		obj3.Type="iphone";
		obj3.camera=" macro photography ";
		System.out.println("MobileName: "+obj3.MobileName);
		System.out.println("partnum: "+obj3.partnum);
		System.out.println("Type: "+obj3.Type);
		System.out.println("camera: "+obj3.camera);
		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}

}
