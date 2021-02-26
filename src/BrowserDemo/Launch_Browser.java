package BrowserDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	WebDriver driver;
	public void Launch()
	{ 
		//Give the Path of Browser where you want to run your code
		System.setProperty("webdriver.chrome.driver","C:\\Sel_Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initialize Driver
		driver=new ChromeDriver();
		
		//Open application under Test
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Opening application in maximize mode
		driver.manage().window().maximize();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_Browser obj=new Launch_Browser();
		obj.Launch();
	}

}
