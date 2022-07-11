package com.utils;

import java.util.Random;

public class Randomize {
	public static  Random random = new Random();
	public static void numbers() {
		
		String num = random.nextInt(9) + "" + random.nextInt(9) + "" + random.nextInt(9) + "" + random.nextInt(9) + ""
				+ random.nextInt(9) + "" + random.nextInt(9);
		System.out.println(num);

	}
public static void alphaNumeric() {
	char string=(char) (random.nextInt(26)+'a');
	char string1=(char) (random.nextInt(26)+'a');
	
	String alphanum=random.nextInt(9)+""+string+random.nextInt(9)+""+string1+random.nextInt(9);
	System.out.println(alphanum);


}
	public static void main(String[] args) {
		numbers();
		alphaNumeric();
	}
}
