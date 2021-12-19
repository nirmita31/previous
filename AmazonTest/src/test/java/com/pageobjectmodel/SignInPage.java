package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;
	
	public SignInPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	WebElement signin;
	
	public void getSignin() {
		signin.click();
		
	}
	
	//@FindBy(xpath="//a[@class='nav-action-button']")
	//WebElement Continue;
	//public void getcontinue() {
		
		//Continue.click();
	//}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	public void getemil() {
		email.sendKeys("majumdar88@gmail.com");
	}
	@FindBy(xpath="//input[@id='continue']")
	WebElement input;
	
	public void getinput() {
		input.click();
		
	}
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	public void getpassword() {
		password.sendKeys("123456");
		
	}
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement submit;
	public void getcontinue() {
		submit.click();
	}
	

}
