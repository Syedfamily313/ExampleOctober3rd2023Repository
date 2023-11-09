package com.sgtesting.assignment4.inhertance;
class University01
{
	void university(String name1,String name2)
	{
		System.out.println("unversity under college names:"+name1);
		System.out.println("unversity under college names:"+name2);
	}
}
class University02 extends University01
{
	void university1(String name3,String name4)
	{
		System.out.println("unversity2 under college names:"+name3);
		System.out.println("unversity2 under college names:"+name4);
	}
}
class University03 extends University02
{
	void university2(String name5,String name6)
	{
		System.out.println("unversity3 under college names:"+name5);
		System.out.println("unversity3 under college names:"+name6);
	}
}
public class Q2HirechalInheritance {

	public static  void main(String[] args) {
		University03 u =new University03();
       u.university("SIT", "HMS");
       u.university2("CIT", "IIT");
       
       University02 u1 =new University02();
       u1.university("SMES", "EWIT");
       u1.university1("SSIT", "HMSIT");
	}

}
