package org.cts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage extends Base {
	public ThirdPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="inputName")
	private WebElement name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(id="state")
	private WebElement state;
	@FindBy(id="zipCode")
	private WebElement pinCode;
	@FindBy(id="cardType")
	private WebElement card;
	@FindBy(id="creditCardNumber")
	private WebElement cardNo;
	@FindBy(id="creditCardMonth")
	private WebElement cardMonth;
	@FindBy(id="creditCardYear")
	private WebElement cardYear;
	@FindBy(id="nameOnCard")
	private WebElement cardNme;
	@FindBy(id="rememberMe")
	private WebElement remember;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement purchase;
	
	public WebElement getRemember() {
		return remember;
	}
	public WebElement getPurchase() {
		return purchase;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPinCode() {
		return pinCode;
	}
	public WebElement getCard() {
		return card;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardMonth() {
		return cardMonth;
	}
	public WebElement getCardYear() {
		return cardYear;
	}
	public WebElement getCardNme() {
		return cardNme;
	}
	

}
