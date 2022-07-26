package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipPojo3 extends BaseClass {
public FlipPojo3() {
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//div[text()='APPLE iPhone 11 (Green, 64 GB)']")
private WebElement iphonepro;





public WebElement getIphonepro() {
	return iphonepro;
}



}
