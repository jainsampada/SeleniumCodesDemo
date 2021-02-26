package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Launch_Browser {
public static WebDriver driver;
public static String path;
@BeforeSuite//(groups= {"Smoke"})
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


@AfterSuite//(groups= {"Smoke"})
public void Close_Browser()

{
	driver.close();
}
}
