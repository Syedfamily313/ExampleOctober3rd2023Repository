package com.sgtesting.parameterized;

class Desktop {
	String DesktopName;
	int Window;
	int Ram;
	int Genration;

	Desktop(String dn,int w,int r,int g) {
		DesktopName = dn;
		Window =w;
		Ram = r;
		Genration = g;
		System.out.println("DesktopName:" + DesktopName);
		System.out.println("Window: " + Window);
		System.out.println(" Ram: " + Ram);
		System.out.println("Genration: " + Genration);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}

class Laptop {
	String laptopName;
	int Window;
	int Ram;
	int Genration;;

	Laptop(String ln,int w,int r, int g) {
		laptopName =ln;
		Window = w;
		Ram =r;
		Genration = g;
		System.out.println("laptopName: " + laptopName);
		System.out.println("Window: " + Window);
		System.out.println("Ram: " + Ram);
		System.out.println("Genration: " + Genration);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}

}

class Mobile {
	String MobileName;
	int partnum;
	String Type;
	String camera;

	Mobile(int pnm,String Mn,String pn,String t,String c) {
		MobileName =Mn;
		partnum = pnm;
		Type = t;
		camera = c;
		System.out.println("MobileName: " + MobileName);
		System.out.println("partnum: " + partnum);
		System.out.println("Type: " + Type);
		System.out.println("camera: " + camera);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}

	public Mobile(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
	}
}

public class DesktopMembers {

	public static void main(String[] args) {
		Desktop obj1 = new Desktop("HP Pavilion Desktop ",11,16,7);

		Laptop obj2 = new Laptop("ASUS Vivobook Ryzen 5",11,16,8);

		Mobile obj3 = new Mobile("Apple unveils iPhone 13 Pro ","iphone"," macro photography ",1662559772);

	}

}
