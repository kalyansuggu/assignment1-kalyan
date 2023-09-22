package xlutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebdataToExcel {
	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32/chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		driver.get("http://in-blr-natools:5600/IKON2_OTH/login?accountName=NAT");
        
        //log in to application
       // String name = "manays";
       // String pwd = "manays@123";
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
		driver.findElement(By.id("loginSubmit")).click();
		
		driver. findElement(By.id("nav-tickets-tab")).click();
		 WebElement ele= driver.findElement(By.name("searchType"));
				
		   Select s=new Select(ele);
			s.selectByValue("2");

        // Find and extract data from web elements
			
			
        WebElement dataElement = driver.findElement(By.xpath("//p[@class='p-0 pb-1 mb-1 cg-dark-blue font-weight-bold']")); // Replace with the actual element ID
        String data = dataElement.getText();

        // Close the browser
       

        // Write the data to an Excel sheet using Apache POI
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Data Sheet");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue(data);

            // Save the workbook to a file
            try (FileOutputStream fileOut = new FileOutputStream("output.xlsx")) {
                workbook.write(fileOut);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
