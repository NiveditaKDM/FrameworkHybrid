package com.utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	/***
	 * This method returns value of specified locator from OR.properties file
	 * 
	 * @param locator
	 * @throws IOException
	 */
	public static String getLocator(String locator) throws IOException {
		String filename = "\\src\\com\\utils\\OR.properties";
		return getProperty(filename,locator);
		
		
	}
public static String getProperty(String filename,String key) throws IOException {
	
	String dir = System.getProperty("user.dir");
	FileInputStream fis = new FileInputStream(dir + filename);
	Properties prop = new Properties();
	prop.load(fis);
	System.out.println( prop.getProperty(key));
	return prop.getProperty(key);
}
public static String getEnvironment(String key) throws IOException {
	
	String filename= "\\src\\main\\resources\\Environment.properties";
	
	return getProperty(filename,key);
}

}
