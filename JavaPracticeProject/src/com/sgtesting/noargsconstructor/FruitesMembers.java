package com.sgtesting.noargsconstructor;
class Fruite //scientific classification of grapes 
{
	String FruiteName;
	String Kingdom;
	String Division;
	String Class;
	String Order;
	String Family;
	String genus;
	Fruite()
	{
		FruiteName="GRAPES";
		Kingdom="PLANTAE";
		Division="MAGNOLIOPHYTA";
		Class="MAGNOLIOPSIDA";
		Order="VIALES";
		Family="VITACEAE";
		genus="VITISL";
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
	Flower()
	{
		FlowerName="JASMINE";
		Kingdom="PLANTAE";
		Division="TRACHEPHTES";
		Class="ANGIOSPERMS";
		Order="LAMIALES";
		Family="OLEACEAE";
		genus="JASMINUM";
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
	Vegetable()
	{
		VegetableName="CARROT";
		Kingdom="PLANTAE";
		Division="TRACHEPHYTES";
		Class="EUUDICOTS";
		Order="APIALES";
		Family="APIACEAE";
		genus="DAUCUS";
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
		Fruite obj1 =new Fruite();
	
		Flower obj2=new Flower();
		
		Vegetable obj3=new Vegetable();
		
	}

}
