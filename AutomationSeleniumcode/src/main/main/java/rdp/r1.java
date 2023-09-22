package rdp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class r1 {

public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (4)/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		

		    driver.get("https://mysite");
		    WebElement submit_element=driver.findElement(By.id("Log_On"));
		    driver.findElement(By.id("Enter user name")).sendKeys("my_username");
		    driver.findElement(By.name("passwd")).sendKeys("my_password");
		    submit_element.click();
		    driver.findElement(By.id( "folderLink_0")).click();
		    driver.findElement(By.id( "folderLink_2")).click();
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    System.out.println(driver.getPageSource());
		    driver.findElement(By.id("idCitrix.M")).click();
		    System.out.println(driver.getPageSource());
		}
}

