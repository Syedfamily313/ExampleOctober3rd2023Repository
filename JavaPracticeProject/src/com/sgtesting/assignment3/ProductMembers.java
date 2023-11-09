package com.sgtesting.assignment3;
class Product
{
	String  prtName;
	int partnum;
	int  dateofmanufacturing;
	String Address;
	String Type;
}
class Orders
{
	String prtName;
	int partnum;
	int quantity;
	String Type;

}
class Items
{
	String itmName;
	int partnum;
	String Type;
	int quantity;
}
public class ProductMembers {

	public static void main(String[] args) {
		Product obj1 =new  Product();
		obj1.prtName="DYNAMO BEARING";
		obj1.partnum=112299;
		obj1.dateofmanufacturing=14-10-2023;
		obj1.Address="MADHUGIRI";
		obj1.Type="AUTO";
		System.out.println("prtName:"+ obj1.prtName);
		System.out.println("partnum: "+ obj1.partnum);
		System.out.println(" dateofmanufacturing: "+ obj1.dateofmanufacturing);
		System.out.println("Address: "+ obj1.Address);
		System.out.println("Type: "+ obj1.Type);
		System.out.println("++++++++++++++++++++++++++++++++");
		Orders obj2=new  Orders();
		obj2.prtName="DYNAMO BEARING";
		obj2.partnum=112299;
		obj2.quantity=100;
		obj2.Type="AUTO";
		System.out.println("prtName: "+obj2.prtName);
		System.out.println("partnum: "+obj2.partnum);
		System.out.println("quantity: "+obj2.quantity);
		System.out.println("Type: "+obj2.Type);
		System.out.println("++++++++++++++++++++++++++++++++++");
		Items obj3=new  Items();
		obj3.itmName="DYNAMO KET";
		obj3.partnum=252627;
		obj3.Type="AUTO";
		obj3.quantity=50;
		System.out.println("itmName: "+obj3.itmName);
		System.out.println("partnum: "+obj3.partnum);
		System.out.println("Type: "+obj3.Type);
		System.out.println("quantity: "+obj3.quantity);
		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}

}
