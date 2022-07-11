package com.BASEC;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.keyworddriven.Keyword;
import com.utils.Environment;

public class BaseTest {
	Keyword keyword =new Keyword();
@BeforeMethod
	public static  void setUp() throws IOException {
	System.out.println(Environment.getBrowserName());
	Keyword.LaunchBrowser(Environment.getBrowserName());

String env= System.getProperty("env");
System.out.println(Environment.getUrl(env));
Keyword.Openurl(Environment.getUrl(env));

}
@AfterMethod
public static  void TearDown() {
	
Keyword.closeWindow();
}
}
