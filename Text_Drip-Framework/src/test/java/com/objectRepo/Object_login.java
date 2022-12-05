package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_login {
	//taking webdriver interface
	public WebDriver driver;
	// Taking constructor
	public Object_login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//locating id
	@FindBy(xpath="(//*[@name=\"email\"])[1]")
	WebElement id;
	public WebElement idmethod() {
		return id;
	}
	//locating pass
	@FindBy(xpath="//*[@name=\"password\"]")
	WebElement pass;
	public WebElement passmethod() {
		return pass;
	}
	//locating continue button
	@FindBy(xpath="//*[@id=\"kt_sign_in_submit\"]")
	WebElement cont;
	public WebElement continuemethod() {
		System.out.println("selenium click the continue button ");
		return cont;
	}
	//click on inbox module
	@FindBy(xpath="//*[text()=\"Inbox\"]")
	WebElement inbox;
	public WebElement inboxmethod() {
		return inbox;
	}
	//Click on the contact name
	@FindBy(xpath="(//*[@class=\"ms-2\"])[2]")
	WebElement number;
	public WebElement numbermethod() {
		return number;
	}
	//type on the message in box
	@FindBy(xpath="//*[@id=\"message\"]")
	WebElement message;
	public WebElement messagemethod() {
		return message;
	}
	//click on the send button
	@FindBy(xpath="//*[@class=\"btn btn-info send\"]")
	WebElement send;
	public WebElement sendmethod() {
		System.out.println("message send successfully");
		return send;
	}
	//click on the Drip campaign button
	@FindBy(xpath="//*[text()=\"Drip Campaigns\"]")
	WebElement drip ;
	public WebElement dripmethod() {
		return drip;
	}
	//click on the add campaign
		@FindBy(xpath="//*[@class=\"btn btn-info\"]")
		WebElement add_campaign ;
		public WebElement addcampaignmethod() {
			return add_campaign;
		}
		//click on the campaign name
		@FindBy(xpath="//*[@class=\"form-control min-w-200px\"]")
		WebElement campaign_name ;
		public WebElement campaign_namemethod() {
		return campaign_name;
		}
		//click on the Drip campaign message body
		@FindBy(xpath="//*[@class=\"form-control title\"]")
		WebElement messagebody ;
		public WebElement message_bodymethod () {
	    return messagebody;
				}
		//Fix the time in minute
			@FindBy(xpath="//*[@class=\"form-control durationVal\"]")
			WebElement set_time  ;
			public WebElement set_timemethod () {
		    return set_time;
						}
		// save the campaign, click on save button
			@FindBy(xpath="//*[@class=\"btn btn-info\"]")
			WebElement save_Campaign  ;
			public WebElement save_Campaignmethod () {
				System.out.println("Save the campaign sucessfully");
		    return save_Campaign;
				}
	  // Click on the inbox module
						@FindBy(xpath="//*[text()=\"Inbox\"]")
						WebElement inboxx  ;
						public WebElement inboxxmethod () {
					    return inboxx;
							}
					
       // Click on the contact
						@FindBy(xpath="//*[text()=\"+17476668814\"]")
						WebElement Contactt  ;
						public WebElement Contacttmethod () {
							  return Contactt;
							}
      //Click on the Add to campaign
						@FindBy(xpath="(//*[@type=\"button\"])[3]")
						WebElement add_Camp  ;
						public WebElement add_Campmethod () {
							  return add_Camp;
							}
   	//Click on the Add to campaign drop down
						@FindBy(xpath="(//*[@role=\"combobox\"])[1]")
						WebElement camp_drop  ;
						public WebElement camp_dropmethod () {
							  return camp_drop ;
							}
	//Click on the Add to campaign
						@FindBy(xpath="(//*[text()=\"Automation drip\"])[2]")
						WebElement select_drop  ;
						public WebElement select_dropmethod () {
							  return select_drop ;
							}
   //Click on the Add to campaign
						@FindBy(xpath="//*[text()=\"Add to Campaign\"]")
						WebElement add_campat  ;
						public WebElement add_campatmethodd () {
							System.out.println("campaign assign sucessfully");
							  return add_campat ;
							}
					

}
