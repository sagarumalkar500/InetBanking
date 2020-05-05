package com.InetBanking.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.InetBanking.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseurl= readconfig.getApplicationURL();
	public String username= readconfig.getUserName();
	public String password= readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver=new ChromeDriver();
		
		logger=Logger.getLogger("ebanking");
		DOMConfigurator.configure("log4j.xml");
		
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}

}
