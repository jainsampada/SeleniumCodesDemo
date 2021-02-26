package LocatorsDemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameDemo {
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
	
	//Step 6 Place all images in arraylist
	ArrayList<WebElement> link=new ArrayList<WebElement>(driver.findElements(By.tagName("img")));
	//ArrayList<WebElement> links=new ArrayList<WebElement>(driver.findElements(By.tagName("image")));
	
	System.out.println(link.size());
	//System.out.println(links.size());
	
	for(int i=0;i<link.size();i++)
	{
		System.out.println(link.get(i).getAttribute("src"));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TagnameDemo oo=new TagnameDemo();
		oo.Launch();
	}

}
