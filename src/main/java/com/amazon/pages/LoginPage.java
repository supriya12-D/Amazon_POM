package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.base.TestBase;

public class LoginPage extends TestBase {
	
	By singInLink = By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span");
	By email = By.name("email");
	By continueBtn = By.xpath("//*[@id=\"continue\"]");
	By password = By.name("password");
	By signInBtn = By.id("signInSubmit");
	
	public void validateLogin(String uname, String pwd) {
		driver.findElement(singInLink).click();
		wait(2000);
		driver.findElement(email).sendKeys(uname);
		driver.findElement(continueBtn).click();
		wait(2000);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInBtn).click();
		
		boolean actResult = true;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		}catch(TimeoutExpecption te) {
		actResult = false;
		System.out.println("Screenshot for Login Failure");
		captureScreenshot();
		}
		
		return actResult;
	}
}

