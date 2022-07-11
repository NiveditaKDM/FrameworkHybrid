package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BASEC.BaseTest;
import com.Narcissus.pages.HomePage;
import com.Narcissus.pages.JoinMeetPage;
import com.keyworddriven.Keyword;

public class IJMeetLoginTest extends BaseTest {
	@Test
	public void VerifyOnClickJoinMeetingUserRedirectsToJoinMeetingPage() {
		String ExpectedText = "Quick Join a Meeting";
		HomePage home = new HomePage();
		// HomePage home=PageFactory.initElements(Keyword.driver, HomePage.class);
		home.ClickOnJoinedMeetingLink();
		JoinMeetPage joinmeeting = PageFactory.initElements(Keyword.driver, JoinMeetPage.class);
		String actual = joinmeeting.quickJoinMeetingText();
		Assert.assertEquals(actual, ExpectedText);
		System.out.println(actual);
		System.out.println(ExpectedText);
	}

}
