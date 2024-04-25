package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class pomlognimple extends baseclass {
@Test
public void implemet() {
	loginpage page=new loginpage(driver);
	page.getLognlink().click();
	page.getEmailtextbox().sendKeys("niharikaduggineni@gmail.com");
	page.getPasswordtextfield().sendKeys("Niharika@123");
	page.getRemebermebox().click();
	page.getLoginbutton().click();
}
}
