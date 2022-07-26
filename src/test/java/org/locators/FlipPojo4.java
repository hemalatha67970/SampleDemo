package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipPojo4 {
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement addtocart;
	public WebElement getAddtocart() {
		return addtocart;
	}
}
