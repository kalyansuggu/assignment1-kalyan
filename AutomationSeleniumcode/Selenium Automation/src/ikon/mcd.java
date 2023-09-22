package ikon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mcd {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tools.in.capgemini.com/IKON2_CPRS/login?accountName=MCD");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		//	driver.findElement(By.cssSelector("button[type='submit']")).click();
		//	Thread.sleep(3000);	
			
		//	driver.findElement(By.cssSelector("input[name='username']")).clear();		          
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
			driver.findElement(By.id("loginSubmit")).click();
		//	Thread.sleep(3000);
		//	driver.findElement(By.cssSelector("input[name='password']")).clear();
			
		//	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("kalyan");
		//	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("kalyan@123");
		//	driver.findElement(By.cssSelector("button[type='submit']")).click();
		//	Thread.sleep(3000);
		//	driver.findElement(By.cssSelector("input[name='username']")).clear();	
			//driver.findElement(By.cssSelector("input[name='password']")).clear();
			
			
		//	driver.findElement(By.linkText("Forgot Password ?")).click();

			//driver.findElement(By.id("nav-search-tab")).click();
			//driver.findElement(By.cssSelector("input[name='kosearchbox']")).sendKeys("kalyan");
			//driver.findElement(By.cssSelector("button[type='button']")).click();
			
			
			
			
			//driver.findElement(By.id("nav-tickets-tab")).click();
			
			driver.findElement(By.id("nav-dashboard-tab")).click();
			 
            TakesScreenshot ts= (TakesScreenshot) driver;
			
			File ram=ts.getScreenshotAs(OutputType.FILE);
			
			File dest=new File("./photo/dashboard1.png");
			
			FileUtils.copyFile(ram, dest);
			driver.findElement(By.id("nav-tickets-tab")).click();
	       //  WebElement ele= driver.findElement(By.name("searchType"));
			
			//Select s=new Select(ele);
			//s.selectByValue("2");
			//Thread.sleep(3000);

			//driver.findElement(By.id("incidentsandkos")).click();
			//driver.findElement(By.id("chars")).click();
			//driver.findElement(By.xpath("(//a[text()=\'All\'])[5]")).click();
		//	driver.findElement(By.class("d-block")).click();
		//	driver.findElement(By.xpath("(//a[text()=\'Incidents linked vs not linked to KO\'])")).click();
			//driver.findElement(By.xpath("//a[text()=\'Annual\'][1]")).click();
			//driver.findElement(By.linkText("d-block")).click();
			
			driver.findElement(By.id("nav-kolist-tab")).click();
            
            TakesScreenshot ts1= (TakesScreenshot) driver;
			
			File ram1=ts1.getScreenshotAs(OutputType.FILE);
			
			File dest1=new File("./photo/kolist1.png");
			
			FileUtils.copyFile(ram1, dest1);
			
			//driver.close();
			
			driver.findElement(By.xpath("(//a[@class='p-2 text-warning float-right'])[1]")).click();

		}

	

	}


