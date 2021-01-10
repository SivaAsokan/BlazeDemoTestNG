package org.cts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends Base {
	public FirstPage() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(name = "fromPort"), @FindBy(xpath = "(//select[@class='form-inline'])[1]") })
	private WebElement depatureCity;
	@FindAll({ @FindBy(name = "toPort"), @FindBy(xpath = "(//select[@class='form-inline'])[2]") })
	private WebElement destinationCity;
	@FindAll({ @FindBy(name = "submit"), @FindBy(xpath = "//input[@value='Find Flights']") })
	private WebElement find;

	public WebElement getDepatureCity() {
		return depatureCity;
	}

	public WebElement getDestinationCity() {
		return destinationCity;
	}

	public WebElement getFind() {
		return find;
	}
}
