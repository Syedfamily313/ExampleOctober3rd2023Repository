package com.sgtesting.assignment3;
class Country
{
	String CountryName;
	String GeographicalCondition;
	double Countrypapulation;
	String CountryEconamy;
}
class District
{
	String DistrictName;
	String GeographicalCondition;
	double Districtpapulation;
	String DistrictEconamy;
}
class Taluk
{
	String  TalukName;
	String GeographicalCondition;
	double Talukpapulation;
	String  TalukEconamy;
}
public class CountryMembers {

	public static void main(String[] args) {
		Country obj1 =new Country();
		obj1.CountryName="INDIA";
		obj1.GeographicalCondition="RICH IN RAW METRIALS";
		obj1.Countrypapulation=142.86;
		obj1.CountryEconamy="GOOD CAMPARE TO PAKISAN";
		System.out.println("CountryName:"+ obj1.CountryName);
		System.out.println("GeographicalCondition: "+ obj1.GeographicalCondition);
		System.out.println(" papulation: "+ obj1.Countrypapulation);
		System.out.println("CountryEconamy: "+ obj1.CountryEconamy);
		System.out.println("++++++++++++++++++++++++++++++++");
		District obj2=new District();
		obj2.DistrictName="TUMKUR";
		obj2.GeographicalCondition="RICH IN COCONUTS";
		obj2.Districtpapulation=383.000;
		obj2.DistrictEconamy="GOOD";
		System.out.println("DistrictName: "+obj2.DistrictName );
		System.out.println("GeographicalCondition: "+obj2.GeographicalCondition);
		System.out.println("papulation: "+obj2.Districtpapulation);
		System.out.println("DistrictEconamy: "+obj2.DistrictEconamy);
		System.out.println("++++++++++++++++++++++++++++++++++");
		Taluk obj3=new Taluk();
		obj3.TalukName="MADHUGIRI";
		obj3.GeographicalCondition="MNOLITHIC MOUNTAIN";
		obj3.Talukpapulation=39000;
		obj3.TalukEconamy="GOOD";
		System.out.println("TalukName: "+obj3.TalukName);
		System.out.println("GeographicalCondition: "+obj3.GeographicalCondition);
		System.out.println("papulation: "+obj3.Talukpapulation);
		System.out.println("TalukEconamy: "+obj3.TalukEconamy);
		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}

}
