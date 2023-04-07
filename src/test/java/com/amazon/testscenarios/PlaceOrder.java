package com.amazon.testscenarios;

import org.testng.annotations.Test;

import com.amazon.pages.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PlaceOrder {
	@Test
	public void LoginTest() {
		LoginPage loginTest = new LoginPage();
		loginTest.validateLogin("devarapallisupriya523@gmail.com","Supriya@34");
	}
	
	@Test
	public void SearchProductPage() {
	}
	
	@Test
	public void addToCartTest() {
	}
	
	@Test
	public void makePaymantTest() {
	}
	
	@Test
	public void logoffTest() {
	}
	
	@BeforeClass
	public void beforeClass() {
		launchBrowser();
		navigateToURL();
	}
	
	
	private void navigateToURL() {
		// TODO Auto-generated method stub
		
	}

	private void launchBrowser() {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void afterClass() {
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	