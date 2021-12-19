package com.stepdefination;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps extends Base{
	SignInPage sp;
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		getDriver();
	    sp=PageFactory.initElements(driver, SignInPage.class);
	}

	@When("user click signin button")
	public void user_click_signin_button() {
		sp.getSignin();
		
		//driver.findElement(By.xpath(" //span[contains(text(),'Hello, Sign in')]")).click();
	   
	}

	@When("user enter username")
	public void user_enter_username() {
		sp.getemil();
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("majumdar88@gmail.com");
	
	   
	}

	@When("user click next button")
	public void user_click_next_button() {
		sp.getinput();
		
		//driver.findElement(By.xpath("//input[@id='continue']")).click();
	    
	}

	@When("user enter password")
	public void user_enter_password() {
		sp.getpassword();
		
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	    
	}
	
	@When("user click submit")
	public void user_click_submit() {
		sp.getcontinue();
		
		//driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	    
	}

	@Then("user on signinpage")
	public void user_on_signinpage() {
		Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
	    
	}


}
