package com.sgtesting.Returnvalues;
class demo
{
  boolean primenumber(int num)
  {
	  boolean result=false;
	  int flag=0;
	  for(int i=2; i<num; i++)
	  {
		  if(num%i==0)
		  {
			  flag+=1;
			  break;
		  }
	  }
	  if(flag==0)
	  {
		 result=true;
	  }
		  return result;
	  }
  }

public class MethodsPractice {

	public static void main(String[] args) {
		demo p =new demo();
		boolean v1=p.primenumber(5);
		System.out.println(v1);
		boolean v2=p.primenumber(7);
		System.out.println(v2);
	}

}
