package com.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class VendorLoginPage extends base {

	public VendorLoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "normal_login_email")
	public WebElement emailID;
	
	@FindBy(id = "normal_login_password")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement signInButton; 
	
	
	@FindBy(xpath = "//span[@class='Header__username']")
	public WebElement profileName;


}
