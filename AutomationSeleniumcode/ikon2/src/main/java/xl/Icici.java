package xl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 
public class Icici {
	
	

		public static void main(String[] args) throws IOException, InterruptedException {
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (4)/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (8)/chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.icicibank.com/");
			
			WebElement titleA = driver.findElement(By.xpath("//span[@class='m-text'][normalize-space()='Cards']")); 
			  WebElement titleC = driver.findElement(By.xpath("//label[contains(text(),'Debit')]")); 

			// Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
			   Actions actions = new Actions(driver); 

			// Call moveToElement() method of actions class to move mouse cursor to a WebElement A. 
			   actions.moveToElement(titleA); 
			   actions.clickAndHold(); 
			   
			   actions.moveToElement(titleC); 
			   actions.release().perform(); 
			  } 
			}


