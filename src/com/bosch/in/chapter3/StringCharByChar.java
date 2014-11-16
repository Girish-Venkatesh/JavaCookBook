package com.bosch.in.chapter3;

public class StringCharByChar {

	public static void main(String[] args) {

		String a = "A quick bronze fox leapt a lazy bovine";
		for (int i=0; i < a.length( ); i++)
			System.out.println("Char " + i + " is " + a.charAt(i));
	}

}
