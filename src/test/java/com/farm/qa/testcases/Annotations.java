package com.farm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void launch() {
       System.out.println(" @BeforeSuite launch");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("@AfterSuite tearDown");
	}
	
	@BeforeTest
	public void Login() {
		   System.out.println(" @@BeforeTest Login");
	}
	
	@AfterTest
	public void logOut() {
		System.out.println(" @AfterTest logOut");
	}
	
	@BeforeClass
	public void title1() {
		  System.out.println(" @BeforeClass title1");
	}

	@AfterClass
	public void title2() {
		System.out.println(" @AfterClass title2");
	}

	@BeforeMethod
	public void popup1() {
		System.out.println(" @BeforeMethod popup1");
	}

	@AfterMethod
	public void popup2() {
		System.out.println(" @AfterMethod popup2");
	}

	@Test
	public void test1() {
		System.out.println(" @Test test1");
	}

	@Test
	public void test2() {
		System.out.println(" @Test test2");
	}

	
}
