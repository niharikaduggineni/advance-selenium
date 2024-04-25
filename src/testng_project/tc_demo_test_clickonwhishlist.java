package testng_project;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tc_demo_test_clickonwhishlist extends baeclasstwo {
	
	@Test
	public void varifyThatUserIsAbleToClickOnwishlist() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()=\"Wishlist\"]")).click();
		Thread.sleep(2000);
		Reporter.log("User is able to click on wishlist",true);
	}

}
