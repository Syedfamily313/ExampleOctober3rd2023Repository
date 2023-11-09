package com.sgtesting.assignment2;

public class StringConcatinatinThreeIntoThree {

	public static void main(String[] args) {
		String b=" ";
	String a[][]= {{"syed","suhel","allauddin"},{"umar","fatah","maiz"},{"sameer","ahad","prabakar"}};
	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<a[i].length; j++)
		{
			b=b+a[i][j];
		}
	}
	System.out.println(b);

	}

}
