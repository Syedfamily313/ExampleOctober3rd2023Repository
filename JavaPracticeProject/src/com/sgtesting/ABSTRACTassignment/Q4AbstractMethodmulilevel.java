package com.sgtesting.ABSTRACTassignment;
abstract class University1
{
	abstract void showuniversity(String name1);
	abstract void showuniversity1(String name);
}
class University2 extends University1
{
		void showuniversity(String name1) 
		{
		System.out.println("University Name: "+name1);
		
	}
	@Override
	void showuniversity1(String name) {
		System.out.println("University Name: "+name);
		
	}
	void displaycity(String City)
	{
		System.out.println("City:"+City);
	}
}
class University3 extends University2
{
	void university(String name5,String name6)
	{
		System.out.println("unversity3 under college names:"+name5);
		System.out.println("unversity3 under college names:"+name6);
	}
	
	University3(String City)
	{
		super.displaycity(City);
	}
	
}
public class Q4AbstractMethodmulilevel{

	public static  void main(String[] args) {
		University3 u =new University3("TUMKUR");
       u.showuniversity("SIT");
       u.showuniversity1("HMSIT");
       u.university("CIT", "SSIT");
    
	}

}
