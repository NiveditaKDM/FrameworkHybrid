package com.keyworddriven;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
		public static WebDriver driver;
		//public static Waits wait = null;

		public static void LaunchBrowser(String BrowserName) {
			if (BrowserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (BrowserName.equalsIgnoreCase("Edge")) {
				WebDriverManager.chromedriver().setup();
				driver = new EdgeDriver();
			} else if (BrowserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.chromedriver().setup();
				driver = new FirefoxDriver();
			} else {
				System.out.println("No browser found" + BrowserName);
			}
			//new Waits();
		}

		public static void Openurl(String URL) {
			driver.get(URL);
		}

		public static void logiuserName(By element, String Username) {
			driver.findElement(element).sendKeys(Username);
		}

		public static void closeWindow() {
			driver.close();
			System.out.println("browser is closed sucessfully");

		}

		public static void ClickOn(By clickelement) {

			driver.findElement(clickelement).click();

		}

		public static void ClickOn(WebElement webele) {

			webele.click();

		}

		public static void CLickOn(String Text) {
			driver.findElement(By.xpath("//*[contains(text(),'" + Text + "')]")).click();

		}

		public static List<WebElement> getWebElements(String Locator) {
			String locatorType = Locator.split("##")[0];
			String locatorValue = Locator.split("##")[1];
			List<WebElement> elements = new ArrayList<>();
			if (locatorType.equalsIgnoreCase("xpath"))
				elements = driver.findElements(By.xpath(locatorValue));
			else if (locatorType.equalsIgnoreCase("css"))
				elements = driver.findElements(By.cssSelector(locatorValue));
			else if (locatorType.equalsIgnoreCase("id"))
				elements = driver.findElements(By.id(locatorValue));
			else if (locatorType.equalsIgnoreCase("name"))
				elements = driver.findElements(By.name(locatorValue));
			if (locatorType.equalsIgnoreCase("linkText"))
				elements = driver.findElements(By.linkText(locatorValue));
			else if (locatorType.equalsIgnoreCase("class"))
				elements = driver.findElements(By.className(locatorValue));
			else if (locatorType.equalsIgnoreCase("tagname"))
				elements = driver.findElements(By.tagName(locatorValue));
			else if (locatorType.equalsIgnoreCase("partiallinktext"))
				elements = driver.findElements(By.partialLinkText(locatorValue));

			return elements;

		}

		public static WebElement getWebElement(String Locator) {
			String locatorType = Locator.split("##")[0];
			String locatorValue = Locator.split("##")[1];
			WebElement element = null;
			if (locatorType.equalsIgnoreCase("xpath"))
				element = driver.findElement(By.xpath(locatorValue));
			else if (locatorType.equalsIgnoreCase("css"))
				element = driver.findElement(By.cssSelector(locatorValue));
			else if (locatorType.equalsIgnoreCase("id"))
				element = driver.findElement(By.id(locatorValue));
			else if (locatorType.equalsIgnoreCase("name"))
				element = driver.findElement(By.name(locatorValue));
			if (locatorType.equalsIgnoreCase("linkText"))
				element = driver.findElement(By.linkText(locatorValue));
			else if (locatorType.equalsIgnoreCase("class"))
				element = driver.findElement(By.className(locatorValue));
			else if (locatorType.equalsIgnoreCase("tagname"))
				element = driver.findElement(By.tagName(locatorValue));
			else if (locatorType.equalsIgnoreCase("partiallinktext"))
				element = driver.findElement(By.partialLinkText(locatorValue));

			return element;

		}

		public static void Maximizewindow() {
			driver.manage().window().maximize();
		}

		public static void Enterpwd(WebElement elepssword, String pwd) {
			elepssword.sendKeys(pwd);

		}

		public static void EnterText(String Placeholder, String Text) {

			driver.findElement(By.cssSelector("input[placeholder*='Search for products']")).sendKeys(Text, Keys.ENTER);

		}

		public static List<String> getTextOfElements(By Selector) {
			List<String> ProductTexts = new ArrayList<>();
			List<WebElement> productTitles = driver.findElements(Selector);
			for (WebElement ProductTitle : productTitles) {
				ProductTexts.add(ProductTitle.getText());

			}
			return ProductTexts;

		}

		public static List<String> getTextOfElements(String Locator) {
			List<WebElement> elements = getWebElements(Locator);
			List<String> elementTexts = new ArrayList<>();
			for (WebElement element : elements) {
				elementTexts.add(element.getText());
			}

			return elementTexts;
		}

		public static void EnterText(WebElement wel, String text) {
			wel.sendKeys(text, Keys.ENTER);

		}

		public static String GetTitle() {
			
			System.out.println(driver.getTitle());
			return driver.getTitle();
			
		}

	

		public static void EnterText(By Locator, String text) {
			driver.findElement(Locator).sendKeys(text);
			
			
		}

		
	}

