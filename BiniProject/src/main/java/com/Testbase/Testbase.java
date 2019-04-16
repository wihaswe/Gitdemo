package com.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	
	public Testbase() {
		
		
		prop= new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Owner\\Documents\\New Workspace\\BiniProject\\src\\main\\java\\com\\Fb\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void initiallization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Test automation\\Jar\\chromedriver.exe\\");
			driver = new ChromeDriver();
			
		}else if (browserName.equals("firefox")){
			System.setProperty("webdriver.chrome.driver", "C:\\Test automation\\Jar\\geckodriver.exe\\" );
			driver = new FirefoxDriver();
			
			
			
		}else {
			
		System.out.println(" no browser found");

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}
