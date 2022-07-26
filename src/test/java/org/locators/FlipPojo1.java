package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipPojo1 extends BaseClass{

	public FlipPojo1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='_36HLxm col col-3-5']//child::input[@type='text']")
	private WebElement txtuser;
	@FindBy(xpath="//div[@class='_36HLxm col col-3-5']//child::input[@type='password']")
	private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnlogin;
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchbox;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement searchbtn;
	
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
}
