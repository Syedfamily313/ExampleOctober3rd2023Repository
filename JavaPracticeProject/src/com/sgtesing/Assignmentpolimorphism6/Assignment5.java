package com.sgtesing.Assignmentpolimorphism6;
abstract class Work
{
	abstract void occupation();
}
class FourWheelerMechanic extends Work
{
	void occupation() {
		String name="Abbas";
		int age=40;
		String e="20years";
		System.out.println("FourWheelerMechanic Name:"+name);
		System.out.println("FourWheelerMechanic Age:"+age);
		System.out.println("FourWheelerMechanic Experiance:"+e);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
	}
}
class TwoWheelerMechanic extends Work
{
	void occupation()
	{
		String name="MANSUR";
		int age=30;
		String em="5years";
		System.out.println("TwoWheelerMechanic Name:"+name);
		System.out.println("TwoWheelerMechanic Age:"+age);
		System.out.println("TwoWheelerMechanic Experiance:"+em);
		System.out.println("*****************************");
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		Work work=null;
		
		FourWheelerMechanic f=new FourWheelerMechanic();
		TwoWheelerMechanic w1=new TwoWheelerMechanic();
		
		work=f;
		work.occupation();
		work=w1;
		work.occupation();

	}

}
