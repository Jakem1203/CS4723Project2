package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;
import org.junit.Test;

public class JenkinsTest2 extends TestCase {
	Email testEmail;
	
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	
	public void testAddHeader() {
		System.out.println("This test will see if the addHeader method adds it correctly\nBy: dmj250");
    testEmail.addHeader("John", "Hello");
		assertEquals("Hello", testEmail.headers.get("John"));
	}
}
