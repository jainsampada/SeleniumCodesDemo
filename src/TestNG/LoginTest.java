package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Launch_Browser {
	String expTitle="OrangeHRM",actTitle;
@Test//(groups= {"Sanity"})
public void CheckTitle()
{
	actTitle=driver.getTitle();
	AssertJUnit.assertEquals(actTitle, expTitle);
	
}
@Test//(groups= {"Smoke"})
public void Login() throws InterruptedException
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	//Step 7: Write password in password text field
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	//Step 8: Click on Login Button
	driver.findElement(By.id("btnLogin")).click();
	

}
@Test//(groups= {"Sanity"})
public void Forget_Pass()
{
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.navigate().back();
}
}
