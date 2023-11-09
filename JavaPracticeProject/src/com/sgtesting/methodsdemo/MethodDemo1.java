package com.sgtesting.methodsdemo;
class Demo1
{
	void show()
	{
		int num=4;
		int fct=1;
		for(int i=num; i>=1; i--)
		{
			fct=fct*i;
	}
		System.out.println("factorial resul:"+num +" is "+fct);
	}
}
public class MethodDemo1 {

	public static void main(String[] args) {
		Demo1 o=new Demo1();
		o.show();
   }
}

