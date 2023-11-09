package com.sgtesting.parameterized;

class Country {
	String CountryName;
	String GeographicalCondition;
	double Countrypapulation;
	String CountryEconamy;

	Country(String cn,String gc, String ec, double cp) {
		CountryName = cn;
		GeographicalCondition = gc;
		Countrypapulation = cp;
		CountryEconamy = ec;
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

	District( String dn, String gc, String ec, double cp) {
		DistrictName = dn;
		GeographicalCondition = gc;
		Districtpapulation =cp;
		DistrictEconamy = ec;
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

	Taluk(String tn, String gc, String te,double tp  ) {
		TalukName = tn;
		GeographicalCondition = gc;
		Talukpapulation = tp;
		TalukEconamy = te;
		System.out.println("TalukName: " + TalukName);
		System.out.println("GeographicalCondition: " + GeographicalCondition);
		System.out.println("papulation: " + Talukpapulation);
		System.out.println("TalukEconamy: " + TalukEconamy);
		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}
}

public class CountryMembers {

	public static void main(String[] args) {
		Country obj1 = new Country( "INDIA","RICH IN RAW METRIALS","GOOD COMPARE TO PAKISTAN",142.86);

		District obj2 = new District("TUMKUR","RICH IN COCONUTS", "GOOD",383.000);

		Taluk obj3 = new Taluk("MADHUGIRI","MNOLITHIC MOUNTAIN","GOOD",39000);

	}

}
