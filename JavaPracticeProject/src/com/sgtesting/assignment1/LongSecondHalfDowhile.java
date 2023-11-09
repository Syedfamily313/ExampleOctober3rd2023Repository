package com.sgtesting.assignment1;

public class LongSecondHalfDowhile {

	public static void main(String[] args) {
		long arr[]= {100,200,300,400,500,600,700,800,900,1000};
		int x=arr.length/2;
		do
		{
			System.out.println(arr[x]);
			x++;
		}while(x<=arr.length-1);

	}

}
