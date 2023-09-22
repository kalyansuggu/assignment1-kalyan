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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mcd2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://tools.in.capgemini.com/IKON2_CPRS/login?accountName=MCD ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver. findElement(By.id("nav-tickets-tab")).click();
	   WebElement ele= driver.findElement(By.name("searchType"));
			
	   Select s=new Select(ele);
		s.selectByValue("2");
		 Thread.sleep(5000);
		 WebElement ele1= driver.findElement(By.xpath("//th[@rowspan='1'][12]"));
			
			Actions a=new Actions(driver);
			a.doubleClick(ele1).perform();
			Thread.sleep(4000);
            TakesScreenshot ts= (TakesScreenshot) driver;
			
			File ram=ts.getScreenshotAs(OutputType.FILE);
			
			File dest=new File("./photo/ticketsummary.png");
			
			FileUtils.copyFile(ram, dest);
		
		 driver.findElement(By.id("nav-search-tab")).click();
		 driver.findElement(By.cssSelector("input[name='kosearchbox']")).sendKeys("server");
		 driver.findElement(By.cssSelector("button[type='button']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector("input[name='kosearchbox']")).clear();
		 driver.findElement(By.cssSelector("input[name='kosearchbox']")).sendKeys("786");
		 driver.findElement(By.cssSelector("button[type='button']")).click();
		 Thread.sleep(5000); 
		 driver.findElement(By.cssSelector("input[name='kosearchbox']")).clear();
		 driver.findElement(By.xpath("(//label[@for='ko'])")).click();

		driver.findElement(By.cssSelector("input[name='kosearchbox']")).sendKeys("server");
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.cssSelector("input[name='kosearchbox']")).clear();
		driver.findElement(By.cssSelector("input[name='kosearchbox']")).sendKeys("1001");
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("nav-kolist-tab")).click();
		driver.findElement(By.xpath("(//a[@class='p-2 text-warning float-right'])[1]")).click();
		 
		 WebElement ele2= driver.findElement(By.name("availablelistbox"));
				
		   Select s2=new Select(ele2);
		   s2.selectByIndex(4);
		   Thread.sleep(3000);
		 
		
		 driver.findElement(By.id("add-arrow-btn")).click();
		 driver.findElement(By.id("btnSave")).click();
		WebElement ele3= driver.findElement(By.xpath("//th[@rowspan='1'][11]"));
		
		Actions a1=new Actions(driver);
		a1.doubleClick(ele3).perform();
		Thread.sleep(4000);
		TakesScreenshot ts1= (TakesScreenshot) driver;
		
		File ram1=ts1.getScreenshotAs(OutputType.FILE);
		
		File dest1=new File("./photo/ko.png");
		
		FileUtils.copyFile(ram1, dest1);
		driver.findElement(By.id("nav-helpdesk-tab")).click();
		driver.findElement(By.id("subject")).sendKeys("health check 19-05-2022");
		driver.findElement(By.id("shortdescription")).sendKeys("health check 19-05-2022");
		driver.findElement(By.id("description")).sendKeys("health check 19-05-2022");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
TakesScreenshot ts2= (TakesScreenshot) driver;
		
		File ram2=ts2.getScreenshotAs(OutputType.FILE);
		
		File dest2=new File("./photo/istp.png");
		
		FileUtils.copyFile(ram2, dest2);
		
		
		driver.findElement(By.id("nav-dashboard-tab")).click();
		driver.findElement(By.id("incidentsandkos")).click();
TakesScreenshot ts3= (TakesScreenshot) driver;
		
		File ram3=ts3.getScreenshotAs(OutputType.FILE);
		
		File dest3=new File("./photo/dashboard.png");
		FileUtils.copyFile(ram3, dest3);
		
		Thread.sleep(4000);
		driver.findElement(By.id("chars")).click();
		driver.findElement(By.xpath("(//a[text()=\'All\'])[5]")).click();
		 
		
}
}
