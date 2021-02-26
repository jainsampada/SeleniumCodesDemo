package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {
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
	
	//Step 6: Clicking on Forget Password Link
	//driver.findElement(By.linkText("Forgot your password?")).click();
	
	//Step 7: Using Partial Link Text
	driver.findElement(By.partialLinkText("Forgot")).click();
	
	
	
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkTextDemo oo=new LinkTextDemo();
		oo.Launch();
	}

}
