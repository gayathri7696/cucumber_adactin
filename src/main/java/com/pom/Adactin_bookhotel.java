package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_bookhotel {
	public static WebDriver driver;
	@FindBy(id="first_name")
	private WebElement first_name;
	public Adactin_bookhotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit_card() {
		return credit_card;
	}
	public WebElement getCard_type() {
		return card_type;
	}
	public WebElement getEx_month() {
		return ex_month;
	}
	public WebElement getEx_yr() {
		return ex_yr;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	@FindBy(id="last_name")
	private WebElement last_name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement credit_card;
	@FindBy(id="cc_type")
	private WebElement card_type;
	@FindBy(id="cc_exp_month")
	private WebElement ex_month;
	@FindBy(id="cc_exp_year")
	private WebElement ex_yr;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	

}
