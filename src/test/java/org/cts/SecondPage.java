package org.cts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage extends Base {

	public SecondPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class='table']")
	private WebElement table;

	public WebElement getTable() {
		return table;
	}
}
