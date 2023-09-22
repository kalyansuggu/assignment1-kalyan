package xlutility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Reports {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver-win32\\chromedriver-win32/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.manage().window().maximize();
		driver.get("http://in-blr-natools:5200/IKON2_CPRS/login?accountName=DSN");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@id='nav-dashboard-tab']")).click();
		
		driver.findElement(By.xpath("//a[@id='chars']")).click();
		driver.findElement(By.xpath("//div[@id='chartComponent']//a[@class='d-block']")).click();
		
		driver.findElement(By.xpath("//div[@id='reportType']//a[@class='d-block'][normalize-space()='Knowledge Objects']")).click();
		
		
		driver.findElement(By.cssSelector("div[id='reports'] div:nth-child(1) a:nth-child(2)")).click();
		
		driver.findElement(By.xpath("//a[@class='d-block'][normalize-space()='Quarterly']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='View']")).click();
	}
	
}




