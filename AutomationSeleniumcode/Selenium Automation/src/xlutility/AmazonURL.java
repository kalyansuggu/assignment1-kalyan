package xlutility;

import java.util.concurrent.TimeUnit;

//import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonURL {
	
	public static void main(String[] args)  {

	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver-win32\\chromedriver-win32/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8519888907");
		driver.findElement(By.id("pass")).sendKeys("kalyan143@AAA");
		driver.findElement(By.name("login")).click();
             System.out.println("log in test case passed");
             driver.quit();
             
}
}