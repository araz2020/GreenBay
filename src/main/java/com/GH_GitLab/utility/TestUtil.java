package com.GH_GitLab.utility;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.GH_GitLab.base.GreenHouse_Base;
public class TestUtil extends GreenHouse_Base {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 30;
	
	public void switchToFrame(){
		driver.switchTo().frame("FrameNamewill be here");
	}
	public String AR_getScreenshot(String ScreenshotName) throws IOException {

		String dateName = new SimpleDateFormat ("yyyymmddhhmmss").format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String picDestination = System.getProperty("user.dir")+ "\\AR_ScreenShot\\"+ScreenshotName+dateName+".png";
		File finalDes = new File (picDestination);
		FileUtils.copyFile (source,finalDes);
		return picDestination;
		}

	public void pageVerification_If_Else() {
		String actual_Title = driver.getTitle();
		String expected = "Greenhouse";
		if(actual_Title.equals(expected)) {
			System.out.println("I am in Right Application");
		}else {
			System.out.println("TestCase Failed");
		}
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
public void srollDown() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,1300)");
}


}
