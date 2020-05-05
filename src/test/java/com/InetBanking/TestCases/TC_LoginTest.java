package com.InetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InetBanking.PageObjects.LoginPage;

public class TC_LoginTest extends BaseClass{
	
	@Test
	public void LoginTest()
	{
		driver.get(baseurl);
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setuname(username);
		logger.info("Username is entered");
		
		lp.setpasswd(password);
		logger.info("Password is entered");
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("TestCase is passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("TestCase is failed");
		}
		
	}

}
