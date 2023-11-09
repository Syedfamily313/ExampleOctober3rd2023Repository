package com.sgtesting.assignment1;

public class FloatSecondHalf {

	public static void main(String[] args) {
		float arr[]= {1.1f,2.2f,3.3f,4.4f,5.5f,6.6f};
		int f=arr.length/2;
		while(f<=arr.length-1)
		{
			System.out.println(arr[f]);
			f++;
		}

	}

}
