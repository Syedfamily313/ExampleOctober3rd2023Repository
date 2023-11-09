package com.sgtesing.Assignmentpolimorphism6;
abstract class Vehicle 
{
	abstract void TransportSystem();
}
class Truck extends Vehicle 
{
	void TransportSystem()
	{
	 String s="Road Lines";
	 System.out.println("Truck Transport on:"+s);
	 System.out.println("+++++++++++++++++++++++");
	}
}
class Ship extends Vehicle 
{
	void TransportSystem()
	{
		String s="Sea Rute";
		System.out.println("Ship Transport On:"+s);
		System.out.println("##############################");
	}
}
class AiroPlane extends Vehicle 
{
	void TransportSystem()
	{
		String s="Air line";
		System.out.println("AiroPlane Transport On:"+s);
		System.out.println("***************************");
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Vehicle vehicle =null;
		
		Truck ruk=new Truck ();
		Ship sh=new Ship();
		AiroPlane ap=new AiroPlane();
		
		vehicle=ruk;
		vehicle.TransportSystem();
		vehicle=sh;
		vehicle.TransportSystem();
		vehicle=ap;
		vehicle.TransportSystem();
		

	}

}
