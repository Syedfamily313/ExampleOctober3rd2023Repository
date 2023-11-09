package com.sgtesting.assignment2;

public class CharactorDoWhile {

	public static void main(String[] args) {
		char a[][]= {{'s','y','e'},{'d','m','a'}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(a[i][j]+" ");
				j++;
			}while(j<a[i].length);
			System.out.println();
			i++;
		}while(i<a.length);

	}

}
