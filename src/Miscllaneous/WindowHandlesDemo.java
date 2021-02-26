package Miscllaneous;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {
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
	
	//step 6: click in link
	//handle windows
	Set<String> handler=driver.getWindowHandles();
	
	Iterator<String> it=handler.iterator();
	String parentid=it.next();
	System.out.println(parentid);
	
	String childid=it.next();
	System.out.println(childid);
	driver.switchTo().window(childid);
	
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
