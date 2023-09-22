package xl;

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
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import xl.XLUtility;
//import org.apache.poi.ss.usermodel.Chart;
import org.openqa.selenium.support.ui.Select;

public class WebTableToExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (6)/chromedriver.exe");

		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tools.in.capgemini.com/IKON2_CPRS/login?accountName=ALG");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		
		
		driver.findElement(By.id("nav-dashboard-tab")).click();
		driver.findElement(By.id("incidentsandkos")).click();
        String mttr = driver.findElement(By.xpath("//p[@class='f24']")).getText();
		
		//xlutil.setCellData("Sheet1", 1, 6, mttr);
        TakesScreenshot ts3= (TakesScreenshot) driver;
		
		File ram3=ts3.getScreenshotAs(OutputType.FILE);
		
		File dest3=new File("./photo/dashboard.png");
		FileUtils.copyFile(ram3, dest3);
		
		driver.findElement(By.id("chars")).click();
		driver.findElement(By.xpath("//a[normalize-space()='MTTR Chart']")).click();
		driver.findElement(By.xpath("//a[@class='d-block quartely']")).click();
		driver.findElement(By.xpath("//i[@class='far fa-arrow-alt-circle-left fa-1x f18']")).click();
		
		driver.findElement(By.id("nav-rooca-tab")).click();
		Thread.sleep(5000);
		
		

		
		
		
		//driver.quit();
		
		//driver.close();
		

	}

}
