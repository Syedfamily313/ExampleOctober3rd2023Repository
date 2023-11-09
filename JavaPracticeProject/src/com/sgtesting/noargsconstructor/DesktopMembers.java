package com.sgtesting.noargsconstructor;

class Desktop {
	String DesktopName;
	int Window;
	int Ram;
	int Genration;

	Desktop() {
		DesktopName = "HP Pavilion Desktop ";
		Window = 11;
		Ram = 16;
		Genration = 7;
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

	Laptop() {
		laptopName = "ASUS Vivobook Ryzen 5";
		Window = 11;
		Ram = 16;
		Genration = 8;
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

	Mobile() {
		MobileName = "Apple unveils iPhone 13 Pro ";
		partnum = 1662559772;
		Type = "iphone";
		camera = " macro photography ";
		System.out.println("MobileName: " + MobileName);
		System.out.println("partnum: " + partnum);
		System.out.println("Type: " + Type);
		System.out.println("camera: " + camera);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}

public class DesktopMembers {

	public static void main(String[] args) {
		Desktop obj1 = new Desktop();

		Laptop obj2 = new Laptop();

		Mobile obj3 = new Mobile();

	}

}
