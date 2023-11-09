package com.sgtesing.Assignmentpolimorphism6;
abstract class About
{
	abstract void TestinFood();
}
class Beryani extends  About
{
	void TestinFood() {
	}
	{
		String test="SPICY";
		String and="CHICKEN LEG PICE";
		System.out.println("Beryani Test:"+test);
		System.out.println("Beryani With:"+and);
	}
}
class jammun extends  About
{
	void TestinFood() 
	{
		String test="SWEET";
		System.out.println("jammun Test:"+test);
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		About about =null;
		
		Beryani ber=new Beryani();
		jammun  jam=new jammun ();
		
		about=ber;
		about.TestinFood();
		about=jam;
		about.TestinFood();
	}

}
