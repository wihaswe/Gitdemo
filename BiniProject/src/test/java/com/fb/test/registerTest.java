package com.fb.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Testbase.Testbase;
import com.pages.register;

public class registerTest extends Testbase {
	register register;

	@BeforeMethod
	public void setup() {
		initiallization();
		register = new register();
		

	}

	@AfterMethod
	public void teardown() {
		//driver.close();
	}

	@Test
	public void registration() {

		register.registrationpage();
	

	}
	@Test
	public void verifytitle() {
	String title = register.gettitle();
	Assert.assertEquals(title, "Facebook Log In or Sign Up");
	}
}
