package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pomimplements extends baseclass  {
	
@Test
public void implement() {
	//WebDriver driver=new ChromeDriver();
	registrationpage page=new registrationpage(driver);
	page.getRegistrationlink().click();
	page.getRadiobutton().click();
	page.getFirstname().sendKeys("pooja");
	page.getLastname().sendKeys("latha");
	page.getEmail().sendKeys("niharika@gmail.com");
	page.getPassword().sendKeys("Niharika@123");
	page.getComformpassword().sendKeys("Niharika@123");
	page.getRegistrationbutton().click();
}
	
}
