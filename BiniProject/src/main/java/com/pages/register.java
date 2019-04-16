package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Testbase.Testbase;

public class register extends Testbase {
	
	
	@FindBy(name="firstname")
	WebElement firstname;
	@FindBy(name="lastname")
	WebElement lastname;
	@FindBy(name="reg_email__")
	WebElement email;
	@FindBy(name="reg_email_confirmation__")
	WebElement remail;
	@FindBy(name ="reg_passwd__")
	WebElement password;
	@FindBy(id ="month")
	WebElement month;
	@FindBy(id ="day")
	WebElement day;
	@FindBy(id ="year")
	WebElement year;
	@FindBy(id ="u_0_s")
	WebElement gender;
	@FindBy (name ="websubmit")
	WebElement signup;
	
	
	public register() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void registrationpage() {
		
		firstname.sendKeys("testera");
		lastname.sendKeys("testerb");
		email.sendKeys("hhewan05@gmail.com");
		remail.sendKeys("hhewan05@gmail.com");
		password.sendKeys("abcd@123");
		Select abc = new Select(month);
		abc.selectByIndex(5);
		Select cdf = new Select(day);
		cdf.selectByIndex(5);
		Select efg = new Select(year);
		efg.selectByIndex(5);
		gender.click();
		signup.click();
		
		
	}
	
	public void popup() {
		
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
	}

	public String gettitle() {
		return driver.getTitle();
		
	}
}
