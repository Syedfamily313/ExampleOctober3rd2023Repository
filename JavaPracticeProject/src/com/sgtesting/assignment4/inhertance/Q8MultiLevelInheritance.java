package com.sgtesting.assignment4.inhertance;
class Grandparent12
{
	void displayinfo(String name)
	{
		System.out.println("Grandparent Name is: "+name);
	}
}

class Parent12 extends Grandparent12
{
	Parent12(String name)
	{
		super.displayinfo(name);
	}
	
	void displayinfo(String name)
	{
		System.out.println("Parent name: "+name);
	}
}

class Child12 extends Parent12
{
	Child12(String name,String name1)
	{
		super(name); 
		super.displayinfo(name1);
	}
	
	void displayinfo(String name)
	{
		System.out.println("Child12 Name: "+name);
	}
}

public class Q8MultiLevelInheritance {

	public static void main(String[] args) {
		Child12 c=new Child12("Ashoka", "Nagaraj");
		c.displayinfo("Ravi");
	}

}

