package com.sgtesting.parameterized;

class Student {
	String FirstName;
	int idnum;
	int age;
	String Address;
	char bloodGroup;

	Student(String fn,String ad,char bd, int in,int ag) {
		FirstName = fn;
		idnum = in;
		age = ag;
		Address = ad;
		bloodGroup = bd;
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

	Library(String bn,String ar,String ad,int sn) {
		bookName = bn;
		stdidnum = sn;
		authour = ar;
		attender = ad;
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

	Sports(String ng,String tc,String gs,int tn) {
		Nameofgame = ng;
		teamnum = tn;
		teamcaptain = tc;
		gamestatus =gs;
		System.out.println("Nameofgame: " + Nameofgame);
		System.out.println("teamnum: " + teamnum);
		System.out.println("teamcaptain: " + teamcaptain);
		System.out.println("gamestatus: " + gamestatus);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}

public class StudentMembers {

	public static void main(String[] args) {
		Student obj1 = new Student("SYED MOHIUDDIN","BANGALURU",'A',313,25);

		Library obj2 = new Library("POLITY","LAKSHMIKANTH","ALLAUDDIN",313);

		Sports obj3 = new Sports("KABBADI","SYED MOHIUDDIN","WIN",01);

	}

}
