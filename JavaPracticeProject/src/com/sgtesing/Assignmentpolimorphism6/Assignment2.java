package com.sgtesing.Assignmentpolimorphism6;
abstract class charactor
{
	abstract void Attitude();
}
class Tiger extends charactor
{
	void Attitude()
	{
		String cha="STRONGEST";
		String hun="Hunting";
		System.out.println("Tiger charactor shows Attitude:"+cha);
		System.out.println("Tiger gathering food on:"+hun);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
class Lion extends charactor
{
	void Attitude()
	{
		String cha="THe King Of Beast";
		String hun="Hunting";
		System.out.println("Lion Charactor shows Attitude:"+cha);
		System.out.println("Lion gathering food on:"+hun);
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		charactor charactor=null;
		
		Tiger tig=new Tiger();
		Lion lio=new Lion();
		
		charactor=tig;
		charactor.Attitude();
		charactor=lio;
		charactor.Attitude();
		
	}

}
