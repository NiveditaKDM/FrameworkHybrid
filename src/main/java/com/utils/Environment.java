package com.utils;

import java.io.IOException;

public class Environment {
//public  String getDevurl() throws IOException {
//return PropUtil.getEnvironment("dev.url");
//
//}
////public  String getQAurl() throws IOException {
////	return PropUtil.getEnvironment("qa.url");
////
////}

	public static String getUrl(String environment) throws IOException {
		if (environment.equalsIgnoreCase("dev")) {
			return PropUtil.getEnvironment("dev.url");

		} else if (environment.equalsIgnoreCase("qa")) {
			return PropUtil.getEnvironment("qa.url");

		} else if (environment.equalsIgnoreCase("Preprod")) {
			return PropUtil.getEnvironment("Preprod.url");
		} else {
			return environment;

		}
	}

	public static String getUserName() {
		String userName = "";
		return userName;

	}
	public static String getBrowserName() throws IOException {
		return PropUtil.getEnvironment("browserName");
	

	}

}
