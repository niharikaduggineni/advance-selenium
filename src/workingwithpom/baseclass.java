package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class baseclass {
	WebDriver driver;
	//SoftAssert soft = new SoftAssert();
	String actualURl = "https://demowebshop.tricentis.com/";
	String actualLoginUrl = "https://demowebshop.tricentis.com/login";
	String actualuserName = "niharikaduggineni@gmail.com";
	String actualPassword = "Niharika@123";
	@BeforeTest
	public void browsersetUp() throws InterruptedException {
		driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the browser", true);
		driver.get("https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl();
		//soft.assertEquals( actualURl,currentUrl);
	}
@AfterTest(enabled = false)
public void allwindowclose() {
	driver.close();
	Reporter.log("enter broser as to close",true);
	//soft.assertAll();
}

}
