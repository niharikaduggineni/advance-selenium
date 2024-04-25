package testng_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class userabletoemailproductlink extends baeclasstwo{
	String show="https://demowebshop.tricentis.com/digital-downloads";
	String actualproduct="https://demowebshop.tricentis.com/album-3";
	String actulwhisurl="https://demowebshop.tricentis.com/wishlist";
	String actualfrindurl="https://demowebshop.tricentis.com/productemailafriend/53";
	@Test 
	public void method() {
		driver.findElement(By.linkText("Digital downloads")).click();
		String currentshow = driver.getCurrentUrl(); 
		System.out.println(currentshow);
		soft.assertEquals(show, currentshow);
		//step:-click on particulat product
		driver.findElement(By.xpath("//img[@alt=\"Picture of 3rd Album\"]")).click();
		String product = driver.getCurrentUrl();
		System.out.println(product);
		soft.assertEquals(actualproduct, product);
		//step:- add to wishlist on whishlist
		driver.findElement(By.xpath("//input[@value=\"Add to wishlist\"]")).click();
	Reporter.log("user able to click on whishlist",true);
	driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
	String frindurl = driver.getCurrentUrl();
	soft.assertEquals(actualfrindurl, frindurl);
	WebElement frind = driver.findElement(By.xpath("//input[@placeholder=\"Enter friend's email\"]"));
	frind.sendKeys("niharikameka1998@gmail.com");
	String tada1 = frind.getAttribute("value");
	Reporter.log(tada1,true);
	driver.findElement(By.xpath("//input[@value=\"Send email\"]")).click();

	}

}
