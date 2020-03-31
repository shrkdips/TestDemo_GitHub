package com.HomePage.test;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class HomePageTest
{
	
	Logger log = Logger.getLogger(HomePageTest.class);
	
	@Test
	public void homePage()
	{
		log.info("The test cases should be passed");
		System.out.println("Home Page Test Passed");
		log.warn("It will throw error message if the code is wrong");
	}
	
	@Test
	public void homePageLinks()
	{
		log.info("The test cases should be running all day");
		System.out.println("Home Page Links Test Passed");
		log.error("The test did not run all day so it throws an error message");
	}

}
