package com.LoginPage.test;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoginPageTest
{
	Logger log = Logger.getLogger(LoginPageTest.class);
	
	@Test
	public void loginPage()
	{
		log.info("This is the beginning");
		System.out.println("Login Page Test");
	}
	
	@Test
	public void loginPageLink()
	{
		log.error("The error mesage is displayed");
		System.out.println("Login Page Link Test");
	}

}
