package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelDemo {
	String path,path1,path2;
	WebDriver driver,driver1,driver2;
	@Test
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
	}
	@Test
	public void Launch1()
	{
	//Giving Dynamic method to fetch ChromeDriver
	path1=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
	//System.out.println(path);

	// Step 2 Set Dynamic Path
	System.setProperty("webdriver.chrome.driver", path1);
	//Step 3 Initialize ChromeDriver
	driver1=new ChromeDriver();

	//Step -4 Open Browser in maximize mode
	driver1.manage().window().maximize();

	//Step 5: Open Url of the application
	driver1.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void Launch2()
	{
	//Giving Dynamic method to fetch ChromeDriver
	path2=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
	//System.out.println(path);

	// Step 2 Set Dynamic Path
	System.setProperty("webdriver.chrome.driver", path2);
	//Step 3 Initialize ChromeDriver
	driver2=new ChromeDriver();

	//Step -4 Open Browser in maximize mode
	driver2.manage().window().maximize();

	//Step 5: Open Url of the application
	driver2.get("https://opensource-demo.orangehrmlive.com/");
	}
}
