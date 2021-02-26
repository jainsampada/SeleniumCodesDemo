package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo {
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
	driver.get("file://C:/Courseware/HTML/form.html");
	
	//Step 6: Selecting Chandigarh from Drop down List
	Select slt=new Select(driver.findElement(By.id("sltcities")));
	slt.selectByIndex(1);
	//slt.selectByValue("Chandigarh");
	//slt.selectByVisibleText("Chandigarh");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDownListDemo oo=new DropDownListDemo();
		oo.Launch();
	}

}
