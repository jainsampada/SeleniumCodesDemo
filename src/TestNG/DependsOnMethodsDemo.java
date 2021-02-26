package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethodsDemo {
	String path;
	WebDriver driver;
	@Test(priority=0)
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
	@Test(priority=1,enabled=false)
	public void Login() 
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//Step 7: Write password in password text field
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Step 8: Click on Login Button
		driver.findElement(By.id("btnLogin")).click();
		

	}
	@Test(priority=2,dependsOnMethods="Login")
	public void Logout() throws InterruptedException
	{
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Welcome Paul")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		
	}
	@Test(priority=3)
	public void Close_Browser()

	{
		driver.close();
	}
}
