package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPath {
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
	
	//Step 6: Write username in username text field By using name locator 
	String str=	driver.findElement(By.xpath("//span[text()='Username']")).getText();
	System.out.println(str);
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	
	//Step 7: Write password in password text field
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	
	
	//Step 8: Using Contains method to Click on Submit button
	//driver.findElement(By.xpath("//input[contains(@name,'Sub')]")).click();
	//driver.findElement(By.name("Submit")).click();
	//driver.findElement(By.name("Submit")).submit();
	
	
	//Using text method of XPath

	//Clicking on logo from dashboard page
	//driver.findElement(By.xpath("//img[@src='/webres_5fee89a90600f2.94309009/themes/default/images/logo.png']")).click();
	//Step 9 Closing Browser 
	//Thread.sleep(5000);//Waiting for 5000 milliseconds to close Browser Window
//driver.close();
	//driver.quit();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocateByXPath oo=new LocateByXPath();
		oo.Launch();
	}

}
