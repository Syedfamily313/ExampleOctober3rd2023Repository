package com.sgtesting.assignment2singlearray;

public class SingleDivisibleByFour {

	public static void main(String[] args) {
		int count=0;
	      for(int i=100; i>=50; i--)
	      {
	    	  if(i%4==0)
	    	  {
	    		count++;
	    	  }
	      }
	      System.out.println(count);
	      int a[]=new int[count];
	      int k=0;
	      for(int j=100; j>=50; j--)
	      {
	    	  if(j%4==0)
	    	  {
	    		  a[k]=j;
	    		  k++;
	    	  }
	      }
	      for(int m=a.length-1; m>0; m--)
	      {
	    	  System.out.println(a[m]);
	      }
	}

}
