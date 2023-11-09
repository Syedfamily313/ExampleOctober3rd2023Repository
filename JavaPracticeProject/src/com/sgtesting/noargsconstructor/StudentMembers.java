package com.sgtesting.noargsconstructor;

class Student {
	String FirstName;
	int idnum;
	int age;
	String Address;
	char bloodGroup;

	Student() {
		FirstName = "SYED MOHIUDDIN";
		idnum = 313;
		age = 25;
		Address = "BANGALURU";
		bloodGroup = 'A';
		System.out.println("FirstName:" + FirstName);
		System.out.println("idnum: " + idnum);
		System.out.println(" age: " + age);
		System.out.println("Address: " + Address);
		System.out.println("bloodGroup: " + bloodGroup);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}

class Library {
	String bookName;
	int stdidnum;
	String authour;
	String attender;

	Library() {
		bookName = "POLITY";
		stdidnum = 313;
		authour = "LAKSHMIKANTH";
		attender = "ALLAUDDIN";
		System.out.println("bookName: " + bookName);
		System.out.println("stdidnum: " + stdidnum);
		System.out.println("authour: " + authour);
		System.out.println("attende: " + attender);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}

class Sports {
	String Nameofgame;
	int teamnum;
	String teamcaptain;
	String gamestatus;

	Sports() {
		Nameofgame = "KABBADI";
		teamnum = 01;
		teamcaptain = "SYED MOHIUDDIN";
		gamestatus = "WIN";
		System.out.println("Nameofgame: " + Nameofgame);
		System.out.println("teamnum: " + teamnum);
		System.out.println("teamcaptain: " + teamcaptain);
		System.out.println("gamestatus: " + gamestatus);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}

public class StudentMembers {

	public static void main(String[] args) {
		Student obj1 = new Student();

		Library obj2 = new Library();

		Sports obj3 = new Sports();

	}

}
