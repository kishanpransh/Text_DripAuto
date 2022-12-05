package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.Base_class1;
import com.objectRepo.Object_login;

public class Test_Login_01 extends Base_class1 {
    @Test
	public void login() throws IOException, InterruptedException {
		driver=start();
		driver.get("https://app.textdrip.com/login");
		driver.manage().window().maximize();
		Object_login l=new Object_login(driver);
		l.idmethod().sendKeys("kishan@pranshtech.com");
		l.passmethod().sendKeys("Sagar@123");
		l.continuemethod().click();
		l.inboxmethod().click();
		l.numbermethod().click();
		l.messagemethod().sendKeys("kishan is a automation tester");
		l.sendmethod().click();
		l.dripmethod().click();
		l.addcampaignmethod().click();
		l.campaign_namemethod().sendKeys("Automation drip");
		l.message_bodymethod().sendKeys("hi I am trying to send drip by automation testing");
		l.set_timemethod().clear();
    	l.set_timemethod().sendKeys("10");
        l.save_Campaignmethod().click();
        driver.navigate().refresh();
        driver.navigate().to("https://app.textdrip.com/");
        l.inboxxmethod().click();
        l.Contacttmethod().click();
         Thread.sleep(5000);
        l.add_Campmethod().click();
        l.camp_dropmethod().click();
        l.select_dropmethod().click();
        l.add_campatmethodd().click();
        
       
        
       
        
        
	}
}

