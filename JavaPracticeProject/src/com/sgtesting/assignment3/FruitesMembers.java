package com.sgtesting.assignment3;
class Fruite //scientific classification of grapes 
{
	String FruiteName;
	String Kingdom;
	String Division;
	String Class;
	String Order;
	String Family;
	String genus;
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
}
public class FruitesMembers {

	public static void main(String[] args) {
		Fruite obj1 =new Fruite();
		obj1.FruiteName="GRAPES";
		obj1.Kingdom="PLANTAE";
		obj1.Division="MAGNOLIOPHYTA";
		obj1.Class="MAGNOLIOPSIDA";
		obj1.Order="VIALES";
		obj1.Family="VITACEAE";
		obj1.genus="VITISL";
		System.out.println("FruiteNam:"+ obj1.FruiteName);
		System.out.println("Kingdom: "+ obj1.Kingdom);
		System.out.println("Division: "+ obj1.Division);
		System.out.println("Class: "+ obj1.Class);
		System.out.println("Order: "+ obj1.Order);
		System.out.println("Family: "+ obj1.Family);
		System.out.println("genus: "+ obj1.genus);
		System.out.println("++++++++++++++++++++++++++++++++");
		Flower obj2=new Flower();
		obj2.FlowerName="JASMINE";
		obj2.Kingdom="PLANTAE";
		obj2.Division="TRACHEPHTES";
		obj2.Class="ANGIOSPERMS";
		obj2.Order="LAMIALES";
		obj2.Family="OLEACEAE";
		obj2.genus="JASMINUM";
		System.out.println("FlowerNam:"+ obj2.FlowerName);
		System.out.println("Kingdom: "+ obj2.Kingdom);
		System.out.println("Division: "+ obj2.Division);
		System.out.println("Class: "+ obj2.Class);
		System.out.println("Order: "+ obj2.Order);
		System.out.println("Family: "+ obj2.Family);
		System.out.println("genus: "+ obj2.genus);
		System.out.println("++++++++++++++++++++++++++++++++");
		Vegetable obj3=new Vegetable();
		obj3.VegetableName="CARROT";
		obj3.Kingdom="PLANTAE";
		obj3.Division="TRACHEPHYTES";
		obj3.Class="EUUDICOTS";
		obj3.Order="APIALES";
		obj3.Family="APIACEAE";
		obj3.genus="DAUCUS";
		System.out.println("VegetableNam:"+ obj3.VegetableName);
		System.out.println("Kingdom: "+ obj3.Kingdom);
		System.out.println("Division: "+ obj3.Division);
		System.out.println("Class: "+ obj3.Class);
		System.out.println("Order: "+ obj3.Order);
		System.out.println("Family: "+ obj3.Family);
		System.out.println("genus: "+ obj3.genus);
		System.out.println("++++++++++++++++++++++++++++++++");
	}

}
