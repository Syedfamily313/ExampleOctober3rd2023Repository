package com.sgtesting.ABSTRACTassignment;
abstract class Person
{
	void person(String name)
	{
		System.out.println("Person name:"+name);
	}
	void person(int age)
	{
		System.out.println("Person Age:"+age);
	}
	void person1(int phonenumber)
	{
		System.out.println("Person PhoneNumber:"+phonenumber);
	}
}
class Person1 extends Person
{
	void person1(String name)
	{
		System.out.println("Person1 name:"+name);
	}
	void person1(int age)
	{
		System.out.println("Person age:"+age);
	}
   void	 person11(int phonenumber)
	{
		System.out.println("Person Phonenumber:"+phonenumber);
	}
}
class Person2 extends Person
{
	void person2(String name)
	{
		System.out.println("Person1 name:"+name);
	}
	void person2(int age)
	{
		System.out.println("Person age:"+age);
	}
	 void person1(int phonenumber)
	{
		System.out.println("Person PhoneNumber:"+phonenumber);
	}
	
}
class Person3 extends Person2
{
	void person2(String name)
	{
		System.out.println("Person1 name:"+name);
	}
	void person2(int age)
	{
		System.out.println("Person age:"+age);
	}
	 void person1(int phonenumber)
	{
		System.out.println("Person PhoneNumber:"+phonenumber);
	}	
}
public class Q5AbstractHybridInheritance {

	public static void main(String[] args) {
		Person1 p=new Person1();
		p.person("Ibrahim lodi");
		p.person(30);
		p.person1(53355566);
		p.person1("Akbar");
		p.person1(50);
		p.person11(366666555);
	System.out.println("++++++++++++++++++++++++++++++++++++");
	Person3 p1=new Person3();
	p1.person("Ibrahim lodi");
	p1.person(30);
	p1.person1(53355566);
	p1.person2("Pruthviraj chowhan");
	p1.person2(30);
	}
}
