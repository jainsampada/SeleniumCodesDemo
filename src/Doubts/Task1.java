package Doubts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	WebDriver driver;
	String path;
	String  facebook;
	String url,str,link;
	WebElement uname,login,pass;

	public void Launch()
	{
		//Step-1 Giving Dynamic method to fetch chromedriver
		path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
		
		System.out.println("Path"+path);
		
		//Step-2 set dynamic path
		System.setProperty("webdriver.chrome.driver",path);
		
		//Step-3 Initialize chromedriverz
		driver=new ChromeDriver();
		
		//step-4 Open browser in maximize mode
		driver.manage().window().maximize();
		
		//Step-5 open url of applications
		driver.get("https://www.bbc.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		//link=driver.findElement(By.className("media__link")).getText();
//		link=driver.findElement(By.tagName("a")).getText();
//		System.out.println(link);
//		for(int i=10;i<getText();i++)
//	
//		{
//			System.out.println(link +" " +("href"));
//			//System.out.println(link .getText() +" " + link.getAttribute("href"));
//		}
	}
	


	private int getText() {
		// TODO Auto-generated method stub
		return 0;
	}



	public static void main(String[] args) 
	{
		Task1 oo=new Task1();
		oo.Launch();
		

	}


}
