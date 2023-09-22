package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (9)/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tools.in.capgemini.com/IKON2_ALS/login?accountName=PNS");
		//a[@id='forgotPassword']
		driver.findElement(By.xpath("//a[@id='forgotPassword']")).click();
		
		driver.findElement(By.xpath("//input[@id='email_ID']")).sendKeys("manays@capgemini.com");
		driver.findElement(By.xpath("//button[@id='btn-forgot-username']")).click();
		driver.findElement(By.xpath("//input[@id='email_ID']")).clear();
		driver.findElement(By.xpath("//input[@id='email_ID']")).sendKeys("manamohana.ys@capgemini.com");
		driver.findElement(By.xpath("//button[@id='btn-forgot-username']")).click();
		System.out.println("reset password sent successfully");
}
}//input[@id='accountName']