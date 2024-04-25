package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationpage  {
	
	public registrationpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	
	@FindBy (linkText="Register")
	private WebElement registrationlink;
	
	@FindBy(id="gender-female")
	private WebElement radiobutton;
	
	@FindBy (id="FirstName")
	private WebElement firstname;
	
	@FindBy (id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy (id="Password")
	private WebElement password;
	
	@FindBy (id="ConfirmPassword")
	private WebElement comformpassword;
	
	@FindBy(id="register-button")
	private WebElement registrationbutton;

	public WebElement getRegistrationlink() {
		return registrationlink;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getComformpassword() {
		return comformpassword;
	}

	public WebElement getRegistrationbutton() {
		return registrationbutton;
	}
	
	

}
