package applicationPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import frameworkLibrary.BasePage;

public class Pg102_Home extends BasePage
{
	
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;
	public Pg102_Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH,using="//b[text()='My Info']")
	WebElement MyInfo;
	public void clickOnMyInfo()
	{
		stepstatus = basepage.clickElement(MyInfo);
		reportEvent(stepstatus, "Able to click On MyInfo", "UnAble to click On MyInfo", driver);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Contact Details']")
	WebElement ContactDetails;
	public void clickOnContactDetails()
	{
		stepstatus = basepage.clickElement(ContactDetails);
		reportEvent(stepstatus, "Able to click On ContactDetails", "UnAble to click On ContactDetails", driver,true);
	}
	
	@FindBy(how=How.XPATH,using="//a[@id='welcome']")
	WebElement logoutExpand;
	@FindBy(how=How.XPATH,using="//a[text()='Logout']")
	WebElement logout;
	public void Logout()
	{
		stepstatus = basepage.clickElement(logoutExpand);
		reportEvent(stepstatus, "Able to click On logoutExpand", "UnAble to click On logoutExpand", driver);
		basepage.wait(2);
		stepstatus = basepage.clickElement(logout);
		reportEvent(stepstatus, "Able to click On logout", "UnAble to click On logout", driver);
	
		
	}

	@FindBy(how=How.XPATH,using="//a[text()='Emergency Contacts']")
	WebElement clickOnEmergencyContacts;
	public void clickOnEmergencyContacts() {
		
		stepstatus = basepage.clickElement(clickOnEmergencyContacts);
		reportEvent(stepstatus, "Able to click On EmergencyContacts", "UnAble to click On EmergencyContacts", driver,true);   
		
		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='btnAddContact']")
	WebElement clickOnAddbutton;
	public void clickOnAddbutton()
	{
		stepstatus = basepage.clickElement(clickOnAddbutton);
		reportEvent(stepstatus, "Able to click On Addbutton", "UnAble to click On Addbutton", driver,true);
		
	}
	 
	
		
	}




	
	
	
	
