package simple_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_REGISTRATIONWOTHOUTDATA_003 {

	public static void main(String[] args) {
		String actualurl="https://demowebshop.tricentis.com/";
		String actualpagetitle="Demo Web Shop. Login";
		String actualregistrationtitle="Demo Web Shop. Register";
		
		
		//step:- 1 open the broswer
		WebDriver driver=new ChromeDriver();
		System.out.println("user able to open the empty broswer");
		driver.manage().window().maximize();
		System.out.println("user able to maximise the window");
		//step:-2 enter the url
		driver.get("https://demowebshop.tricentis.com");
		String url = driver.getCurrentUrl();
		if(actualurl.equals(url)) {
			System.out.println("user able to open the demowork shop");
		}else
		{
			System.out.println("user not able to open the demo work shop");
		}
		//step:-3 click on registration
		 driver.findElement(By.linkText("Register")).click();
		 String registitle = driver.getTitle();
		 System.out.println(registitle);
		 if(actualregistrationtitle.equals(registitle)) {
			 System.out.println("user able to click on regi");
		 }else
		 {
			 System.out.println("enter able to not click regi");
		 }
	 
		WebElement regibutton = driver.findElement(By.id("register-button"));
		regibutton.click();
		WebElement firsterror = driver.findElement(By.xpath("//span[contains(text(),\"First name is required\")]"));
		String error = firsterror.getText();
		System.out.println(error);
		WebElement lasterror = driver.findElement(By.xpath("//span[contains(text(),\"Last name is required\")]"));
		String error1 = lasterror.getText();
		System.out.println("error "+error1); 
		WebElement emailerror = driver.findElement(By.xpath("//span[contains(text(),\"Email is required\")]"));
		String error2 = emailerror.getText();
		System.out.println(error2); 
		WebElement passworderror = driver.findElement(By.xpath("//span[contains(text(),\"Password is required\")][1]"));
		String error3 = passworderror.getText();
		System.out.println(error3); 
		
	}

}
