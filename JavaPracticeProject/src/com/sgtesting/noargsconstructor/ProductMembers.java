package com.sgtesting.noargsconstructor;

class Product {
	String prtName;
	int partnum;
	int dateofmanufacturing;
	String Address;
	String Type;

	Product() {
		prtName = "DYNAMO BEARING";
		partnum = 112299;
		dateofmanufacturing = 14 - 10 - 2023;
		Address = "MADHUGIRI";
		Type = "AUTO";
		System.out.println("prtName:" + prtName);
		System.out.println("partnum: " + partnum);
		System.out.println(" dateofmanufacturing: " + dateofmanufacturing);
		System.out.println("Address: " + Address);
		System.out.println("Type: " + Type);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}

class Orders {
	String prtName;
	int partnum;
	int quantity;
	String Type;

	Orders() {
		prtName = "DYNAMO BEARING";
		partnum = 112299;
		quantity = 100;
		Type = "AUTO";
		System.out.println("prtName: " + prtName);
		System.out.println("partnum: " + partnum);
		System.out.println("quantity: " + quantity);
		System.out.println("Type: " + Type);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}

}

class Items {
	String itmName;
	int partnum;
	String Type;
	int quantity;

	Items() {
		itmName = "DYNAMO KET";
		partnum = 252627;
		Type = "AUTO";
		quantity = 50;
		System.out.println("itmName: " + itmName);
		System.out.println("partnum: " + partnum);
		System.out.println("Type: " + Type);
		System.out.println("quantity: " + quantity);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}

public class ProductMembers {

	public static void main(String[] args) {
		Product obj1 = new Product();

		Orders obj2 = new Orders();

		Items obj3 = new Items();

	}

}
