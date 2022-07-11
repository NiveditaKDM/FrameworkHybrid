package com.test;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BASEC.BaseTest;
import com.keyworddriven.Keyword;
import com.utils.Locator;

public class HomePageLogin extends BaseTest {

	@Test(enabled = false)
	public void Login() throws InterruptedException {
		//Keyword.LaunchBrowser("Chrome");
		//Keyword.Openurl("https://accounts.google.com/");
		// Keyword.closeWindow();
		Keyword.Maximizewindow();

		By eleuse = By.xpath("//input[@type=\"email\"]");

		Keyword.logiuserName(eleuse, "nivedita.kadam@raisoni.net");

		By cli = By.xpath(
				"//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b\"]");
		Keyword.ClickOn(cli);
//	WebElement wel=Keyword.driver.findElement(By.xpath("//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b\"]"));
//	Keyword.ClickOn(wel);
//	Keyword.CLickOn("Next");

		// Keyword.CLickOn("Next");
		// Keyword.driver.manage().timeouts().getPageLoadTimeout();
		WebElement ele = Keyword.driver.findElement(By.cssSelector("input[type=\"password\"]"));
		// WebElement
		// elepwd=Keyword.driver.findElement(By.xpath("//input[@aria-label=\"Enter your
		// password\"]"));
		System.out.println("xpath ");
		Keyword.Enterpwd(ele, "#Desert234");

	}

	@Test
	public static void VerifySearchResult() throws IOException {
		//Keyword.LaunchBrowser("Chrome");
		//Keyword.Openurl("https://www.myntra.com");
		SoftAssert softly = new SoftAssert();

		Keyword.EnterText(Locator.SearchForProducts, "Shoes");
//	WebElement wel= Keyword.driver.findElement(By.cssSelector(PropUtil.getLocator("SearchForProducts")));
//	Keyword.EnterText(wel, "Shoes");

		// Keyword.ClickOn(Locator.Magnifier);
		// Keyword.EnterText("Search for Products,brands and more", "Shoes");
		//Waits.forDuration(4000);
		// List<String>titles=Keyword.getTextOfElements(By.cssSelector("input[placeholder='Search
		// for products, brands and more']"));
		List<String> titles = Keyword.getTextOfElements(Locator.ProductTitles);
		System.out.println("There are " + titles.size() + "Products");
		for (String title : titles) {
			softly.assertTrue(title.contains("Shoes") || title.contains("Sneakers"),"Title doesnot contains shoes or snekaers"+title);
					//|| titles.contains("Men VARSITY COMPETE Training expected ") || titles.contains("Men Trainers")
					/*|| title.contains("Kids Revolution 4 Running") || title.contains("Men UA Charged Breeze Running")
					|| title.contains("Men GORUN PULSE - SPECTER Shoe")
					|| title.contains("Go Walk Evolution Ultra-Jaunt") || title.contains("Women Solid Sandals ")
					|| title.contains("Men Slip-On Trainers"), "Title doesnot contains shoes or snekaers" + title);
					*/

		}

		softly.assertAll();
	}

}
