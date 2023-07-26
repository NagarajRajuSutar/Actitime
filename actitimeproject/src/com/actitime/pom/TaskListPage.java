package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;	
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;	
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EntercustomerNameTbx;	
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement EntercustomerdescriptionTbx;	
	   
	@FindBy(xpath="//div[@class='comboboxButton']//div[@class='dropdownButton']")
	    private WebElement selectCustomerDropDown;	 
	  
	@FindBy(xpath="//div[@class='searchItemList']//div[text()='Big Bang Company']")
	   private WebElement bigbangCompany;	   
	   
	@FindBy(xpath="//div[text()='Create Customer']")
	    private WebElement createCustomer;	   
	   
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='title']") 
	   private WebElement actualText;	   
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projectName;
	   
	@FindBy(xpath="//div[@class='comboboxButton']//div[@class='dropdownButton']")
	private WebElement selectCustomerDropdown01;
	
	@FindBy(xpath="//div[@class='searchItemList']//div[text()='Our company']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescription;
	
	@FindBy(xpath="//div[@class='components_button withPlusIcon']")
	private WebElement creatProjectBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='title']")
	private WebElement actutalTitle;
	
	
	public WebElement getActualText() 
	{
		return actualText;
	}
	
	public WebElement getactutalTitle() 
	{
		return actutalTitle;
	}
	
	public TaskListPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
		
	public WebElement getaddNew()
	{
			return addNew;
		}
		
	public WebElement getnewCustomer() 
	{
			return newCustomer;
		}
		
	public WebElement getEntercustomerNameTbx()
	{
			return EntercustomerNameTbx;
		}
	
		public WebElement getEntercustomerdescriptionTbx() 
		{
		return EntercustomerdescriptionTbx;
		}
		
		public WebElement getselectCustomerDropDown() 
		{
			return selectCustomerDropDown;
		}
		
		public WebElement getbigbangCompany() 
		{
			return bigbangCompany;
		} 
		
		public WebElement getcreateCustomer()
		{
			return createCustomer;
		}
	   
 public WebElement getnewProject()
 {
	 return newProject;
 }
 
 public WebElement getprojectName()
 {
	 return projectName;
 } 

 public WebElement getselectCustomerDropdown01()
 {
	 return selectCustomerDropdown01;
 } 

 public WebElement getourCompany()
 {
	 return ourCompany;
 }
 
 public WebElement getprojectDescription()
 {
	 return projectDescription;
 }
 
 public WebElement getcreatProjectBtn()
 {
	 return creatProjectBtn;
 }
}

