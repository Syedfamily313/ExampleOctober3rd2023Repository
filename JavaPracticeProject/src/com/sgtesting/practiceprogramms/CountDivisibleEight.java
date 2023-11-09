package com.sgtesting.practiceprogramms;

public class CountDivisibleEight {

	public static void main(String[] args) {
		int count=0;
		int i=500;
		do
		{
			if(i%8==0)
			{
				count++;
			System.out.println(count);
			}
			i++;
		}while(i<=800);
		
	}

}
