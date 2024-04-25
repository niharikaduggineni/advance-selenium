package simple_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_registrationvaliddata_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualurl="https://demowebshop.tricentis.com/";
		String actualpagetitle="Demo Web Shop. Login";
		String actualregistrationtitle="Demo Web Shop. Register";
		String actualfirstname="niharika";
		String actuallastname="meka";
		String actualemail="sailajameka@gmail.com";
		String actualpassword="Nihakari@123";
		String comfornpassword="Nihakari@123";
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
				 //step:-4 enter data in all fields
				 WebElement radio = driver.findElement(By.id("gender-female"));
				 radio.click();
				 if(radio.isSelected()){
					 System.out.println("user able to select radio button");
				 }else {
					 System.out.println("user able to not select radio button");
				 }
				 WebElement firstname = driver.findElement(By.id("FirstName"));
				 firstname.sendKeys("niharika");
				String data = firstname.getAttribute("value");
				System.out.println(data);
				if(actualfirstname.equals(data)) {
					 System.out.println("user able to enter data in firstname");
				 }
				 else {
					 System.out.println("user not able to enter data in firstname");
				 }
				 WebElement lastname = driver.findElement(By.id("LastName"));
				 lastname.sendKeys("meka");
				 String lastdata = lastname.getAttribute("value");
				 if(actuallastname.equals(lastdata)) {
					 System.out.println("user able to enter data in lastname");
				 }
				 else {
					 System.out.println("user not able to enter data in lastname");
				 }
				 WebElement email = driver.findElement(By.id("Email"));
				 email.sendKeys("sailajameka@gmail.com");
				 String emaildata = email.getAttribute("value");
				 if(actualemail.equals(emaildata)) {
					 System.out.println("user enter email");
				 }else {
					 System.out.println("user not able to enter");
				 }
				 WebElement password = driver.findElement(By.id("Password"));
				 password.sendKeys("Nihakari@123");
				String passworddata = password.getAttribute("value");
				 if(actualpassword.equals(passworddata)) {
					 System.out.println("user able to enter passwod");
				 }else {
					 System.out.println("user not able to enter password");
				 }
				 WebElement conformpassword = driver.findElement(By.id("ConfirmPassword"));
				 conformpassword.sendKeys("Nihakari@123");
				 String conformdata = conformpassword.getAttribute("value");
				 if(comfornpassword.equals(conformdata)) {
					 System.out.println("user able to enter compasswod");
				 }else {
					 System.out.println("user not able to enter compassword");
				 }
				WebElement regibutton = driver.findElement(By.id("register-button"));
				regibutton.click();
				
	}

}
