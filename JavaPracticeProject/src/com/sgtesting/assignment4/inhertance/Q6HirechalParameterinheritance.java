package com.sgtesting.assignment4.inhertance;
class Asus
{
	Asus(String name,String place)
	 {
		 System.out.println("Name is:"+name);
		 System.out.println("Place is:"+place); 
	 }
}
class Asus1 extends Asus
{
	String charactor;
	Asus1(String name,String place,String charactor)
	{
		super(name, place);
	this.charactor=charactor;
	System.out.println("Charactor:"+charactor);
		
	}
}
class Asus2 extends Asus
{
	int idnum;
	Asus2(String name,String place, int idnum)
	{
		super(name,place);
		this.idnum=idnum;
		System.out.println("IdNum:"+idnum);
	}
	
}
 public class Q6HirechalParameterinheritance {

	public static void main(String[] args) {
		Asus2 o=new Asus2 ("SYED MHIUDDIN", "BANGLORE",123);
		System.out.println("++++++++++++++++++++++++++++++++");
		Asus1 o1=new Asus1("SYED MHIUDDIN", "BANGLORE","GOODCHARACTOR");
	}

}

