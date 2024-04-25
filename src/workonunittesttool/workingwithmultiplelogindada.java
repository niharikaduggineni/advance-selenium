package workonunittesttool;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingwithmultiplelogindada {
	@DataProvider(name="regUser")
	public String[][]registrationdata() throws Throwable {
		//step:-1
		File file = new File("./textdata/logindata.xlsx");
		//step:2
		FileInputStream fis = new FileInputStream(file);
	//step:-3
		Workbook workbook = WorkbookFactory.create(fis);
	//step:-4
		int numrows = workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
	System.out.println(numrows);
	//step:-5
	int numClm = workbook.getSheet("sheet1").getRow(0).getPhysicalNumberOfCells();
	System.out.println(numClm);
	String[][]data=new String[numrows][numClm];
	for (int i = 0; i <numrows ; i++) {
		for (int j = 0; j <numClm; j++) {
			data[i][j]=workbook.getSheet("sheet1").getRow(i).getCell(j).toString();
		}
	}
	return data;
	}
	@Test(dataProvider = "regUser")
	public void registerUser(String[] dataReg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(dataReg[0]);
		driver.findElement(By.id("Password")).sendKeys(dataReg[1]);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
