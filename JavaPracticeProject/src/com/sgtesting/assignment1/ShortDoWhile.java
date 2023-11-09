package com.sgtesting.assignment1;

public class ShortDoWhile {

	public static void main(String[] args) {
		short arr[]= {10,20,30,40,50,60};
		int y=0;
		do
		{
			System.out.println(arr[y]);
			y++;
		}while(y<=arr.length-1);

	}

}
