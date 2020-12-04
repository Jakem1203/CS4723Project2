package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;
import org.junit.Test;

public class JenkinsTest1 extends TestCase {
	Email testEmail;
	
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	
	public void testAddReplyTo() throws EmailException{
		System.out.println("This test will see if the method addReplyTo() works\n By: dmj250");
		testEmail.addReplyTo("a@b.com", "Joe");
		assertEquals("Joe <a@b.com>", testEmail.getReplyToAddresses().get(0).toString());
	}
}
