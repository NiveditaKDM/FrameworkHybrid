package com.test;

import org.testng.annotations.Test;

import com.BASEC.BaseTest;
import com.Narcissus.pages.HomePage;
import com.Narcissus.pages.SignUpPage;

public class IjMeetSignUpPagetTest extends BaseTest {
	@Test
	public void VerifyPhonenoinPlaceofFullName() {
		HomePage homepage= new HomePage();
homepage.ClickOnSingup();
SignUpPage signuppage=new SignUpPage();
signuppage.EnterFullName("9850399383");
signuppage.EnterCompanyName("raisoni");
signuppage.EnterEmail("nivedita.kadam@gmailcom");
signuppage.EnterPassword("abc123#");
signuppage.ENterPhoneNo("9850399383");
}
}
