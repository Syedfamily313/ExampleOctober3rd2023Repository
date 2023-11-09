package com.sgtesing.Assignmentpolimorphism6;
abstract class Cars
{
	abstract void Speed();
}
class Fortuner extends Cars
{
	void Speed()
	{
		String s="LIMITTED";
		System.out.println("Fortuner Car Speed:"+s);
		System.out.println("++++++++++++++++++++++++++");
	}
}
class Racingcar extends Cars
{
	void Speed()
	{
		String s="HighSpeed";
		System.out.println("Racingcar Speed:"+s);
		System.out.println("****************************");
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Cars cars=null;
		
		Fortuner fort=new Fortuner ();
		Racingcar rac=new Racingcar();
		
		
		cars=fort;
		cars.Speed();
		cars=rac;
		cars.Speed();
         
	}

}
