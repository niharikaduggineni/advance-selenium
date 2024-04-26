package testng_project;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import gnericclub.constantvalue;
import utility.utilityclass;
import utility.utilitymethods;

public class baeclasstwo { 
	WebDriver driver;
	SoftAssert soft = new SoftAssert();
	utilityclass uc=new utilityclass();
	String actualURl ="https://demowebshop.tricentis.com";
	String actualLoginUrl = "https://demowebshop.tricentis.com/login";
	String actualurl="https://demowebshop.tricentis.com/";
	String actualuserName = "niharikaduggineni@gmail.com";
	String actualPassword = "Niharika@123";
	@BeforeTest
	public void browsersetUp() throws Throwable {
		driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the browser", true);
		driver.get(uc.redthedatefrompropfile(constantvalue.profilepath,"url"));
		String currentUrl = utilitymethods.getcurrenturl();
		soft.assertEquals( actualURl,currentUrl);
	}
@AfterTest
public void allwindowclose() {
	driver.close();
	Reporter.log("enter broser as to close",true);
	
}
@BeforeMethod
public void userLogin() throws InterruptedException {
	driver.findElement(By.linkText("Log in")).click();
	String loginUrl = driver.getCurrentUrl();
	soft.assertEquals(actualLoginUrl, loginUrl);
	WebElement emailTextBox = driver.findElement(By.id("Email"));
	emailTextBox.sendKeys(actualuserName);
	String emailData = emailTextBox.getAttribute("value");
	soft.assertEquals(actualuserName,emailData);
	WebElement pwdTextBox = driver.findElement(By.id("Password"));
	pwdTextBox.sendKeys(actualPassword);
	String pwdData = pwdTextBox.getAttribute("value");
	soft.assertEquals(actualPassword, pwdData);
	WebElement checkBox = driver.findElement(By.id("RememberMe"));
	checkBox.click();
	if (checkBox.isSelected()) {
		Reporter.log("User is able to click on CheckBOX", true);
	} else {
		Reporter.log("User is not able to clik on checkbox", true);
	}

	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Reporter.log("User login", true);
}
@AfterMethod
public void userLogOut() {
	driver.findElement(By.linkText("Log out")).click();
	Reporter.log("User logout", true);
}
}