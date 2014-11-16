package com.bosch.in.chapter3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckSumCalucalationOfGivenFile {

	public static void main(String[] args) {
		
		CheckSumCalucalationOfGivenFile c = new CheckSumCalucalationOfGivenFile();
		try {
			FileReader fp = new FileReader("C:\\Girish\\Books\\O'Reilly Java Cookbook.PDF");
			BufferedReader is = new BufferedReader(fp);
			System.out.println(c.process(is));		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}


	/** CheckSum one file, given an open BufferedReader. */
	public int process(BufferedReader is) {
		int sum = 0;
		try {
			String inputLine;
			while ((inputLine = is.readLine( )) != null) {
				int i;
				for (i=0; i<inputLine.length( ); i++) {
					sum += inputLine.charAt(i);
				}
			}
			is.close( );
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		} finally {
			return sum;
		}
	}

}
