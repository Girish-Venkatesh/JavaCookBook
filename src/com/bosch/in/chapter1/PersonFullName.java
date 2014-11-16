package com.bosch.in.chapter1;

/** A simple class used to demonstrate unit testing. */
public class PersonFullName {
	protected String fullName;
	protected String firstName, lastName;
	/** Construct a Person using his/her first+last names. */
	public PersonFullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/** Get the person's full name */
	public String getFullName( ) {
		if (fullName != null)
			return fullName;
		return firstName + " " + lastName;
	}
	/** Simple test program. */
	public static void main(String[] argv) {
		PersonFullName p = new PersonFullName("Ian", "Darwin");
		String f = p.getFullName( );
		if (!f.equals("Ian Darwin"))
			throw new IllegalStateException("Name concatenation	broken");
					System.out.println("Fullname " + f + " looks good");
	}
}
