package com.sgtesting.assignment4.inhertance;
class College
{
	 College(String name,String place)
	 {
		 System.out.println("Name is:"+name);
		 System.out.println("Place is:"+place); 
	 }
}
class  College1 extends  College
{
	String charactor;
	 College1(String name,String place,String charactor)
	{
		super(name, place);
	this.charactor=charactor;
	System.out.println("Charactor:"+charactor);
		
	}
}
class  College2 extends  College
{
	int idnum;
	 College2(String name,String place,String charactor, int idnum)
	{
		super(name,place);
		this.idnum=idnum;
		System.out.println("IdNum:"+idnum);
	}
	
}
class  College3 extends  College2
{
	String unversityname;
	 College3(String name,String place,String charactor,String unversityname, int idnum)
	 {
		super(name,place,charactor,idnum);
		this.unversityname=unversityname;
		System.out.println("UniversityName:"+unversityname);
	 }
}
public class Q7HybridOverloadingInheritance {

	public static void main(String[] args) {
		College1 o=new College1 ("EWIT","BANGLORE","GOODCHARACTOR");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		College3 o1=new College3("EWIT","BANGLORE","GOODCHARACTOR","VTU",313);
	}

}
