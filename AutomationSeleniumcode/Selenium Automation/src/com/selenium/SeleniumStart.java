package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumStart {

	public static void main(String[] args) {
				
		//System.setProperty("webdriver.chrome.driver", ".\\chromedriver1.exe");
		
		//WebDriver Manager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/users/sign_in");
		
		WebElement user_full_name =driver.findElement(By.id("user_full_name"));
		user_full_name.sendKeys("Sadhvi Singh");
		
		
		
		WebElement user_email_login =driver.findElement(By.id("user_email_login")); 
		user_email_login.sendKeys("sadhvisingh9049+1@gmail.com");
		
		WebElement user_password =  driver.findElement(By.id("user_password"));
		user_password.sendKeys("BrowserStack123*");
		
		driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
		driver.findElement(By.id("user_submit")).click();
		driver.close();
     
	}

}
