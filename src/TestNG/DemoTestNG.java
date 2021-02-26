package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
public class DemoTestNG {
//@Test//TestNG Annotation which means it is a TestCase
@BeforeSuite
public void Launch_Browser()
{
	System.out.println("Launch Browser");
}
@BeforeClass
public void Before_Class()
{
	System.out.println("Before Class");
}
@AfterClass
public void After_Class()
{
	System.out.println("After Class");
}
@BeforeMethod
public void Before_Method()
{
	System.out.println("Before Method");
}
@AfterMethod
public void After_Method()
{
	System.out.println("After Method");
}
@BeforeTest
public void Before_Test()
{
	System.out.println("Before Test");
}
@AfterTest
public void AfterTest()
{
	System.out.println("After Test");
}
@Test
public void Open_App()
{
	System.out.println("Opening Application");
}
@Test
public void Login()
{
	System.out.println("Login details");
}
//@Test
@AfterSuite
public void Close_Browser()
{
	System.out.println("Close Browser");
}
}
