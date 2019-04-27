package com.farm.qa.base;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertpractice {
	
	
	SoftAssert soft = new SoftAssert();
	
	
	@Test(priority=0)
	public void test0(){
		System.out.println("launch browsewr");
		
		soft.assertEquals(true, false, "found false");
		
		System.out.println("launch browsewr");
		soft.assertAll();
	}
	
	@Test(priority=1)
	public void test1(){
		
		System.out.println("close browsewr");
		Assert.assertEquals(true, false, "found false in ghard assser");
		System.out.println("launch browsewr");
		System.out.println("launch browsewr");
	
		System.out.println("launch browsewr");
	}
	
	
	@Test(priority=2)
	public void test2(){
		System.out.println("Sachin browsewr");
		
		
	}
	

	

}
