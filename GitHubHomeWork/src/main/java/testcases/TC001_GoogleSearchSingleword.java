package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wdmethods.ProjectMethods;

public class TC001_GoogleSearchSingleword extends ProjectMethods{
	@BeforeClass
	public void doSetup(){
		dataSheetName="TC001";
		testCaseName="TC001_GoogleSearchSingleword";
		testDescription="Search Google with a single keyword - Test change in github";
		category="sanity";
		authors="Muthu & Jeba";
		browserName="Chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void doSearch(String query){
		new HomePage(driver, test)
		.typeInSearchBox(query)
		.clickGoogleSearch();
	}
}
