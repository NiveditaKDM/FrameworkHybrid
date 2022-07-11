package com.StepDefination;

import org.testng.Assert;

import com.Narcissus.pages.HomePage;
import com.Narcissus.pages.SignUpPagec;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {
	SignUpPagec signup=new SignUpPagec();
@Given("Chrome Browser should be open")	
public void LaunchSignUpPage() {
	//Keyword.LaunchBrowser("chrome");
	//Keyword.Openurl("https://www.ijmeet.com");
	HomePage home =new HomePage();
	home.ClickOnSingup();
	
	
}

@When("User leaves full name empty and clicks in signup button")
public void enterBlankFullName() {

signup.clickSignUp2Button();

}
@Then("User should see an error message")
public void VerifyError() {
	
String actual=signup.getFullNameErrMsg();
Assert.assertEquals(actual, "Enter Full Name");
}

@Given("User is on Signup page")
public void user_is_on_signup_page() {
	HomePage home=new HomePage();
	home.ClickOnSingup();
}

@When("User enters the full name as {string}")
public void user_enters_the_full_name_as(String fullName) {
signup.setFullNameTextField(fullName);
}

}
