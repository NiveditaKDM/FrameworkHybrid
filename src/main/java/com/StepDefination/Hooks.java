package com.StepDefination;

import com.keyworddriven.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void SetUp() {
		Keyword.LaunchBrowser("Chrome");
		Keyword.Openurl("https://www.ijmeet.com");

	}
	@After
public void TearDown() {
	Keyword.closeWindow();
}
}
