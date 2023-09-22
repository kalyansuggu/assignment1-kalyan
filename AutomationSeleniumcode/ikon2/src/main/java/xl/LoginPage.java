package xl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (9)/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tools.in.capgemini.com/IKON2_ALS/login?accountName=PNS");	
		

		String path=".\\datafiles\\LoginPage.xlsx"; 
		 
		XLUtility xlutil=new XLUtility (path);
		
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manayss");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		
		String act_title=driver.findElement(By.xpath("//p[@class='m-0']")).getText();
		
		xlutil.setCellData("Sheet1", 8, 10, act_title);
	

		driver.findElement(By.id("loginSubmit")).click();
	
		
		String act_title1="please provide your user name here";
		
		xlutil.setCellData("Sheet1", 9, 10, act_title1);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.id("loginSubmit")).click();
		
       
		
		String act_title2="please provide your password here";
		
		xlutil.setCellData("Sheet1", 10, 10, act_title2);
		
		driver.findElement(By.cssSelector("input[name='username']")).clear();
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
       
		String act_title3="please provide your user name here";
		xlutil.setCellData("Sheet1", 11, 10, act_title3);
		
		
		driver.findElement(By.cssSelector("input[name='password']")).clear();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@1234");
		driver.findElement(By.id("loginSubmit")).click();
       
        		
        String act_title4="Wrong password, unsuccessful attempt # 1";
		
        xlutil.setCellData("Sheet1", 12, 10, act_title4);
		
		driver.findElement(By.cssSelector("input[name='username']")).clear();
		driver.findElement(By.cssSelector("input[name='password']")).clear();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		
		
        String act_title5="log in successfull";
        
        xlutil.setCellData("Sheet1", 5, 10, act_title5);
		
      
		
}

}


