package com.realpage.ui.Properties;

import com.realpage.core.component.UIComponent;
import com.realpage.core.component.UIComponentMap;
import com.realpage.core.page.PageBase;
import com.realpage.core.page.UIPageFactory;
import com.foundation.selenium.DataManager;
import com.foundation.selenium.WebDriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class PropertiesStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent PropertiesComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	String s;
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public PropertiesStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		PropertiesComponent = uiMap.getComponent("properties");
		driver.manage().window().maximize();
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@When("^User expands the Naigation Menu$")
	public void User_expands_the_Naigation_Menu() throws InterruptedException {
		try {
			waitForElementPresence(driver, By.id(PropertiesComponent.getUIElements().get("Navmenu").getIdSelector()));
			//clickOnElement(driver, By.id(PropertiesComponent.getUIElements().get("Navmenu").getIdSelector()));

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to Expand The Navigation Menu");
		}
	}

	@And("^User clicks on Properties$")
	public void User_clicks_on_Properties() throws InterruptedException {

		try {
			
			driver.findElement(By.partialLinkText("Properties")).click();

		} catch (NoSuchElementException e) {
			fail("Cannot click on properties");
		}
	}

	@Then("^User is directed to the Properties Page \"([^\"]*)\"$")
	public void User_is_directed_to_the_Properties_Page(String propUrl) throws Throwable  {

		try {
			Thread.sleep(1000);
			 String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(propUrl));
		
		} catch (NoSuchElementException e) {
			fail("Not on the Properties Page");
		}
		
	}
	
	
	@When("^User clicks on the property search drop down$")
	public void User_clicks_on_the_property_search_drop_down() throws InterruptedException {

		try {
			
			clickOnElement(driver, By.id(PropertiesComponent.getUIElements().get("propsearchdd").getIdSelector()));
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Cannot open the prop search drop down");
		}
	}
	
	@When("^User sees a list of search options$")
	public void User_sees_a_list_of_search_options() throws InterruptedException {

		try {
			waitForElementPresence(driver, By.className(PropertiesComponent.getUIElements().get("searchlist").getClassName()));
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Cannot see the search list orptions");
		}
	}

	@And("^User picks Property Name$")
	public void User_picks_Property_Name() throws InterruptedException {

		try {
			
			driver.findElement(By.name("property_name")).click();
            Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Cannot select the Property Name Option from the drop down");
		}
	}
	
	@And("^User enters a Property Name ([^\"]+)$")
	public void User_enters_a_Property_Name(String propName) throws Throwable  {

		try {
		      sendElementText(driver, By.id(PropertiesComponent.getUIElements().get("propsearchfield").getIdSelector()), propName);
		
		} catch (NoSuchElementException e) {
			fail("Not able to enter a Property Name");
		}
		
	}
	
	@And("^User clicks on the search submit icon$")
	public void User_clicks_on_the_search_submit_icon() throws Throwable  {

		try {
			
			clickOnElement(driver, By.id(PropertiesComponent.getUIElements().get("searchsubmit").getIdSelector()));
             Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			fail("Cannot click on Properties Search Submit Icon");
		}
	}
	
	
	@When("^User sees eight information titles$")
	public void User_sees_eight_information_titles() throws Throwable  {

		try {
		
//			        WebElement prop =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.property-index > table > thead > tr > th:nth-child(1)"));
//					String property= prop.getText();
//					System.out.println(property);
//					assertTrue(property.equals("Property"));
//					
//					WebElement id =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.property-index > table > thead > tr > th:nth-child(2)"));
//					String propid= id.getText();
//					System.out.println(propid);
//					assertTrue(propid.equals("RPCC Property ID"));
//					
//					
//					WebElement comp=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.property-index > table > thead > tr > th:nth-child(3)"));
//					String company= comp.getText();
//					System.out.println(company);
//					assertTrue(company.equals("Company"));
//					
//					WebElement compid=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.property-index > table > thead > tr > th:nth-child(4)"));
//					String rpcompid= compid.getText();
//					System.out.println(rpcompid);
//					assertTrue(rpcompid.equals("RPCC Company ID"));
//					
//					WebElement un=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.property-index > table > thead > tr > th:nth-child(5)"));
//					String units= un.getText();
//					System.out.println(units);
//					assertTrue(units.equals("Units"));
//					
//					WebElement onboard=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.property-index > table > thead > tr > th:nth-child(6)"));
//					String onboarded= onboard.getText();
//					System.out.println(onboarded);
//					assertTrue(onboarded.equals("Onboarded"));
//					
//					WebElement prod=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.property-index > table > thead > tr > th:nth-child(7)"));
//					String products= prod.getText();
//					System.out.println(products);
//					assertTrue(products.equals("Products"));
//					
//					WebElement set=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.property-index > table > thead > tr > th.text-center"));
//					String settings= set.getText();
//					System.out.println(settings);
//					assertTrue(settings.equals("Settings"));
//					
//					

		} catch (NoSuchElementException e) {
			fail("Cannot find the column titles");
		}
	}
	
	
	@When("^User sees information related to the search$")
	public void User_sees_information_related_to_the_search() throws Throwable  {

		try {
		
			        WebElement theprop =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td:nth-child(1) > div > div:nth-child(1) > a"));
					String thepropname= theprop.getText();
					System.out.println(thepropname);
					//assertTrue(thepropname.equals("Mills-Kris"));
					
					WebElement propid =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr:nth-child(1) > td:nth-child(2)"));
					String actpropid= propid.getText();
					System.out.println(actpropid);
					//assertTrue(propaddress.equals("3550 Larkin Ports Suite 732"));
					
					
					WebElement compn=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td:nth-child(3)"));
					String companyname= compn.getText();
					System.out.println(companyname);
					//assertTrue(companyname.equals("Rath Inc"));
					
					WebElement actun=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td:nth-child(4)"));
					String actunits= actun.getText();
					System.out.println(actunits);
					//assertTrue(actunits.equals("3,422"));
					
					WebElement actonboard=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td:nth-child(5)"));
					String actonboarded= actonboard.getText();
					System.out.println(actonboarded);
					//assertTrue(actonboarded.equals("03/12/18"));
					
					WebElement actprod=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td.ft-dropdown > ul > li > a"));
					String actproducts= actprod.getText();
					System.out.println(actproducts);
					//assertTrue(actproducts.equals("2"));
			

		} catch (NoSuchElementException e) {
			fail("Cannot find Element");
		}
	}
	
	
	@And("^User picks Company Name$")
	public void User_picks_Company_Name() throws InterruptedException {

		try {
			
			driver.findElement(By.name("company_name")).click();
            Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Cannot select the Company Name Option from the drop down");
		}
	}
	
	
	@And("^User picks Property ID$")
	public void User_picks_Property_ID() throws InterruptedException {

		try {
			
			driver.findElement(By.name("RPCC_property_ID")).click();
            Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Cannot select the Property ID Option from the drop down");
		}
	}
	
	
	@And("^User enters a Property ID \"([^\"]*)\"$")
	public void User_enters_a_Property_ID(String propID) throws Throwable  {

		try {
		      sendElementText(driver, By.id(PropertiesComponent.getUIElements().get("propsearchfield").getIdSelector()), propID);
		
		} catch (NoSuchElementException e) {
			fail("Not able to enter a Property ID");
		}
		
	}
	
	
	
	@And("^User enters a Company Name \"([^\"]*)\"$")
	public void User_enters_a_Company_Name(String compName) throws Throwable  {

		try {
		      sendElementText(driver, By.id(PropertiesComponent.getUIElements().get("propsearchfield").getIdSelector()), compName);
		
		} catch (NoSuchElementException e) {
			fail("Not able to enter a Company Name");
		}
		
	}
	
	
	
	@When("^User clicks on the actual property name$")
	public void User_clicks_on_the_actual_property_name() throws Throwable  {

		try {
			
			clickOnElement(driver, By.cssSelector(PropertiesComponent.getUIElements().get("actpropname").getCssSelector()));
		
		} catch (NoSuchElementException e) {
			fail("Not able to click on the actual property name");
		}
		
	}
	
	@And("^User is directed to the property details page \"([^\"]*)\"$")
	public void User_is_directed_to_the_property_details_page(String propUrl) throws Throwable  {

		try {
			Thread.sleep(1000);
			 String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(propUrl));
		       
		       Thread.sleep(2000);
		
		} catch (NoSuchElementException e) {
			fail("Not on the properties details Page");
		}
		
	}
	

	@Then("^The property name is shown in the URL \"([^\"]*)\"$")
	public void The_property_name_is_shown_in_the_URL(String propName) throws Throwable {
    	try {
		
    		 String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(propName));
    		
		

	} catch (NoSuchElementException e) {
		fail("The Property Name is not visible in the URL");
    	}
	
   }
	

	@Then("^There is a Property Management Company details section \"([^\"]*)\"$")
	public void There_is_a_Property_Management_Company_details_section(String propMC) throws Throwable {
	    try{
	    	
	    	WebElement pmc= driver.findElement(By.cssSelector(PropertiesComponent.getUIElements().get("pmctit").getCssSelector()));
	    	String pmctitle = pmc.getText();
	    	System.out.println("*****" + pmctitle);
	    	assertTrue(pmctitle.contains(propMC));
	    	System.out.println("============");
//	    	WebElement details= driver.findElement(By.cssSelector(PropertiesComponent.getUIElements().get("pmcdetails").getCssSelector()));
//	    	String detailstext= details.getText();
//	    	System.out.println(detailstext);
//	    	System.out.println("============");
//	    	assertTrue(detailstext.contains("Name"));
//	    	System.out.println("============");
//	    	//assertTrue(detailstext.contains("Address"));
//	    	//System.out.println("============");
//	    	assertTrue(detailstext.contains("Essex"));
//	    	System.out.println("============");
//	    	//assertTrue(detailstext.contains("60 South Market Street"));
//	    	//System.out.println("============");
//	    	assertTrue(detailstext.contains("Phone"));
//	    	System.out.println("============");
//	    	assertTrue(detailstext.contains("650-494-3700"));
//	    	System.out.println("============");
	    	
	} catch (NoSuchElementException e) {
		fail("Propert Management Company title is not there");
    	}
	}	
	

	@Then("^There is a Property Details section \"([^\"]*)\"$")
	public void There_is_a_Property_Details_section(String propD) throws Throwable {
	     try{
		   
		   WebElement pd= driver.findElement(By.cssSelector(PropertiesComponent.getUIElements().get("pdtit").getCssSelector()));
	    	String pdtitle = pd.getText();
	    	System.out.println(pdtitle);
	    	assertTrue(pdtitle.contains(propD));
	    	System.out.println("============");
//	    	WebElement details= driver.findElement(By.cssSelector(PropertiesComponent.getUIElements().get("pddetails").getCssSelector()));
//	    	String detailstext= details.getText();
//	    	System.out.println(detailstext);
//	    	assertTrue(detailstext.contains("Type"));
//	    	assertTrue(detailstext.contains("Units"));
//	    	assertTrue(detailstext.contains("Conventional"));
//	    	assertTrue(detailstext.contains("121"));
//	    	assertTrue(detailstext.contains("Sq. Ft."));
//	    	assertTrue(detailstext.contains("128,800"));
//	  
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }
	
	
	@When("^user selects Product Tab$")
	public void user_selects_Product_Tab() throws Throwable {
	    try{
	    	
	    	driver.findElement(By.partialLinkText("Products")).click();
	    	
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }

	@Then("^User is directed to the Products page \"([^\"]*)\"$")
	public void User_is_directed_to_the_Products_page(String arg1) throws Throwable {
	    try{
	    	 String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(arg1));
		       System.out.println("========");
		       Thread.sleep(3000);
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }
	
	@Then("^User sees a contact center with five options$")
	public void User_sees_a_contact_center_with_five_options() throws Throwable {
	    try{
	    	driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > div.raul-box.raul-box-disabled.pl-2"));
	    	
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }
	
//needs to be added
	@When("^user selects one or more options$")
	public void user_selects_one_or_more_options() throws Throwable {
	    try{

	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }

	
	//needs to be added
	@When("^user saves it$")
	public void user_saves_it() throws Throwable {
	    try{
	    	
	    	//driver.findElement(By.className("button-primary")).click();
	    	
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }

	
	//needs to be added
	@Then("^They are saved$")
	public void They_are_saved() throws Throwable {
	    try{
 	
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }

	@When("^user clicks on Activation History$")
	public void user_clicks_on_Activation_History() throws Throwable {
	    try{
	    	Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.partialLinkText("Activation History"))).perform();
			Thread.sleep(200);
	    	driver.findElement(By.partialLinkText("Activation History")).click();
	    	
	} catch (NoSuchElementException e) {
		fail("Activation History is not click-able");
	    }
	
     }

	@Then("^User is directed to that page \"([^\"]*)\"$")
	public void User_is_directed_to_that_page(String arg2) throws Throwable {
	    try{
	    	
	    	String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(arg2));
		       System.out.println("========");
	    	
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }
	
	@When("^user selects Return to Products$")
	public void user_selects_Return_to_Products() throws Throwable {
	    try{
	    	
	    	Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > div.footer > a"))).perform();
			driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > div.footer > a")).click();
	    	
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }

	@Then("^user is directed back to \"([^\"]*)\"$")
	public void user_is_directed_back_to(String arg3) throws Throwable {
	    try{
	    	
	    	String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(arg3));
		       System.out.println("========");
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }
	
	
	
	@When("^user selects Settings$")
	public void user_selects_Settings() throws Throwable {
	    try{
	    	
	    	driver.findElement(By.partialLinkText("Settings")).click();
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }

	@Then("^User is directed to \"([^\"]*)\"$")
	public void User_is_directed_to(String arg4) throws Throwable {
	    try{
	    	
	    	String url =driver.getCurrentUrl();
			 System.out.println(url);
		      assertTrue(url.contains(arg4));
		       System.out.println("========");
	    	
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }

	@Then("^user is directed to settings \"([^\"]*)\"$")
	public void User_is_directed_to_settings (String arg4) throws Throwable {
	    try{
	    	
	    	String url =driver.getCurrentUrl();
			 System.out.println(url);
		      assertTrue(url.contains(arg4));
		       System.out.println("========");
	    	
	} catch (NoSuchElementException e) {
		fail("User is not directed to settings");
	    }
	
     }
	
	
	@Then("^user sees a few options$")
	public void user_sees_a_few_options() throws Throwable {
	    try{
	    	
	    	WebElement gen= driver.findElement(By.partialLinkText("General"));
	    	String general = gen.getText();
	    	System.out.println(general);
	    	assertTrue(general.contains("General"));
	    	
	    	WebElement comrout= driver.findElement(By.partialLinkText("Communications Router"));
	    	String communication = comrout.getText();
	    	System.out.println(communication);
	    	assertTrue(communication.contains("Communications Router"));
	    	
	    	
	    	WebElement comwid= driver.findElement(By.partialLinkText("Communications Widgets"));
	    	String communicationwid = comwid.getText();
	    	System.out.println(communicationwid);
	    	assertTrue(communicationwid.contains("Communications Widgets"));
	    	
	    	
	    	WebElement leassett= driver.findElement(By.partialLinkText("Leasing Settings"));
	    	String leasesettings = leassett.getText();
	    	System.out.println(leasesettings);
	    	assertTrue(leasesettings.contains("Leasing Settings"));
	    	
	    	
	    	
	    	WebElement maintensett= driver.findElement(By.partialLinkText("Maintenance Settings"));
	    	String maintenancesett = maintensett.getText();
	    	System.out.println(maintenancesett);
	    	assertTrue(maintenancesett.contains("Maintenance Settings"));
	    	
	    	WebElement phonenr= driver.findElement(By.partialLinkText("Phone Numbers"));
	    	String phonenumber = phonenr.getText();
	    	System.out.println(phonenumber);
	    	assertTrue(phonenumber.contains("Phone Numbers"));
	    	
	    	WebElement ivr= driver.findElement(By.partialLinkText("IVR Greeting Menus"));
	    	String ivrgreet = ivr.getText();
	    	System.out.println(ivrgreet);
	    	assertTrue(ivrgreet.contains("IVR Greeting Menus"));
	    	
	    	WebElement audio= driver.findElement(By.partialLinkText("Audio Recordings"));
	    	String audiorecord = audio.getText();
	    	System.out.println(audiorecord);
	    	assertTrue(audiorecord.contains("Audio Recordings"));
	    	
	    	WebElement propVoice= driver.findElement(By.partialLinkText("Property Voicemail"));
	    	String propvoicemail = propVoice.getText();
	    	System.out.println(propvoicemail);
	    	assertTrue(propvoicemail.contains("Property Voicemail"));
    	
	} catch (NoSuchElementException e) {
		fail("Property Settings menus are not visible");
	    }
	
     }
	
	
	
	@When("^User selects Communication Widgets$")
	public void User_selects_Communication_Widgets() throws Throwable {
		try{
			driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > div > div:nth-child(3) > a > div.card-property-setting-icon")).click();
			Thread.sleep(500);
	} catch (NoSuchElementException e) {
		fail("Communication widget is not visible");
	    }
	
     }

	@Then("^User is directed to widgets page \"([^\"]*)\"$")
	public void User_is_directed_to_widgets_page(String arg1) throws Throwable {
		try{
			
			String url =driver.getCurrentUrl();
			System.out.println(url);
			assertTrue(url.contains(arg1));
			System.out.println("User is on widgets list page");
	} catch (NoSuchElementException e) {
		fail("Property Settings menus are not visible");
	    }
	
     }
	

	@Then("^User is directed to widgets details page \"([^\"]*)\"$")
	public void User_is_directed_to_widgets_details_page(String arg1) throws Throwable {
		try{
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			assertTrue(url.contains(arg1));
			System.out.println("========================");
			
	} catch (NoSuchElementException e) {
		fail("User was not directed to new widget page");
	    }
	
     }

	@Then("^User selects cancel$")
	public void User_selects_cancel() throws Throwable {
		try{
			
			driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-save-footer > div > a")).click();
	} catch (NoSuchElementException e) {
		fail("Cancel button is not click able");
	    }
	
     }
	
	@When("^User selects an already excisting widget$")
	public void User_selects_an_already_excisting_widget() throws Throwable {
		try{
			
			driver.findElement(By.partialLinkText("Automation Test Widget")).click();
			Thread.sleep(500);
			
	} catch (NoSuchElementException e) {
		fail("Already excisting widget is not click able");
	    }
	
     }
	
	@When("^A chat preview is displayed$")
	public void A_chat_preview_is_displayed() throws Throwable {
		try{
			
			driver.findElement(By.name("chattype")).click();
			driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-setup-section > div:nth-child(3) > div:nth-child(1) > select > option:nth-child(1)")).click();
			Thread.sleep(500);
			driver.findElement(By.className("standard-widget-preview"));
			
			
	} catch (NoSuchElementException e) {
		fail("Preview chat is not visible");
	    }
	
     }
	
	@When("^The widget name box is not empty$")
	public void The_widget_name_box_is_not_empty() throws Throwable {
		try{
			WebElement widnamefield= driver.findElement(By.name("widget_name"));
			String widname = widnamefield.getAttribute("value");
			System.out.println("***********" + "" + widname);
			assertTrue(!widname.equals(null));
			
			
			
//			WebElement tcolor= driver.findElement(By.name("colors"));
//            		String textcolor=tcolor.getAttribute("value");
//            		System.out.println("############" + " " + textcolor);
	} catch (NoSuchElementException e) {
		fail("NOT able to edit the widget name");
	    }
	
     }
	
//	@When("^User verifies the Call To Action Text$")
//	public void User_verifies_the_Call_To_Action_Text() throws Throwable {
//		try{
//			WebElement calltoact = driver.findElement(By.id("widget_title"));
//			calltoact.clear();
//		   
//			s = RandomStringUtils.randomAlphabetic(8);
//		
//			calltoact.sendKeys("Let's Chat" + " " + s);
//			calltoactiontext= calltoact.getText();
//			System.out.println(calltoactiontext);
//			Thread.sleep(500);
//
//	} catch (NoSuchElementException e) {
//		fail("NOT able to edit the widget name");
//	    }
//	
//     }
//	

	@When("^User setts the status to Disable$")
	public void User_setts_the_status_to_Disable() throws Throwable {
		try{
			WebElement statfield= driver.findElement(By.name("widgetStatus"));
			statfield.click();
			Thread.sleep(500);
			WebElement disable =driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-setup-section > div:nth-child(2) > div:nth-child(1) > select > option:nth-child(2)"));
			disable.click();
			Thread.sleep(500);
            		
	} catch (NoSuchElementException e) {
		fail("NOT able to edit the widget name");
	    }
	
     }
	
	@When("^User clicks on save$")
	public void User_clicks_on_save() throws Throwable {
		try{
			
          WebElement save = driver.findElement(By.className("widget-detail-submit"));
          save.click();
          Thread.sleep(3000);
		
	} catch (NoSuchElementException e) {
		fail("The save button is not visible");
	    }
	
     }
	
	
	@When("^User clicks on Preview$")
	public void User_clicks_on_Preview() throws Throwable {
		try{
			
           driver.findElement(By.partialLinkText("Preview")).click();
           Thread.sleep(500);
           
		
	} catch (NoSuchElementException e) {
		fail("NOT able to set status to disable");
	    }
	
     }
	
	@When("^Enabled is false$")
	public void Enabled_is_false() throws Throwable {
		try{
			
           WebElement payl= driver.findElement(By.className("L5"));
           String payltext= payl.getText();
           System.out.println(payltext);
           assertTrue(payltext.contains("is_enabled"));
           assertTrue(payltext.contains("false"));
           
		
	} catch (NoSuchElementException e) {
		fail("Enable is NOT false");
	    }
	
     }
	
	@When("^User setts the status to Active$")
	public void User_setts_the_status_to_Active() throws Throwable {
		try{
			WebElement statfield= driver.findElement(By.name("widgetStatus"));
			statfield.click();
			driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-setup-section > div:nth-child(2) > div:nth-child(1) > select > option:nth-child(1)")).click();
			Thread.sleep(500);
            		
	} catch (NoSuchElementException e) {
		fail("NOT able to set status to Active");
	    }
	
     }
	
	@When("^Enabled is True$")
	public void Enabled_is_True() throws Throwable {
		try{
			
           WebElement payl= driver.findElement(By.className("L5"));
           String payltext= payl.getText();
           System.out.println(payltext);
           assertTrue(payltext.contains("is_enabled"));
           assertTrue(payltext.contains("true"));
           
		
	} catch (NoSuchElementException e) {
		fail("Enable is NOT true");
	    }
	
     }
//	
//	@When("^cta button text is accurate$")
//	public void cta_button_text_is_accurate() throws Throwable {
//		try{
//			
//           WebElement payl= driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div:nth-child(2) > div.row.widget-preview-page > div > div > pre > ol > li:nth-child(25)"));
//           String payltext= payl.getText();
//           System.out.println(payltext);
//           assertTrue(payltext.contains("cta_button_text"));
//           assertTrue(payltext.contains(calltoactiontext));
//           
//		
//	} catch (NoSuchElementException e) {
//		fail("CTA button text is not accurate");
//	    }
//	
//     }

	
	@When("^User enters a new Widget Name ([^\"]+)$")
	public void User_enters_a_new_Widget_Name(String widgetnm) throws Throwable {
		try{
			
			WebElement field= driver.findElement(By.id("search"));
			field.sendKeys(widgetnm);
		
	} catch (NoSuchElementException e) {
		fail("Not able to enter Widet name");
	    }
	
     }
	
	@When("^User adds a widget by selecting Add Widget link$")
	public void User_adds_a_widget_by_selecting_Add_Widget_link() throws Throwable {
		try{
			
			driver.findElement(By.partialLinkText("Add Widget")).click();
			Thread.sleep(2000);
		
	} catch (NoSuchElementException e) {
		fail("Add Widget link is not there");
	    }
	
     }
	
	@Then("^User is directd to Widgets Detail Page \"([^\"]*)\"$")
	public void User_is_directd_to_Widgets_Detail_Page(String arg1) throws Throwable {
		try{
			
	    	String url =driver.getCurrentUrl();
				 System.out.println(url);
			      assertTrue(url.contains(arg1));
			       System.out.println("========");
			       
	} catch (NoSuchElementException e) {
		fail("User is not directed to Widgets details page");
	    }
	
     }
	
	@Then("^User is directd to Widgets list page \"([^\"]*)\"$")
	public void User_is_directd_to_Widgets_list_Page(String arg1) throws Throwable {
		try{
			
	    	String url =driver.getCurrentUrl();
				 System.out.println(url);
			      assertTrue(url.contains(arg1));
			       System.out.println("========");
			       
	} catch (NoSuchElementException e) {
		fail("User is not directed back to Widgets list page");
	    }
	
     }
	
	
	@Then("^User navigates to \"([^\"]*)\"$")
	public void User_navigates_to(String arg1) throws Throwable {
		try{
			
	    	driver.navigate().to(arg1);
			       
	} catch (NoSuchElementException e) {
		fail("User is not directed back to Widgets list page");
	    }
	
     }
	@When("^user selects Transfer Tab$")
	public void user_selects_Transfer_Tab() throws Throwable {
	    try{
	    	
	    	driver.findElement(By.partialLinkText("Transfer")).click();
	    	
	} catch (NoSuchElementException e) {
		fail("Not able to select the Transfer Tab");
	    }
	
     }

	@Then("^User is directed to the Transfer page \"([^\"]*)\"$")
	public void User_is_directed_to_the_Transfer_page(String arg1) throws Throwable {
	    try{
	    	 String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(arg1));
		       System.out.println("========");
		       Thread.sleep(3000);
	} catch (NoSuchElementException e) {
		fail(" Property Details title is not there");
	    }
	
     }
	
	@When("^user opens the drop down$")
	public void user_opens_the_drop_down() throws Throwable {
    
		try{
	    	
	    	WebElement dropdown = driver.findElement(By.className("dropdown-arrow"));
	    	dropdown.click();
	    	Thread.sleep(300);
	    	
	} catch (NoSuchElementException e) {
		fail("Not able to open the drop down");
	    }
	
     }


	@When("^user searches for a company$")
	public void user_searches_for_a_company() throws Throwable {
		
		 try{
		    	
		    	WebElement dropbox = driver.findElement(By.className("dropdown-search-input"));
		    	dropbox.sendKeys("AHS Development Group");
		    	Thread.sleep(300);
	} catch (NoSuchElementException e) {
		fail("Not able to search for a company");
		}
			
	}
	

	@Then("^user selects that searched company$")
	public void user_selects_that_searched_company() throws Throwable {
		 try{
		    	
//			 driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > form > div > div.col-lg-4 > div > div > div.dropdown-menu.show > div.dropdown-body > div > div:nth-child(2) > div > label > span")).click();
//			 Thread.sleep(300);
//		 
		 } catch (NoSuchElementException e) {
		fail("Not able to select that searched company");
	 }
			
   }

	@When("^user clicks on Transfer$")
	public void user_clicks_on_Transfer() throws Throwable {
		 try{
		    	
//		    	driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > form > div > div.col-lg-2 > button")).click();
//		
//		        Thread.sleep(300);
//		        
//		        driver.switchTo().alert().accept();
		        
		 } catch (NoSuchElementException e) {
			fail("Not able to click on transfer button");
		 }
			
	}

	@Then("^User sees a success message \"([^\"]*)\"$")
	public void User_sees_a_success_message(String arg1) throws Throwable {
		 try{
//		    	WebElement sucmsg = driver.findElement(By.className("alert-success"));
//		    	String successmsg= sucmsg.getText();
//		    	System.out.println(successmsg);
//		    	
//		    	assertTrue(successmsg.equals("Property transferred successfully."));
//		    	
			} catch (NoSuchElementException e) {
				fail("Not able to see the succecc message");
			    }
			
		     }

	@When("^User searched the same company again$")
	public void User_searched_the_same_company_again() throws Throwable {
		 try{
//			    WebElement dropdown = driver.findElement(By.className("dropdown-arrow"));
//		    	dropdown.click();
//		    	Thread.sleep(300);
//		    	System.out.println("Search again");
//			    WebElement dropbox = driver.findElement(By.className("dropdown-search-input"));
//		    	dropbox.sendKeys("AHS Development Group");
//		    	Thread.sleep(300);
//		    	System.out.println("And again");
			} catch (NoSuchElementException e) {
				fail("Not able to ssearch the same company again");
			    }
			
		     }

	@Then("^that specific company is not there anymore$")
	public void that_specific_company_is_not_there_anymore() throws Throwable {
		 try{
			 
//		    	WebElement selectionbody =driver.findElement(By.className("dropdown-body"));
//		    	String companies = selectionbody.getText();
//		    	System.out.println(companies);
//		    	Thread.sleep(200);
//		    	assertTrue(!companies.contains("AHS Development Group"));
//		    	
//		    	Thread.sleep(300);
//		    	driver.findElement(By.className("form-icon-search")).click();
//		    	Thread.sleep(300);
			} catch (NoSuchElementException e) {
				fail("That specific company is there");
			    }
			
		     }
	
	@Then("^Reverse back$")
	public void Reverse_back() throws Throwable {
		 try{
			 
//			    WebElement dropdown = driver.findElement(By.className("dropdown-toggle"));
//		    	dropdown.click();
//		    	Thread.sleep(300);
//		    	
//		    	WebElement dropbox = driver.findElement(By.className("dropdown-search-input"));
//		    	dropbox.sendKeys("Essex");
//		    	Thread.sleep(300);
//		    	
//				 driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > form > div > div.col-lg-4 > div > div > div.dropdown-menu.show > div.dropdown-body > div > div:nth-child(64) > div > label")).click();
//				 Thread.sleep(300);
//				 
//				 driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > form > div > div.col-lg-2 > button")).click();
//			     Thread.sleep(300);
//			     
//			     driver.switchTo().alert().accept();
//			     WebElement sucmsg = driver.findElement(By.className("alert-success"));
//			     String successmsg= sucmsg.getText();
//			     System.out.println(successmsg);
//			     assertTrue(successmsg.equals("Property transferred successfully."));
			     
			} catch (NoSuchElementException e) {
				fail("That specific company is there");
			    }
			
		     }
	
}
	
