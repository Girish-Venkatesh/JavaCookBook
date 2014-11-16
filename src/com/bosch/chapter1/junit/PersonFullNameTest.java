package com.bosch.chapter1.junit;

import com.bosch.in.chapter1.PersonFullName;

import junit.framework.*;

/** A simple test case for Person */
public class PersonFullNameTest extends TestCase {
	/** JUnit test classes require this constructor */
	public PersonFullNameTest(String name) {
		super(name);
	}
	public void testNameConcat( ) {
		PersonFullName p = new PersonFullName("Ian", "Darwin");
		String f = p.getFullName( );
		assertEquals(f, "Ian Darwin");
	}
}