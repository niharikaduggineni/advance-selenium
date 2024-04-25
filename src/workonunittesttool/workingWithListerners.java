package workonunittesttool;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class workingWithListerners implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime systemtime = LocalDateTime.now();
		System.out.println(systemtime);
		String srnshtime = systemtime.toString().replace(":","-");
		TakesScreenshot ts = (TakesScreenshot)loginscript.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./errorshort/"+srnshtime+".png");
	try {
		FileHandler.copy(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(result.getName()+"testcase fail");
	}


}
