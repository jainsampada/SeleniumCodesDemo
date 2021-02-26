package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {
	WebDriver driver;
	String path;
public void Launch()
{
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
	
	//Step 6: Write username in username text field
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	//Step 7: Write password in password text field
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	//Step 8: Click on Login Button
	driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
	//driver.findElement(By.id("btnLogin")).click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocateById oo=new LocateById();
		oo.Launch();

	}

}
