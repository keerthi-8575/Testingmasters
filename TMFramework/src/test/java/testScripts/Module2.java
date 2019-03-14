package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import applicationPages.Pg101_Login;
import applicationPages.Pg102_Home;
import frameworkLibrary.BaseClass;

public class Module2 extends BaseClass
{
	@Test
	public void TC201()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		
		Pg101_Login loginpage = new Pg101_Login(driver);
		loginpage.setUserName("ankit3");
		loginpage.setpassword("abcd1234");
		loginpage.ClickonLogin();
		
		Pg102_Home homepage = new Pg102_Home(driver);
		homepage.clickOnMyInfo();
		homepage.clickOnEmergencyContacts();
		homepage.clickOnAddbutton();
		
		
		
		
				 
	}
	@Test
	public void TC202()
	{
		System.out.println("Executing TC202");
	}
	@Test
	public void TC203()
	{
		System.out.println("Executing TC203");
	}
	@Test
	public void TC204()
	{
		System.out.println("Executing TC204");
	}
}
