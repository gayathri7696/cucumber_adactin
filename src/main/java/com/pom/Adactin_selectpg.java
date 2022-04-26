package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_selectpg {
	public static WebDriver driver;
@FindBy(id="radiobutton_0")
private WebElement radio_btn;
public Adactin_selectpg(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getRadio_btn() {
	return radio_btn;
}
public WebElement getCont() {
	return cont;
}
@FindBy(id="continue")
private WebElement cont;
}
