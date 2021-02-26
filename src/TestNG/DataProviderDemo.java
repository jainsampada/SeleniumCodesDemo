package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	String path;
	WebDriver driver;
@DataProvider(name="LoginTest")
public Object[][] login()
{
	Object[][] data=new Object[2][2];
	
	data[0][0]="admin";
	data[0][1]="ada";
	
	data[1][0]="as";
	data[1][1]="ghfg";
	
	return data;
}
@Test(dataProvider="LoginTest")
public void logindemo(String uname,String pass)
{
	System.out.println("----------------");
	System.out.println("Username is:"+uname);
	System.out.println("----------");
	System.out.println("Password is:"+pass);
	
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
		
		//Step 6: Write username in username text field
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		
		//Step 7: Write password in password text field
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		
		//Step 8: Click on Login Button
		driver.findElement(By.id("btnLogin")).click();

}
}
