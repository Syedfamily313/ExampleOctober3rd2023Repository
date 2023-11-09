package com.sgtesing.Assignmentpolimorphism6;
abstract class Figure
{
abstract void caliculateArea();	
}
class Sqaure extends Figure
{
 void caliculateArea()
 {
	 int side=5;
	 System.out.println("Area of Square:"+(side * side));
 }
}
class Rectangle extends Figure
{
	void caliculateArea()
	{
		int l,b;
		l=5; b=12;
	System.out.println("Rectangle of Area:"+(l*b));
	}
}
class Circle extends Figure
{
	void caliculateArea()
	{
		double pi=3.14;
		double r=2.5;
		System.out.println("Circle of Area:"+pi*r*r);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Figure figure=null;
		
		Sqaure square=new Sqaure();
		Rectangle rect=new Rectangle();
		Circle cir=new Circle();
		
		figure=square;
		figure.caliculateArea();
		figure=rect;
		figure.caliculateArea();
		figure=cir;
		figure.caliculateArea();
	}

}
