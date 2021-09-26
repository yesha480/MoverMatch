package com.po;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBase {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("run before annotated method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("run after annotated method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Run Before annotated class");
	}
	
	

	@AfterClass
	public void afterClass() {
		System.out.println("Run After annotated class");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Run before annotated Test");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("Run After annotated Test");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Run before annotated Suite");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Run After annotated Suite");
	}
	
	
	
	
	@BeforeGroups
	public void beforeGroup() {
		System.out.println("Run before annotated group");
	}
	
	
	@AfterGroups
	public void afterGroup() {
		System.out.println("Run After annotated group");
	}

}
