package com.sgtesting.assignment2;

public class BytewhileThreeIntoThree {

	public static void main(String[] args) {
		byte a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int b=0;
		while(b<a.length)
		{
			int d=0;
			while(d<a[b].length)
			{
				System.out.print(a[b][d]+" ");
				d++;
			}
			System.out.println();
			b++;
		}

	}

}
