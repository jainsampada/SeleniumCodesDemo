package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {

	WebDriver driver;
	String path;
public void Launch() throws InterruptedException
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
	
	//Step 6: Write username in username text field By using name locator 

	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtUsername")).clear();
	
	//Step 7: Write password in password text field
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	
	//Step 8: Click on Login Button
	//driver.findElement(By.name("Submit")).click();
	//driver.findElement(By.name("Submit")).submit();
	
	
	//Step 9 Closing Browser 
	Thread.sleep(5000);//Waiting for 5000 milliseconds to close Browser Window
	driver.close();


}
public static void main(String[] args) throws InterruptedException {
	LocateByName oo=new LocateByName();
	oo.Launch();
}
}