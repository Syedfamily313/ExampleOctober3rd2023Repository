package com.sgtesting.parameterized;
class Fruite //scientific classification of grapes 
{
	String FruiteName;
	String Kingdom;
	String Division;
	String Class;
	String Order;
	String Family;
	String genus;
	Fruite(String fn,String km,String dn,String cs,String fy,String gs,String or)
	{
		FruiteName=fn;
		Kingdom=km;
		Division=dn;
		Class=cs;
		Order=or;
		Family=fy;
		genus=gs;
		System.out.println("FruiteNam:"+ FruiteName);
		System.out.println("Kingdom: "+ Kingdom);
		System.out.println("Division: "+ Division);
		System.out.println("Class: "+ Class);
		System.out.println("Order: "+ Order);
		System.out.println("Family: "+ Family);
		System.out.println("genus: "+genus);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}
class Flower //scientific classification of JASMINE
{
	String FlowerName;
	String Kingdom;
	String Division;
	String Class;
	String Order;
	String Family;
	String genus;
	Flower(String fn,String km,String dn,String cs,String fy,String gs,String or)
	{
		FlowerName=fn;
		Kingdom=km;
		Division=dn;
		Class=cs;
		Order=or;
		Family=fy;
		genus=gs;
		System.out.println("FlowerNam:"+ FlowerName);
		System.out.println("Kingdom: "+ Kingdom);
		System.out.println("Division: "+ Division);
		System.out.println("Class: "+ Class);
		System.out.println("Order: "+ Order);
		System.out.println("Family: "+ Family);
		System.out.println("genus: "+ genus);
		System.out.println("++++++++++++++++++++++++++++++++");	
	}
}
class Vegetable //scientific classification of CARROT
{
	String VegetableName;
	String Kingdom;
	String Division;
	String Class;
	String Order;
	String Family;
	String genus;
	Vegetable(String vn,String km,String dn,String cs,String fy,String gs,String or)
	{
		VegetableName=vn;
		Kingdom=km;
		Division=dn;
		Class=cs;
		Order=or;
		Family=fy;
		genus=gs;
		System.out.println("VegetableNam:"+ VegetableName);
		System.out.println("Kingdom: "+ Kingdom);
		System.out.println("Division: "+ Division);
		System.out.println("Class: "+ Class);
		System.out.println("Order: "+ Order);
		System.out.println("Family: "+ Family);
		System.out.println("genus: " + genus);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}
public class FruitesMembers {

	public static void main(String[] args) {
		Fruite obj1 =new Fruite("GRAPES","PLANTAE","MAGNOLIOPHYTA","MAGNOLIOPSIDA","VIALES","VITACEAE","VITISL");
	
		Flower obj2=new Flower("JASMINE","PLANTAE","TRACHEPHTES","ANGIOSPERMS","LAMIALES","OLEACEAE","JASMINUM");
		
		Vegetable obj3=new Vegetable("CARROT","PLANTAE","TRACHEPHYTES","EUUDICOTS","APIALES","APIACEAE","DAUCUS");
		
	}

}
