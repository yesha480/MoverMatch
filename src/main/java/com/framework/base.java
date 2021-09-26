package com.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public WebDriver driver;

	//public ExtentTest test;
	//public ExtentReports report = new ExtentReports("/Users/yesha.shah/Documents/selenium/eclipes programs/TestNG_MoverMatch/TestNG_Movermatch/Extent Report/ExtentReportResults.html");;


	public void DriverIni() throws IOException {


		String path = System.getProperty("user.dir");
		System.out.println(path); 
		DOMConfigurator.configure(path+"/Resource Folder/log4j.xml");
		FileInputStream file = new FileInputStream(path+"/Resource Folder/data.properties");
		Properties prop = new Properties();
		prop.load(file);


		String browserName = prop.getProperty("browser");
		String urlName = prop.getProperty("url");

		ChromeOptions options = new ChromeOptions();

		if (browserName.equals("chrome")){



			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 1);
			options.setExperimentalOption("prefs", prefs);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);


		}else if (browserName.equals("firefox")){

			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("permissions.default.desktop-notification", 1);
			DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			capabilities.setCapability(FirefoxDriver.PROFILE, profile);


			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options);
		} else {
			System.out.printf("none");
		}


		driver.get(urlName);
	}


	@BeforeClass
	public void preconditions() throws IOException{
		DriverIni();
	}

	@AfterClass
	public void postcondtions(){
		driver.quit();
	}

	/*
	@BeforeTest
	public void startTest()
	{
		System.out.println("before test");
		report = new ExtentReports("/Users/yesha.shah/Documents/selenium/eclipes programs/TestNG_MoverMatch/TestNG_Movermatch/Extent Report/ExtentReportResults.html");

	}

	@AfterTest
	public void endTest()
	{
		System.out.println("after test");
		report.flush();
	}

*/


}
