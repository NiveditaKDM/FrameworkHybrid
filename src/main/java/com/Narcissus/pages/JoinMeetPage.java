package com.Narcissus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinMeetPage {
	@FindBy(css="h2.m-txt")
public	WebElement qickJoinMeetingHeading;
	
public String quickJoinMeetingText() {
	return qickJoinMeetingHeading.getText();
}
}
