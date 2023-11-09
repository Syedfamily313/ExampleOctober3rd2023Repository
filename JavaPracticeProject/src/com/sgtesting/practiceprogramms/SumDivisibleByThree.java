package com.sgtesting.practiceprogramms;

public class SumDivisibleByThree {

	public static void main(String[] args) {
	       int sum=0;
	     for(int i=300; i<=600;i++)
	     {
	    		 if(i%3==0) {
	    			 sum+=i;
	    			 
	    		 }
	    	 }
	     System.out.println("total sum of divisible number is :-"+sum);
	     }
	}


