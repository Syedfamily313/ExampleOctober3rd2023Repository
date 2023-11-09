package com.sgtesting.assignment3;
class Student
{
	String  FirstName;
	int idnum;
	int  age;
	String Address;
	char bloodGroup;
}
class Library
{
	String bookName;
	int stdidnum;
	String authour;
	String attender;
}
class Sports
{
	String Nameofgame;
	int teamnum;
	String teamcaptain;
	String gamestatus;
}

public class StudentMembers {

	public static void main(String[] args) {
		Student obj1 =new Student();
		obj1.FirstName="SYED MOHIUDDIN";
		obj1.idnum=313;
		obj1.age=25;
		obj1.Address="BANGALURU";
		obj1.bloodGroup='A';
		System.out.println("FirstName:"+ obj1.FirstName);
		System.out.println("idnum: "+ obj1.idnum);
		System.out.println(" age: "+ obj1.age);
		System.out.println("Address: "+ obj1.Address);
		System.out.println("bloodGroup: "+ obj1.bloodGroup);
		System.out.println("++++++++++++++++++++++++++++++++");
		Library obj2=new Library();
		obj2.bookName="POLITY";
		obj2.stdidnum=313;
		obj2.authour="LAKSHMIKANTH";
		obj2.attender="ALLAUDDIN";
		System.out.println("bookName: "+obj2.bookName);
		System.out.println("stdidnum: "+obj2.stdidnum);
		System.out.println("authour: "+obj2.authour);
		System.out.println("attende: "+obj2.attender);
		System.out.println("++++++++++++++++++++++++++++++++++");
		Sports obj3=new Sports();
		obj3.Nameofgame="KABBADI";
		obj3.teamnum=01;
		obj3.teamcaptain="SYED MOHIUDDIN";
		obj3.gamestatus="WIN";
		System.out.println("Nameofgame: "+obj3.Nameofgame);
		System.out.println("teamnum: "+obj3.teamnum);
		System.out.println("teamcaptain: "+obj3.teamcaptain);
		System.out.println("gamestatus: "+obj3.gamestatus);
		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}

}
