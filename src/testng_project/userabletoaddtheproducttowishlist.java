package testng_project;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class userabletoaddtheproducttowishlist extends baeclasstwo {
	String show="https://demowebshop.tricentis.com/digital-downloads";
	String actualproduct="https://demowebshop.tricentis.com/album-3";
	String actulwhisurl="https://demowebshop.tricentis.com/wishlist";
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
//step:-click on wishlist
	driver.findElement(By.linkText("Wishlist")).click();
	String wishurl = driver.getCurrentUrl();
	System.out.println(wishurl);
	soft.assertEquals(actulwhisurl, wishurl);
	String data = driver.findElement(By.linkText("3rd Album")).getText();
	//System.out.println(data);
	Reporter.log(data,true);
	
	}


}
