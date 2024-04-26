package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class utilityclass {
	/**
	 * 
	 * @param path
	 * @param key
	 * @param j 
	 * @param i 
	 * @return String
	 * @throws Throwable
	 */
public  String redthedatefrompropfile(String path, String key) throws Throwable {
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	Properties pro = new Properties();
	pro.load(fis);
	String value = pro.getProperty(key);
	return value;
	
}
/**
 * 
 * @param path
 * @param sheetname
 * @param rownum
 * @param cellnum
 * @return
 * @throws Throwable
 */
public String readthedatafromexcelcellsinglevaue(String path,String sheetname,int rownum,int cellnum) throws Throwable {
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	 Workbook workbook = WorkbookFactory.create(fis);
	 String datacell = workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
	return datacell;
	
}
public String[] readthedatafromsinglerow(String path,String sheetname,int rownum) throws Throwable {
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	 Workbook workbook = WorkbookFactory.create(fis);
	 int noofcul = workbook.getSheet(sheetname).getRow(rownum).getPhysicalNumberOfCells();
	 String[]data=new String[noofcul];
	 for (int i = 0; i < noofcul; i++) {
		data[i]=workbook.getSheet(sheetname).getRow(rownum).getCell(i).toString();
	}
	 return data;
	 
}
	public static String[][]registrationdata(String path,String sheetname) throws Throwable {
		//step:-1
		File file = new File(path);
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
}

