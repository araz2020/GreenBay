package com.GH_GitLab.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenHouse_Base {
	
	public static Properties prop;
	public static WebDriver driver;
	public static WebDriverWait ar_wait;
	
	public GreenHouse_Base() {
		
	try {
	prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\ars_n\\eclipse-workspace\\GreenHouse\\src\\main\\java\\com\\GreenHouse\\config\\GH_Config.properties");
	prop.load(ip);
		
		} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialSteps() {
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Hard Disk\\Driver For Selenium\\Bayada/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browsername.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\FireFoxDriver\\geckodriver.exe");
			  driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//WebDriverWait ar_wait = new WebDriverWait(driver, 40);
		
		
		
	}
	
	
	
	

}
