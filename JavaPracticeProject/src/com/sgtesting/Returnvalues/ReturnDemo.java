package com.sgtesting.Returnvalues;
class Maths
{
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	int multi(int a,int b)
	{
		int c=a*b;
		return c;
	}
}
public class ReturnDemo {
	public static void main(String[] args) {
		Maths o=new Maths();
		int x=o.add(20, 80);
		int y= o.sub(100, 80);
		int z=o.multi(20, 2);
		System.out.println(x);
		System.out.println(y);
        System.out.println(z);
	}

}
