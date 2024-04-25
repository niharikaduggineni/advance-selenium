package workonunittesttool;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingonscreenshot {
	String actalurl="https://demowebshop.tricentis.com/";
@Test
public void login() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	String currenturl=driver.getCurrentUrl();
	assertEquals(actalurl, currenturl);
	driver.quit();
}
}
