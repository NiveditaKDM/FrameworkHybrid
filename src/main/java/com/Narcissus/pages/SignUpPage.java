package com.Narcissus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.keyworddriven.Keyword;

public class SignUpPage {
	@FindBy(css="input#name")
	public WebElement FullName;
	@FindBy(css="input#company_name")
	public WebElement CompanyName;
	@FindBy(css="input#email")
	public WebElement EmailId;
	@FindBy(css="input#contact")
	public WebElement PhoneNo;
	@FindBy(css="input#password")
	public By Password;
	@FindBy(css="div.my-0:nth-child(2)")
    public WebElement Signup;
	
//	public By FullName=By.cssSelector("input#name");
//	public By CompanyName=By.cssSelector("input#company_name");
//	public By EmailId=By.cssSelector("input#email");
//	public By PhoneNo=By.cssSelector("input#contact");
//	public By Password=By.cssSelector("input#password");
//	public By Signup=By.cssSelector("div.my-0:nth-child(2)");
	public  void EnterFullName(String FullName) {
		Keyword.EnterText(this.FullName, FullName);
		

	}
	public void EnterCompanyName(String CompanyName) {
		Keyword.EnterText(this.CompanyName, CompanyName);

	}
public  void EnterEmail(String Email) {
	
Keyword.EnterText(this.EmailId, Email);
}
public void ENterPhoneNo(String Phoneno) {
	Keyword.EnterText(this.PhoneNo,Phoneno );

}
public void EnterPassword(String Pwd) {
	Keyword.EnterText(this.Password, Pwd);

}
public void clickOnSignUpBtn() {
	// TODO Auto-generated method stub
	
}
}
