package testng_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import gnericclub.constantvalue;

public class baseclass {
	WebDriver driver;
	String actualURl = "https://demowebshop.tricentis.com/";
	String actualLoginUrl = "https://demowebshop.tricentis.com/login";
	String actualuserName = "niharikaduggineni@gmail.com";
	String actualPassword = "Niharika@123";


	@BeforeSuite
	public void beforesuite() {
		Reporter.log("report star",true);
		Reporter.log("data base connect start",true);
	}
		@AfterSuite
		public void aftersuite() {
			Reporter.log("report star stop",true);
			Reporter.log("data base connect stop",true);
		}
		@BeforeTest
			public void browsersetUp() throws InterruptedException {
				driver = new ChromeDriver();
				Reporter.log("User is able to open empty browser", true);
				driver.manage().window().maximize();
				Reporter.log("User is able to maximize the browser", true);
				driver.get(constantvalue.profilepath);
				String currentUrl = driver.getCurrentUrl();
				if (actualURl.equals(currentUrl)) {
					Reporter.log("User is able to land on demowebshop", true);
				} else {
					Reporter.log("User is not able to land on demowebshop", true);
				}
				Thread.sleep(3000);
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
			if (actualLoginUrl.equals(loginUrl)) {
				Reporter.log("User is able to land on login page", true);
			} else {
				Reporter.log("User is not able to land on login page", true);
			}

			WebElement emailTextBox = driver.findElement(By.id("Email"));
			emailTextBox.sendKeys(actualuserName);
			String emailData = emailTextBox.getAttribute("value");
			if (actualuserName.equals(emailData)) {
				Reporter.log("User is able to enetr valid data for emailTextBox", true);
			} else {
				Reporter.log("User is not able to enter valid data for emailTextBox", true);
			}

			WebElement pwdTextBox = driver.findElement(By.id("Password"));
			pwdTextBox.sendKeys(actualPassword);
			String pwdData = pwdTextBox.getAttribute("value");
			if (actualPassword.equals(pwdData)) {
				Reporter.log("User is able to enetr valid data for password text box", true);
			} else {
				Reporter.log("User is not able to enter valid data for password text box", true);
			}
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
		

		
	
	
	


