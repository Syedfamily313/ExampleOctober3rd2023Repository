package com.sgtesting.ABSTRACTassignment;
abstract class Office
{
	Office(String name,String place, String charactor)
	 {
		 System.out.println("Name is:"+name);
		 System.out.println("Place is:"+place); 
	 }
}
class Office1 extends Office
{
	String charactor;
	Office1(String name,String place,String charactor)
	{
		super(name, place, charactor);
	this.charactor=charactor;
	System.out.println("Charactor:"+charactor);
		
	}
}
class Office2 extends Office1
{
	int idnum;
	Office2(String name,String place,String charactor, int idnum)
	{
		super(name,place, charactor);
		this.idnum=idnum;
		System.out.println("IdNum:"+idnum);
	}
	
}
public class Q3AbstractMultilevelInherianceparameterized {

	public static void main(String[] args) {
		Office2 o=new Office2 ("MA SHA ALLAH","MADHUGIRI","GOODCHARACTOR",313);
	}

}

