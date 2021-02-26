package Miscllaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	String path;
	WebDriver driver;
	public void Launch() throws InterruptedException
	{
	path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
	//System.out.println(path);
	
	// Step 2 Set Dynamic Path
	System.setProperty("webdriver.chrome.driver", path);
	
	//Step 3 Initialize ChromeDriver
	driver=new ChromeDriver();
	
	//Step -4 Open Browser in maximize mode
	driver.manage().window().maximize();
	
	//Step 5: Open Url of the application
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	//Step - 6:Click on Login Button
	driver.findElement(By.name("proceed")).click();
	
	//Switch to an Alert
	Thread.sleep(5000);
	//Methods of Alert - accept(),dismiss().getText(),sendKeys()
	//driver.switchTo().alert().accept();
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlertDemo oo=new AlertDemo();
		oo.Launch();
	}

}
