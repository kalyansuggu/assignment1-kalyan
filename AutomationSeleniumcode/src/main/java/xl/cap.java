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
import org.openqa.selenium.support.ui.Select;

public class cap {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (4)/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (9)/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tools.in.capgemini.com/IKON2_CPRS/login?accountName=CAP");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver. findElement(By.id("nav-tickets-tab")).click();
		 WebElement ele= driver.findElement(By.name("searchType"));
				
		   Select s=new Select(ele);
			s.selectByValue("2");
			// Thread.sleep(5000);
			 WebElement ele1= driver.findElement(By.xpath("//th[@rowspan='1'][12]"));
				
				Actions a=new Actions(driver);
				a.doubleClick(ele1).perform();
		
		String path=".\\datafiles\\HealthCheck_V2_22-02-2023.xlsx"; 
		 
		XLUtility xlutil=new XLUtility (path);
		
		
		/*xlutil.setCellData("Sheet1", 0,0, "ReportedDate");
		xlutil.setCellData("Sheet1", 0,1, "Lastkocreated");
		xlutil.setCellData("Sheet1", 0,2, "lastupdatedate");
		xlutil.setCellData("Sheet1", 0,3, "mttr");*/
		
		
	//WebElement table=driver.findElement(By.xpath("//table[@class='table table-header table-hover border f13 table-responsive dataTable no-footer']/tbody"));
		
//		int rows=table.findElements(By.xpath("tr")).size();
		//String abc[]= {"",""};
		String reportedDate = driver.findElement(By.xpath("//table[@class='table table-header table-hover border f13 table-responsive dataTable no-footer']/tbody/tr[1]/td[12]")).getText();
		
		 
		
		xlutil.setCellData("Sheet1", 20, 2, reportedDate);
		
		String lastupdatedate = driver.findElement(By.xpath("//p[@class='p-0 pb-1 mb-1 cg-dark-blue font-weight-bold']")).getText();
		xlutil.setCellData("Sheet1", 20, 3, lastupdatedate);
		
		
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
				
		   Select s1=new Select(ele2);
			 s1.selectByIndex(4);
			//Thread.sleep(3000);
		
		 driver.findElement(By.id("add-arrow-btn")).click();
		 driver.findElement(By.id("btnSave")).click();
		WebElement ele3= driver.findElement(By.xpath("//th[@rowspan='1'][11]"));
		
		Actions a1=new Actions(driver);
		a1.doubleClick(ele3).perform();
		
        String lastkocreated = driver.findElement(By.xpath("//table[@class='table table-header table-hover border f13 table-responsive dataTable no-footer']/tbody/tr[1]/td[11]")).getText();
		
		 
		
		xlutil.setCellData("Sheet1", 20, 4, lastkocreated);
		
		driver.findElement(By.id("nav-helpdesk-tab")).click();
		driver.findElement(By.id("subject")).sendKeys("health check ");
		driver.findElement(By.id("shortdescription")).sendKeys("health check ");
		driver.findElement(By.id("description")).sendKeys("health check ");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.id("nav-dashboard-tab")).click();
		driver.findElement(By.id("incidentsandkos")).click();
        String mttr = driver.findElement(By.xpath("//p[@class='f24']")).getText();
		
		xlutil.setCellData("Sheet1", 20, 6, mttr);
        TakesScreenshot ts3= (TakesScreenshot) driver;
		
		File ram3=ts3.getScreenshotAs(OutputType.FILE);
		
		File dest3=new File("./photo/dashboardcap.png");
		FileUtils.copyFile(ram3, dest3);
		
		driver.findElement(By.id("chars")).click();
		
		driver.findElement(By.id("nav-rooca-tab")).click();
		Thread.sleep(5000);
		
		

		
		
		
		//driver.quit();
		
		//driver.close();
		

	}


}
