package com.sgtesting.practiceprogramms;

public class Practicefactorialjavaprgm {

	public static void main(String[] args) {
		 int num=Integer.parseInt(args[0]);
         int fct=1;
         for(int i=1;i<=num;i++)
         {
         	fct*=i;
         }
           System.out.println(fct);
	}
}
