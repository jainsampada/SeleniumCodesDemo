package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
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
	
	//Step 6 Using CSSSelector
//	String str=	driver.findElement(By.cssSelector("span[class='form-hint']")).getText();
//	System.out.println(str);
	
	//Using ClassName
	String str=	driver.findElement(By.className("form-hint")).getText();
	System.out.println(str);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CssSelectorDemo oo=new CssSelectorDemo();
		oo.Launch();
	}

}
