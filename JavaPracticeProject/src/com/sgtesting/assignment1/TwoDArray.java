package com.sgtesting.assignment1;

public class TwoDArray {

	public static void main(String[] args) {
	    String a[][]= {{"SYED","NAWAZ","SANTOSH"},{"RAKSHIH","ASHOKA","KISHOR"},{"SUHEL","IMRAN","ALLAUDDIN"}};
         for(int i=0;i<=a.length-1;i++)
         {
        	 for(int j=0; j<=a[i].length-1;j++)
        	 {
        		 System.out.print(a[i][j]+" ");
        	 }
        	 System.out.println();
         }
	}

}
