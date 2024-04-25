package workonunittesttool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingwithmultipletestdada {
	@DataProvider(name="regUser")
	public String[][]registrationdata() throws Throwable {
		//step:-1
		File file = new File("./textdata/regdata.xlsx");
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
		driver.findElement(By.linkText("Register")).click();

		if (dataReg[0].equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
		}
		if (dataReg[0].equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(dataReg[1]);
		driver.findElement(By.id("LastName")).sendKeys(dataReg[2]);
		driver.findElement(By.id("Email")).sendKeys(dataReg[3]);
		driver.findElement(By.id("Password")).sendKeys(dataReg[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(dataReg[5]);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
