package com.sgtesting.constractoroverloading;

class Examination
{
	Examination(String examname)
	{
		System.out.println("Examname:"+examname);
	}
	Examination(String Studentname,int idnumber)
	{
		System.out.println("Studentname:"+Studentname);
		System.out.println("IdNumber:"+idnumber);
	}
	Examination(long phonenumber,String nationality)
	{
		System.out.println("Nationality:"+nationality);
		System.out.println("Phonenumber:"+phonenumber);
	}
}
public class ExaminationDemo {

	public static void main(String[] args) {
		Examination o1 =new Examination("INDIAN ADMINSTRATIVE SERVICE");
		Examination O2 =new Examination("SYED MOHIUDDIN",123098);
		Examination o3 =new Examination(861817171, "INDIAN");

	}

}
