package com.sgtesting.parameterized;

class Product {
	String prtName;
	int partnum;
	int dateofmanufacturing;
	String Address;
	String Type;

	Product(String pn,String ad,String t ,int pt,int dm ) {
		prtName = pn;
		partnum = pt;
		dateofmanufacturing = dm;
		Address = ad;
		Type = t;
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

	Orders(String pn,String t ,int qy,int pt) {
		prtName = pn;
		partnum = pt;
		quantity = qy;
		Type = t;
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

	Items(String in,String t,int pn,int qy) {
		itmName = in;
		partnum = pn;
		Type = t;
		quantity =qy;
		System.out.println("itmName: " + itmName);
		System.out.println("partnum: " + partnum);
		System.out.println("Type: " + Type);
		System.out.println("quantity: " + quantity);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}

public class ProductMembers {

	public static void main(String[] args) {
		Product obj1 = new Product("DYNAMO BEARING","MADHUGIRI", "AUTO",112299,14 - 10 - 2023);

		Orders obj2 = new Orders("DYNAMO BEARING","AUTO",112299,100);

		Items obj3 = new Items("DYNAMO KET","AUTO",252627,50);

	}

}
