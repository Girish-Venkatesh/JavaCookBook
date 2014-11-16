package com.bosch.in.chapter3;

public class StringCharacterReverseUsingStringBuffer {
	
	public static void main(String[] args) {
		
		String sh = "FCGDAEB";
		System.out.println(sh + " -> " + new StringBuffer(sh).reverse( ));
	}

}
