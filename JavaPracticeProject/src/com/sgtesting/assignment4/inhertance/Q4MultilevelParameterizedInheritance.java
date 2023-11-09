package com.sgtesting.assignment4.inhertance;
class Employee
{
	 Employee(String name,String place)
	 {
		 System.out.println("Name is:"+name);
		 System.out.println("Place is:"+place); 
	 }
}
class Employee1 extends Employee
{
	String charactor;
	Employee1(String name,String place,String charactor)
	{
		super(name, place);
	this.charactor=charactor;
	System.out.println("Charactor:"+charactor);
		
	}
}
class Employee2 extends Employee1
{
	int idnum;
	Employee2(String name,String place,String charactor, int idnum)
	{
		super(name,place, charactor);
		this.idnum=idnum;
		System.out.println("IdNum:"+idnum);
	}
	
}
public class Q4MultilevelParameterizedInheritance {

	public static void main(String[] args) {
		Employee2 o=new Employee2 ("SYED","MADHUGIRI","GOODCHARACTOR",313);
	}

}
