package com.bosch.in.chapter2;

import java.util.*;
/**
 * Demonstrate System Properties
 */
public class SysPropDemo {
	public static void main(String argv[]) {
		System.out.println("System Properties:");
		Properties p = System.getProperties( );
		p.list(System.out);
	}
}