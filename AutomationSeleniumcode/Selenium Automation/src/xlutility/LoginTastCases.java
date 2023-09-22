package xlutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LoginTastCases {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGKALYA\\Downloads\\chromedriver_win32/chromedriver.exe");
    	
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	WebDriver driver = new ChromeDriver(options);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    		driver.get("http://in-blr-natools:5600/IKON2_OTH/login?accountName=ADA");

        // Test Case 1: Login with valid user id and password
        loginWithValidCredentials(driver, "valid_user", "valid_password");

        // Test Case 2: Logout the application
        logoutApplication(driver);

        // Test Case 3: Login with invalid user id and password
        loginWithInvalidCredentials(driver, "invalid_user", "invalid_password" );

        // Test Case 4: Login without entering userid and password
       // loginWithoutUserIdAndPassword(driver);

        // Test Case 5: User enters the userid and clicks on submit button without entering password
       // loginWithoutPassword(driver, "valid_user");

        // Test Case 6: User enters the password and clicks on submit button without entering userid
       // loginWithoutUserId(driver, "valid_password");

        // Test Case 7: User enters password wrongly three times
        //loginWithWrongPasswordMultipleTimes(driver, "valid_user", "wrong_password");

        driver.quit();
    }

    private static void loginWithValidCredentials(WebDriver driver, String userId, String password) {
    	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manays");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@123");
//driver.findElement(By.cssSelector("input[name='accountName']")).sendKeys("ADA");
		
		driver.findElement(By.id("loginSubmit")).click();

        // Add assertions to verify successful login
        // For example, you can check if the user dashboard/home page is displayed
        // Assert.assertEquals(driver.getCurrentUrl(), baseUrl + "/dashboard");
    }

    private static void logoutApplication(WebDriver driver) {
        // Perform logout actions here
        // For example, click on logout button and navigate to the login page
    	
    	 driver.findElement(By.xpath("//i[@class='fas fa-sign-out-alt']")).click();
    	
    	 
    	
    }

    private static void loginWithInvalidCredentials(WebDriver driver, String userId, String password) {
    	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manayss");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manays@1234");
		driver.findElement(By.cssSelector("input[name='accountName']")).sendKeys("ADA");
		driver.findElement(By.id("loginSubmit")).click();
		
        String errorMessage = driver.findElement(By.cssSelector("div[@id='fail']")).getText();
        System.out.println("errorMessage");
        Assert.assertEquals(errorMessage, "Enter user have no access in IKON");
        
      //

        // Add assertions to verify login failure
        // For example, check if the error message for invalid credentials is displayed
        // 
        // Assert.assertEquals(errorMessage, "Invalid username or password.");
    }

   /* private static void loginWithoutUserIdAndPassword(WebDriver driver) {
        driver.findElement(By.id("loginButton")).click();

        // Add assertions to verify login failure
        // For example, check if the error message for blank fields is displayed
        // String errorMessage = driver.findElement(By.id("errorMsg")).getText();
        // Assert.assertEquals(errorMessage, "Username and password cannot be empty.");
    }

    private static void loginWithoutPassword(WebDriver driver, String userId) {
        driver.findElement(By.id("userId")).sendKeys(userId);
        driver.findElement(By.id("loginButton")).click();

        // Add assertions to verify login failure
        // For example, check if the error message for blank password is displayed
        // String errorMessage = driver.findElement(By.id("errorMsg")).getText();
        // Assert.assertEquals(errorMessage, "Password cannot be empty.");
    }

    private static void loginWithoutUserId(WebDriver driver, String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();

        // Add assertions to verify login failure
        // For example, check if the error message for blank userid is displayed
        // String errorMessage = driver.findElement(By.id("errorMsg")).getText();
        // Assert.assertEquals(errorMessage, "Username cannot be empty.");
    }

    private static void loginWithWrongPasswordMultipleTimes(WebDriver driver, String userId, String wrongPassword) {
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("userId")).sendKeys(userId);
            driver.findElement(By.id("password")).sendKeys(wrongPassword);
            driver.findElement(By.id("loginButton")).click();*/

            // Add assertions to verify login failure with wrong password
            // For example, check if the error message for invalid credentials is displayed
            // String errorMessage = driver.findElement(By.id("errorMsg")).getText();
            // Assert.assertEquals(errorMessage, "Invalid username or password.");
        
    }
