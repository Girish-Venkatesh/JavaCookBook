package com.bosch.in.chapter3;


import java.io.*;
/** entab- replace blanks by tabs and blanks.
 * Transmuted from K&R Software Tools book into C.
 * Transmuted again, years later, into Java.
 */
public class ReplaceSpaceByTabUsingEnTab {
	/** Main program: just create an EnTab program, and pass
	 * the standard input or the named file(s) through it.
	 */
	public static void main(String[] argv) throws IOException {
		ReplaceSpaceByTabUsingEnTab et = new ReplaceSpaceByTabUsingEnTab(8);
		if (argv.length == 0) // do standard input
			et.entab(new BufferedReader(
					new InputStreamReader(System.in)));
		else for (int i=0; i<argv.length; i++) { // do each file
			et.entab(new BufferedReader(new FileReader(argv[i])));
		}
	}
	
	
	/** The Tabs (tab logic handler) */
	protected Tabs tabHandler;
	/** A symbolic constant for end-of-file */
	public static int EOF = -1;
	/** Constructor: just save the tab values.
	 * @arguments n The number of spaces each tab is to replace.
	 */
	public ReplaceSpaceByTabUsingEnTab(int n) {
		tabHandler = new Tabs(n);
	}
	/** putchar - convenience routine for printing one character */
	protected void putchar(int ch) {
		System.out.print((char)ch);
	}
	/** entab: process one entire file, replacing blanks with tabs.
	 * @argument is A BufferedReader opened to the file to be read.
	 */
	public void entab(BufferedReader is) throws IOException {
		String line;
		int c, col = 0, newcol;
		// main loop: process entire file one char at a time.
		do {
			newcol = col;
			// If we get a space, increment column count; if this
			// takes us to a tab stop, output a tab character.
			while ((c = is.read( )) == ' ') {
	
				newcol++;
				if (tabHandler.tabpos(newcol)) {
	
					putchar('\t');
					col = newcol;
				}
			}
			// If we're just past a tab stop, we need to put the
			// "leftover" spaces back out, since we just consumed
			// them in the "while c ... == ' ')" loop above.
			while (col < newcol) {

				putchar(' ');
				col++;
			}

			// Now either we're at the end of the input file,
			// or we have a plain character to output.
			// If the "plain" char happens to be \r or \n, then
			// output it, but also set col back to 1.
			// This code for \r and \n should satisfy Unix, Mac and MS.
			if (c != EOF) {
				putchar(c);
				col = (c == '\n' || c == '\r' ? 1 : col + 1);
			}
		} while (c != EOF);
		System.out.flush( ); // output everything for this file.
	}
}
