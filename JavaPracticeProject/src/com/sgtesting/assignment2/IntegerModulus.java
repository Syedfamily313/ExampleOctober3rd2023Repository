package com.sgtesting.assignment2;

public class IntegerModulus {

	public static void main(String[] args) {
		Integer a[][]= {{10,21,30},{41,50,60},{70,80,91}};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]%2+" ");
			}
			System.out.println();
		}
	}

}
