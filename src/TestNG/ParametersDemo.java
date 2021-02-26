package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	String path;
	WebDriver driver;
@Parameters({"chrome","firefox"})
@Test
public void Launch_Browser(String browser1,String browser2)
{
	System.out.println("Browser 1 is:"+browser1);
	System.out.println("Browser 2 is:"+browser2);
	if(browser1.equals("Chrome"))
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
	}
	else if(browser2.equals("Firefox"))
	{
		//Giving Dynamic method to fetch ChromeDriver
		path=System.getProperty("user.dir")+"//Browser//geckodriver.exe";
		//System.out.println(path);
		
		// Step 2 Set Dynamic Path
		System.setProperty("webdriver.gecko.driver", path);
		
		//Step 3 Initialize ChromeDriver
		driver=new FirefoxDriver();
		
		//Step -4 Open Browser in maximize mode
		driver.manage().window().maximize();
		
		//Step 5: Open Url of the application
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
}
}
