package com.sgtesting.assignment4.inhertance;
class Student
{
	Student(String fname)
	{
		System.out.println("First name:"+fname);
	}
	
	Student(int age)
	{
		System.out.println("Age:"+age);
	}
	Student(String address, int rollnum)
	{
		System.out.println("Address:"+address);
		System.out.println("Rollnum:"+rollnum);
	}
}
class Student1 extends Student
{
	String collegename;
	Student1(String fname,String collegename)
	{
		super(fname);
		this.collegename=collegename;
		System.out.println("Collegenmae:"+collegename);
	}
	int idnum;
	Student1(int age,int idnum)
	{
		super(age);
		this.idnum=idnum;
		System.out.println("Idnum:"+idnum);
	}
	String collegeaddress;
	Student1(String address,int rollnum,String collegeaddress)
	{
		super(address,rollnum);
		this.collegeaddress=collegeaddress;
		System.out.println("Collegeaddress:"+collegeaddress);
	}
}
class Student2 extends Student1
{
	String sportname;
	Student2(String fname,String collegename,String sportname)
	{
		super(fname,collegename);
		this.sportname=sportname;
		System.out.println("Sportname:"+sportname);
	}
	int teamnum;
	Student2(int age,int idnum,int teamnum)
	{
		super(age,idnum);
		this.teamnum=teamnum;
		System.out.println("Teamnum:"+teamnum);
	}
	String sportsgroundname;
	Student2(String address,int rollnum,String collegeaddress,String sportgroundname)
	{
		super(address,rollnum,collegeaddress);
		this.sportsgroundname=sportgroundname;
		System.out.println("Sportgroundname:"+sportgroundname);
	}
}
public class Q5MultilevelOverloadingInheriance {

	public static void main(String[] args) {
		Student2 s = new Student2("SYED MOHIUDDIN", "SG SOFTWAREINSTITUTE", "KABBADI");
		Student2 s1=new Student2(25, 055, 133);
		Student2 s2=new Student2("BANGLORE", 123, "ATTIGUPPE", "APJABDULKALAM");
	}

}
