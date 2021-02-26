package Miscllaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo {
	String path;
	WebDriver driver;
	public void Launch() 
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
	driver.get("https://jqueryui.com/droppable/");
	
	//Step 6: Switch to frame by it's Index
	driver.switchTo().frame(0);
	
	//Handling Mouse Actions 
	Actions act=new Actions(driver);
	
	//Performing drag and drop

	act.clickAndHold(driver.findElement(By.id("draggable")))
	.moveToElement(driver.findElement(By.id("droppable")))
	.release().build().perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDropDemo oo=new DragandDropDemo();
		oo.Launch();
	}

}
