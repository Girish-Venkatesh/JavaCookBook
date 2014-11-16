package com.bosch.in.chapter3;

import java.util.StringTokenizer;

//word by word printing

public class StringTokenizerWordByWord {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello World of Java");
		while (st.hasMoreTokens( ))
		System.out.println("Token: " + st.nextToken( ));
	}

}
