package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	String path;
	WebDriver driver;
	@Test
	public void Launch()
	{
		SoftAssert ast=new SoftAssert();
	//Giving Dynamic method to fetch ChromeDriver
	path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
	//System.out.println(path);

	// Step 2 Set Dynamic Path
	System.setProperty("webdriver.chrome.driver", path);
	//Step 3 Initialize ChromeDriver
	driver=new ChromeDriver();

	//Step -4 Open Browser in maximize mode
	driver.manage().window().maximize();

	//Step 5: Open Url of the application
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//Step 6: Applying Soft Assertion to check title of page
	ast.assertEquals(driver.getTitle(), "Hrm");
	
	//Step 7:Passing Login Credentials
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	//Step 7: Write password in password text field
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	//Step 8: Click on Login Button
	driver.findElement(By.id("btnLogin")).click();
	
	ast.assertAll();
	}

}
