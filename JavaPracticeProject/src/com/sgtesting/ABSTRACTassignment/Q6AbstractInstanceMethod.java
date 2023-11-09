package com.sgtesting.ABSTRACTassignment;
abstract class Test
{
	void test()
	{
		System.out.println("calling insance method");
	}
}
class Test1 extends Test
{
	
}
public class Q6AbstractInstanceMethod {

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.test();

	}

}
