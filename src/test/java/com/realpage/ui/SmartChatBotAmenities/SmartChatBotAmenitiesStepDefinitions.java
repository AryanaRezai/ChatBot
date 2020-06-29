package com.realpage.ui.SmartChatBotAmenities;

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
public class SmartChatBotAmenitiesStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent SmartChatBotAmenitiesComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	private String url;
	private String id;
	
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public SmartChatBotAmenitiesStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		SmartChatBotAmenitiesComponent = uiMap.getComponent("smartchatbotamenities");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@And("Prospect asks about amenities \"([^\"]*)\"$")
	public void Prospect_asks_about_amenities(String prospectamenities) throws InterruptedException {

		try {
			
			
           WebElement inputbox= driver.findElement(By.id("uc-message-input"));
           inputbox.sendKeys(prospectamenities);
           inputbox.sendKeys(Keys.ENTER);
           Thread.sleep(1000); 
           
           
		} catch (NoSuchElementException e) {
			fail("Cannot find prospects question about Amenities");
		}
	}
	
	
	@And("Bot says that it needs more info \"([^\"]*)\"$")
	public void Bot_says_that_it_needs_more_info(String botfnquestion) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement infoq = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[5]/div[1]")));
					
			
           
            String botinfoquestion= infoq.getText();
            System.out.println(botinfoquestion);
            assertTrue(botinfoquestion.equals(botfnquestion));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find bot's question about more information");
		}
	}
	

	@And("Bot asks for prospects first name \"([^\"]*)\"$")
	public void Bot_asks_for_prospects_first_name(String botfnquestion) throws InterruptedException {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement fn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[6]/div[1]")));
            String botfnamequestion= fn.getText();
            System.out.println(botfnamequestion);
            assertTrue(botfnamequestion.equals(botfnquestion));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find bot's question about first name");
		}
	}
	
	
	@And("Prospect responses with their first name \"([^\"]*)\"$")
	public void Prospect_responses_with_their_first_name(String prospectfn) throws InterruptedException {

		try {
			
			
           WebElement inputbox= driver.findElement(By.id("uc-message-input"));
           inputbox.sendKeys(prospectfn);
           inputbox.sendKeys(Keys.ENTER);
           Thread.sleep(1000); 
           
           
		} catch (NoSuchElementException e) {
			fail("Cannot find prospects answer about their first name");
		}
	}
	
	
	
	
	@And("Bot asks for prospects last name \"([^\"]*)\"$")
	public void Bot_asks_for_prospects_last_name(String botlnquestion) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement ln = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[8]/div[1]")));
            String botlnamequestion= ln.getText();
            System.out.println(botlnamequestion);
            assertTrue(botlnamequestion.equals(botlnquestion));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find bot's question about last name");
		}
	}
	
	
	@And("Prospect responds with their last name \"([^\"]*)\"$")
	public void Prospect_responds_with_their_last_name(String prospectln) throws InterruptedException {

		try {
			
			
           WebElement inputbox= driver.findElement(By.id("uc-message-input"));
           inputbox.sendKeys(prospectln);
           inputbox.sendKeys(Keys.ENTER);
           Thread.sleep(1000); 
           
           
		} catch (NoSuchElementException e) {
			fail("Cannot find prospect's last name");
		}
	}
	
	
	@And("Bot asks for prospects email or phone number \"([^\"]*)\"$")
	public void Bot_asks_for_prospects_email_or_phone_number(String botemailquestion) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement emailphone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[10]/div[1]")));
            String botemailphquestion= emailphone.getText();
            System.out.println(botemailphquestion);
            assertTrue(botemailphquestion.equals(botemailquestion));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find bot's question about email or phone");
		}
	}
	
	
	@And("Prospect responds with their phone number or email \"([^\"]*)\"$")
	public void Prospect_responds_with_their_phone_number_or_email(String prospectphn) throws InterruptedException {

		try {
			
			
           WebElement inputbox= driver.findElement(By.id("uc-message-input"));
           inputbox.sendKeys(prospectphn);
           inputbox.sendKeys(Keys.ENTER);
           Thread.sleep(1000); 
           
           
		} catch (NoSuchElementException e) {
			fail("Cannot find prospect's last name");
		}
	}
	
	@And("Bot routes prospect to an agent \"([^\"]*)\"$")
	public void Bot_routes_prospect_to_an_agent(String routingmessagee) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement rm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[12]/div[1]")));
            String routingmessage= rm.getText();
            System.out.println(routingmessage);
            assertTrue(routingmessage.equals(routingmessagee));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot be routed to an agent");
		}
	}
	


	}
	



