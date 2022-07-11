package com.Narcissus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keyworddriven.Keyword;

public class HomePage {
	@FindBy(css="span.mvlogo-size-appl img[alt='ijmeetimage']")
	public WebElement ijmettlogo;
	@FindBy(css="ul.navbar-nav>li:nth-child(1)>a")
	public WebElement joinmeetinglink;
	@FindBy(css="ul.navbar-nav>li:nth-child(2)>a")
	public WebElement hostMeeting;
@ FindBy(css="ul.navbar-nav li:nth-child(5) a")
	public WebElement SignUpbtn;
	public void ClickOnIJMeetLogo() {
		 ijmettlogo.click();
		 System.out.println("Clicked on logo");
	}
	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}
public void ClickOnJoinedMeetingLink() {
	
	joinmeetinglink.click();
	
}
public String GetTextOfJoinMeetingLink() {
	return joinmeetinglink.getText();
}
public  String GetTitle() {
	return Keyword.GetTitle();

}
public void ClickOnSingup() {
	SignUpbtn.click();
	
}
}
