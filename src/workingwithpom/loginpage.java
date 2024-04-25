package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
public loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Log in")
private WebElement lognlink;

@FindBy(id = "Email")
private WebElement emailtextbox;

@FindBy(id="Password")
private WebElement passwordtextfield;

@FindBy(id="RememberMe")
private WebElement remebermebox;

@FindBy(xpath = "//input[@value=\"Log in\"]")
private WebElement loginbutton;

public WebElement getLognlink() {
	return lognlink;
}

public WebElement getEmailtextbox() {
	return emailtextbox;
}

public WebElement getPasswordtextfield() {
	return passwordtextfield;
}

public WebElement getRemebermebox() {
	return remebermebox;
}

public WebElement getLoginbutton() {
	return loginbutton;
}

}
