package com.sgtesting.noargsconstructor;

class Country {
	String CountryName;
	String GeographicalCondition;
	double Countrypapulation;
	String CountryEconamy;

	Country() {
		CountryName = "INDIA";
		GeographicalCondition = "RICH IN RAW METRIALS";
		Countrypapulation = 142.86;
		CountryEconamy = "GOOD CAMPARE TO PAKISAN";
		System.out.println("CountryName:" + CountryName);
		System.out.println("GeographicalCondition: " + GeographicalCondition);
		System.out.println(" papulation: " + Countrypapulation);
		System.out.println("CountryEconamy: " + CountryEconamy);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}

class District {
	String DistrictName;
	String GeographicalCondition;
	double Districtpapulation;
	String DistrictEconamy;

	District() {
		DistrictName = "TUMKUR";
		GeographicalCondition = "RICH IN COCONUTS";
		Districtpapulation = 383.000;
		DistrictEconamy = "GOOD";
		System.out.println("DistrictName: " + DistrictName);
		System.out.println("GeographicalCondition: " + GeographicalCondition);
		System.out.println("papulation: " + Districtpapulation);
		System.out.println("DistrictEconamy: " + DistrictEconamy);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}

class Taluk {
	String TalukName;
	String GeographicalCondition;
	double Talukpapulation;
	String TalukEconamy;

	Taluk() {
		TalukName = "MADHUGIRI";
		GeographicalCondition = "MNOLITHIC MOUNTAIN";
		Talukpapulation = 39000;
		TalukEconamy = "GOOD";
		System.out.println("TalukName: " + TalukName);
		System.out.println("GeographicalCondition: " + GeographicalCondition);
		System.out.println("papulation: " + Talukpapulation);
		System.out.println("TalukEconamy: " + TalukEconamy);
		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}
}

public class CountryMembers {

	public static void main(String[] args) {
		Country obj1 = new Country();

		District obj2 = new District();

		Taluk obj3 = new Taluk();

	}

}
