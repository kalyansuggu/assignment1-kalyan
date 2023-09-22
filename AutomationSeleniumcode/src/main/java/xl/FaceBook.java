package xl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws IOException, InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (4)/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32 (6)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		 driver.findElement(By.id("(id=\"email\")")).sendKeys("8519888907");

		 driver.findElement(By.xpath("(//input[@id='pass']]])")).sendKeys("kalyan143@A");
		 driver.findElement(By.xpath("(//button[@id='loginbutton']]]])")).click();

}
}