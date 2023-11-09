package com.sgtesting.assignment4.inhertance;
class University1
{
	void university(String name1,String name2)
	{
		System.out.println("unversity under college names:"+name1);
		System.out.println("unversity under college names:"+name2);
	}
}
class University2 extends University1
{
	void university1(String name3,String name4)
	{
		System.out.println("unversity2 under college names:"+name3);
		System.out.println("unversity2 under college names:"+name4);
	}
}
class University3 extends University2
{
	void university2(String name5,String name6)
	{
		System.out.println("unversity3 under college names:"+name5);
		System.out.println("unversity3 under college names:"+name6);
	}
}
public class Q1MultiLevelInheritance {

	public static  void main(String[] args) {
		University3 u =new University3();
       u.university("SIT", "HMS");
       u.university1("SSIT", "HMSIT");
       u.university2("CIT", "IIT");
	}

}
