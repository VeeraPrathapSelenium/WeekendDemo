package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {
	
	
	@Test
	
	public static void launchBrowser()
	{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		
	}

}
