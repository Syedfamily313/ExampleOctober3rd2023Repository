package com.sgtesting.assignment2;

public class DoubleThreeIntoThree2d {

	public static void main(String[] args) {
		double a[][]= {{1.1,2.2,3.3},{4.4,5.5,6.6},{7.7,8.8,9.9}};
		for(int d=a.length-1; d>=0; d--)
		{
			for(int e=a[d].length-1; e>=0; e--)
			{
				System.out.print(a[d][e]+" ");
			}
			System.out.println();
		}

	}

}
