package com.sgtesting.assignment4.inhertance;
class Maths1
{
	void addition(double x,double y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}
class Maths2 extends Maths1
{
	void substration(double a,double b)
	{
		System.out.println("Substration Result:"+(a-b));
	}
}
class Maths3 extends Maths1
{
	void division(double d,double f)
	{
		System.out.println("Division Result:"+(d/f));
	}
}
class Maths4 extends Maths3
{
	void muliplication(double x,double y)
	{
		System.out.println("Muliplication Result:"+(x*y));
	}
}
public class Q3HybridInheritance {

	public static void main(String[] args) {
		Maths2 b=new Maths2();
		b.addition(5.1, 10.4);
		b.substration(10.5, 5.5);
	   

		Maths4 b2=new Maths4();
		b2.addition(2.2, 3.3);
		b2.muliplication(25.0, 5.0);
		b2.division(125.0, 25.0);
		
	}

}
