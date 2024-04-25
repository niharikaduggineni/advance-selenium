package simple_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_one {

	public static void main(String[] args) {
		String actualurl="https://demowebshop.tricentis.com/";
		String actualpagetitle="Demo Web Shop. Login";
		String actualemail="niharikaduggineni@gmail.com";
		String actualpassword="Niharika@123";
		String actuallogintitle="Demo Web Shop";
		// TODO Auto-generated method stub
		//user able to login into application
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
		//step:-click on login button
		driver.findElement(By.linkText("Log in")).click();
		String curenttitle = driver.getTitle();
		if(actualpagetitle.equals(curenttitle)) {
			System.out.println("user able to click on login");
		}else {
			System.out.println("user able to not able to click on login");
		}
		//step:-4 enter the email in email textfield
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("niharikaduggineni@gmail.com");
		String value = email.getAttribute("value");
		System.out.println(value);
		if(actualemail.equals(value)) {
			System.out.println("user able to enter email");
		}else {
			System.out.println("user anot able to enter email");
		}
		//step:-5 enter the pasword in password textfield
		WebElement password= driver.findElement(By.id("Password"));
		password.sendKeys("Niharika@123");
		String value1 = password.getAttribute("value");
		System.out.println(value1);
		if(actualpassword.equals(value1)) {
			System.out.println("user able to enter password");
		}else {
			System.out.println("user not able to enter password");
		}
		//step:-6 click the check box
		WebElement checkbox = driver.findElement(By.id("RememberMe"));
		checkbox.click();
		if(checkbox.isSelected()){
			System.out.println("user able to click");
		}else {
			System.out.println("user not able  to click");
		}
		//step:- click on login button
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		String logntitle = driver.getTitle();
		System.out.println(logntitle);
		if(actuallogintitle.equals(logntitle)) {
			System.out.println("user able to click on login");
		}else {
			System.out.println("user not able to click on login");
		}
		//step:-8 user quit
		
		driver.close();
		System.out.println("user able to quit");
	}
	
	
}
