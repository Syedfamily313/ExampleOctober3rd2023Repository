package com.sgtesting.assignment1;

public class TwoCharArray {

	public static void main(String[] args) {
		char a[][]= {{'a','b','c'},{'d','r','e'},{'m','n','o'},{'l','t','w'}};
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
