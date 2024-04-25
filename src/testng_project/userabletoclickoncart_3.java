package testng_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class userabletoclickoncart_3 extends baeclasstwo{
public void method2 () {
	String actuallogintitle="Demo Web Shop";
	String actualsearch="Demo Web Shop. Search";
	String actualcart="https://demowebshop.tricentis.com/search?q=jewelry";
	//step:- user search for product
			WebElement searchbar = driver.findElement(By.xpath("//input[@value=\"Search store\"]"));
			searchbar.sendKeys("jewelry");
			String text = searchbar.getAttribute("value");
			Reporter.log(text,true);
			//step:-9 user click on search icon
			driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
			String seartitle = driver.getTitle();
			soft.assertEquals(actualsearch, seartitle);
			//step:-user cart the cart
			 driver.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
			String carttitle= driver.getCurrentUrl();
			soft.assertEquals(actualcart, carttitle);
			
}
}
