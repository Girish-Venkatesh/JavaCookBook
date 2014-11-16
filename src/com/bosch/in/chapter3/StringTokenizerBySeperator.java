package com.bosch.in.chapter3;

import java.util.StringTokenizer;

public class StringTokenizerBySeperator {
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Hello, World|of|Java", ",|");
				while (st.hasMoreElements( ))
				System.out.println("Token: " + st.nextElement( ));
	}

}
