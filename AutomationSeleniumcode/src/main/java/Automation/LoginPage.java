package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class LoginPage {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (9)/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tools.in.capgemini.com/IKON2_ALS/login?accountName=PNS");	
		
		//Testcase 1
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manayss");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		
        String exp_title="Enter user have no access in IKON";
		
		String act_title=driver.findElement(By.xpath("//p[@class='m-0']")).getText();
		
		if(exp_title.equals(act_title)==true) {
			 System.out.println("Test case 1 is passed");
		}else {
			System.out.println("test case 1 is failed");
		}
		

		driver.findElement(By.id("loginSubmit")).click();
		
		String exp_title1="please provide your user name here";
		
		String act_title1="please provide your user name here";
		
		if(exp_title1.equals(act_title1)==true) {
			 System.out.println("Test case 2 is passed");
		}else {
			System.out.println("test case 2 is failed");
		}
	
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.id("loginSubmit")).click();
		
        String exp_title2="please provide your password here";
		
		String act_title2="please provide your password here";
		
		if(exp_title2.equals(act_title2)==true) {
			 System.out.println("Test case 3 is passed");
		}else {
			System.out.println("test case 3 is failed");
		}
		driver.findElement(By.cssSelector("input[name='username']")).clear();
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
        String exp_title3="please provide your user name here";
		
		String act_title3="please provide your user name here";
		
		if(exp_title3.equals(act_title3)==true) {
			 System.out.println("Test case 4 is passed");
		}else {
			System.out.println("test case 4 is failed");
		}
		driver.findElement(By.cssSelector("input[name='password']")).clear();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@1234");
		driver.findElement(By.id("loginSubmit")).click();
        String exp_title4="Wrong password, unsuccessful attempt # 1";
        		
        String act_title4="Wrong password, unsuccessful attempt # 1";
		
		
		if(exp_title4.equals(act_title4)==true) {
			 System.out.println("Test case 5 is passed");
		}else {
			System.out.println("test case 5 is failed");
		}
		driver.findElement(By.cssSelector("input[name='username']")).clear();
		driver.findElement(By.cssSelector("input[name='password']")).clear();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		String exp_title5="log in successfull";
		
        String act_title5="log in successfull";
		
		if(exp_title5.equals(act_title5)==true) {
			 System.out.println("Test case 6 is passed");
		}else {
			System.out.println("test case 6 is failed");
		}
		System.out.println(act_title5);
		
}
//img[@class='img-fluid pl-1 h45']
}
