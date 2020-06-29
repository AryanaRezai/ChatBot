package com.realpage.ui.SmartChatBotScheduleTour;

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
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class SmartChatBotScheduleTourStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent SmartChatBotScheduleTourComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public SmartChatBotScheduleTourStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		SmartChatBotScheduleTourComponent = uiMap.getComponent("smartchatbotscheduletour");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@And("Prospect asks to schedule tour \"([^\"]*)\"$")
	public void Prospect_asks_to_schedule_tour(String scheduleTour) throws InterruptedException {

		try {
			
			
           WebElement inputbox= driver.findElement(By.id("uc-message-input"));
           inputbox.sendKeys(scheduleTour);
           inputbox.sendKeys(Keys.ENTER);
           Thread.sleep(1000); 
           
           
		} catch (NoSuchElementException e) {
			fail("Cannot find prospects answer about their first name");
		}
	}
	
	
	@And("In order to schedule tour bot needs information \"([^\"]*)\"$")
	public void In_order_to_schedule_tour_bot_needs_information(String botfnquestion) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement botwinfo= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[5]/div[1]")));
            String botfnamequestion= botwinfo.getText();
            System.out.println(botfnamequestion);
            assertTrue(botfnamequestion.equals(botfnquestion));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find bot's question about more information");
		}
	}
	
	
	@And("Bot asks how many bedrooms prospect is looking for \"([^\"]*)\"$")
	public void Bot_asks_how_many_bedrooms_prospect_is_looking_for(String botanswer) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait (driver, 90);
			WebElement nrofbedq= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[12]/div[1]")));
            String howmbedrooms= nrofbedq.getText();
            System.out.println(howmbedrooms);
            assertTrue(howmbedrooms.equals(botanswer));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find the question about how many bedrooms");
		}
	}
	
	
	

	@And("Bot asks prospect about moving date$")
	public void Bot_asks_prospect_about_moving_date() throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement botmovingdq = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[14]/div[1]")));
			
            String moveindate= botmovingdq.getText();
            System.out.println(moveindate);
           // assertTrue(moveindate.equals(botanswer));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find the bot's question about move in date");
		}
	}
	
	
	@And("Prospect picks their move in date in the date picker$")
	public void Prospect_picks_their_move_in_date_in_the_date_picker() throws InterruptedException {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement moveindatepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[15]/div[1]/div/div[2]/div[2]/table/tbody/tr[5]/td[3]")));
            moveindatepicker.click();
            System.out.println("1");
            Thread.sleep(1000);
            
            WebElement confirm = driver.findElement(By.id("datePickerCta"));
            confirm.click();
            System.out.println("2");
             
             
		} catch (NoSuchElementException e) {
			fail("Prospect cannot pisk a move in date");
		}
	}
	
	

	@And("Bot asks about day to come and visit \"([^\"]*)\"$")
	public void Bot_asks_about_day_to_come_and_visit(String botfnquestion) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement botwinfo= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[16]/div[1]/p")));
            String botfnamequestion= botwinfo.getText();
            System.out.println(botfnamequestion);
           // assertTrue(botfnamequestion.equals(botfnquestion));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find bot's question about when is good day to visit");
		}
	}
	
	
	@And("Bot displays a calendar$")
	public void Bot_displays_a_calendar() throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait (driver, 90);
			WebElement swipecal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("swiper-button-next")));
			swipecal.click();
			Thread.sleep(1000);
			
           
		} catch (NoSuchElementException e) {
			fail("Cannot find the visit calendar");
		}
	}
	
	
	
	
	@And("Prospect selects a visit date$")
	public void Prospect_selects_a_visit_date() throws InterruptedException {

		try {
			
              WebElement date= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[17]/div[1]/div/div[2]/div[1]/div[1]/div/div[3]/div"));
	          date.click();
	          Thread.sleep(1000);
	          
	          
	          WebElement time = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[17]/div[1]/div/div[2]/div[4]/div[1]/div/div[1]"));
	          time.click();
	          
//	          if (time.isSelected()) {
//	        	  
//	        	  WebElement timeswipe = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[17]/div[1]/div/div[2]/div[4]/div[3]"));
//	        	  timeswipe. click();
//	        	  time.click();
//	          } 
//	          
//	          else {
//	        	  time.click();
//	          }
	            
		} catch (NoSuchElementException e) {
			fail("Prospect is not able to select a visit date");
		}
	}
	
	
	@And("Bot confirms that date \"([^\"]*)\"$")
	public void Bot_confirms_that_date(String prospectln) throws InterruptedException {

		try {
			
//			WebDriverWait wait = new WebDriverWait (driver, 90);
//			WebElement confirmdate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[18]/div[1]/p/text()[1]")));
//			String dateconfirmation = confirmdate.getText(); 
//			System.out.println(dateconfirmation);
//			assertTrue(dateconfirmation.equals(prospectln));
//           
           
		} catch (NoSuchElementException e) {
			fail("Cannot find date confirmation ");
		}
	}
	
	
	
	
	
//	@And("Bot asks for prospects email or phone number \"([^\"]*)\"$")
//	public void Bot_asks_for_prospects_email_or_phone_number(String botemailquestion) throws InterruptedException {
//
//		try {
//			
//			Thread.sleep(1000);
//            WebElement emailphone= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[11]/div[1]/p"));
//            String botemailphquestion= emailphone.getText();
//            System.out.println(botemailphquestion);
//            assertTrue(botemailphquestion.equals(botemailquestion));
//            Thread.sleep(500);
//            
//		} catch (NoSuchElementException e) {
//			fail("Cannot find bot's question about email or phone");
//		}
//	}
//	
//	
//	
//	@And("Bot routes prospect to an agent \"([^\"]*)\"$")
//	public void Bot_routes_prospect_to_an_agent(String routingmessagee) throws InterruptedException {
//
//		try {
//			
//			Thread.sleep(1000);
//            WebElement rm= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[13]/div[1]/p"));
//            String routingmessage= rm.getText();
//            System.out.println(routingmessage);
//            assertTrue(routingmessage.equals(routingmessagee));
//            Thread.sleep(500);
//            
//		} catch (NoSuchElementException e) {
//			fail("Cannot be routed to an agent");
//		}
//	}
//	


	}
	



