package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Base_class1 {
	//taking webdriver interface
	public WebDriver driver;
	//broswe invoking code
	@BeforeTest
	public WebDriver start() throws IOException {
		Properties p=new Properties();
		FileInputStream f =new FileInputStream("C:\\Users\\wetec\\eclipse-workspace\\Text_Drip-Framework\\Data.properties");
	    p.load(f);
	    String brows=p.getProperty("brows");
	    if(brows.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\wetec\\eclipse-workspace\\Text_Drip-Framework\\Drivers\\chromedriver.exe");
	    	driver =new ChromeDriver();
	  	    }
	    else if(brows.equals("firefox")){
	    	System.setProperty("Webdriver.gecodriver.driver", "C:\\Users\\wetec\\eclipse-workspace\\Text_Drip-Framework\\Drivers\\geckodriver.exe");
	    	driver=new FirefoxDriver();
	    }
	    else{
	    	System.setProperty("webdriver.edge.driver", "C:\\Users\\wetec\\eclipse-workspace\\Text_Drip-Framework\\Drivers\\msedgedriver.exe");
	   // 	driver.new EdgeDriver();
	    }
	    

	    		    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    return driver;
	   
	}
	//browser tesrdown code, close code
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(500);
		driver.close();
	}

}
