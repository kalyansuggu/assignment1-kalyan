package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
			
		driver.findElement(By.name("username")).sendKeys("kalyan");
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("kalyan143@A");
		
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[3]")).click();
		
				

	}

}
