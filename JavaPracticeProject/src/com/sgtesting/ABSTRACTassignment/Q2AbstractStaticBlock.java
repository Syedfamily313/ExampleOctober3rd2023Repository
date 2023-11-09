package com.sgtesting.ABSTRACTassignment;
abstract class Team
{
	static
	{
		System.out.println("Team playing kabbadi");
	}
}
class Player extends Team
{
	
}
public class Q2AbstractStaticBlock {

	public static void main(String[] args) {
		Player p=new Player();

	}

}
