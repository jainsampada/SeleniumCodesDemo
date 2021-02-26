package BrowserDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browserupdated {
WebDriver driver;//WebDriver is an Interface
String title,url,source;
public void Launch()
{
	//Step - 1 Set the property for Chrome Driver exe file
	System.setProperty("webdriver.chrome.driver", "C:\\Sel_Softwares\\chromedriver_win32\\chromedriver.exe");
	
	//Step -2 Initialize the ChromeDriver
	driver=new ChromeDriver();
	
	//Step - 3 Launching an AUT(give URL to test application)
	driver.get("https://opensource-demo.orangehrmlive.com/");

	//Using navigate method to launch an application
//	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().refresh();
	
	//Step - 4 Checking we are on correct page or not
	title=driver.getTitle();
	System.out.println("Title of page is:"+title);
	
	url=driver.getCurrentUrl();
	System.out.println("Current URL of Page is:"+url);
	
	
	//source=driver.getPageSource();
	//Step - 5Closing the Browser Window
	driver.close();
	
	driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_Browserupdated oo=new Launch_Browserupdated();
		oo.Launch();
	}

}
