package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DashboardTest extends Launch_Browser{
@Test(dependsOnMethods="Login")//(groups= {"Smoke"})
public void Logout() throws InterruptedException
{
	//Thread.sleep(5000);
	driver.findElement(By.linkText("Welcome Paul")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Logout")).click();
	
}
}
