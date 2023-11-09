package com.sgtesting.assignment2;

public class LongSumArrays {

	public static void main(String[] args) {
		int sum=0;
		long a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.print(sum);
	}
}
