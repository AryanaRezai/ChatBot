package com.realpage.ui.SmartChatBotTest;

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
public class SmartChatBotTestStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent SmartChatBotTestComponent;
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
	public SmartChatBotTestStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		SmartChatBotTestComponent = uiMap.getComponent("smartchatbottest");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	
	@And("Consumer selects CHAT tab$")
	public void Consumer_selects_CHAT_tab() throws InterruptedException {

		try {
			
			driver.findElement(By.className("jump-cell-1")).click();
			Thread.sleep(500);


		} catch (NoSuchElementException e) {
			fail("Cannot select the Chat tab");
		}
	}
	
	@And("Bot generates auto greeting$")
	public void Bot_generates_auto_greeting() throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("greetingMessage0")));
			
			Thread.sleep(500);
			WebElement autog= driver.findElement(By.className("greetingMessage0"));
			System.out.println("Auto-Greeting: ******");
			String autogreeting = autog.getText();
			System.out.println(autogreeting);
			Thread.sleep(500);
			assertTrue(autogreeting.contains("Hi! I'm Paige, your virtual assistant."));
 
			
			WebDriverWait waitt = new WebDriverWait(driver, 50);
			WebElement elementt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("greetingMessage1")));
			WebElement autogr= driver.findElement(By.className("greetingMessage1"));
			System.out.println("Auto-Greeting: ******");
			String autogreetingg = autogr.getText();
			System.out.println(autogreetingg);
			Thread.sleep(500);
			assertTrue(autogreetingg.contains("I can help with leasing questions. You can say things like"));
		


		} catch (NoSuchElementException e) {
			fail("Cannot see the auto greeting message");
		}
	}


	@And("Prospect has leasing question ([^\"]+)$")
	public void Prospect_has_leasing_question(String apartment) throws InterruptedException {

		try {
			
            WebElement inputbox= driver.findElement(By.id("uc-message-input"));
            inputbox.sendKeys(apartment);
            inputbox.sendKeys(Keys.ENTER);
             
             
		} catch (NoSuchElementException e) {
			fail("Cannot send message Find an Apartment");
		}
	}
	
	
	@And("Bot asks how many bedrooms \"([^\"]*)\"$")
	public void Bot_asks_how_many_bedrooms(String botanswer) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait (driver, 90);
			WebElement nrofbedq= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[5]/div[1]")));
            String howmbedrooms= nrofbedq.getText();
            System.out.println(howmbedrooms);
            assertTrue(howmbedrooms.equals(botanswer));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find the question about how many bedrooms");
		}
	}
	
	@And("Prospect responds with number of bedrooms ([^\"]+)$")
	public void Prospect_responds_with_number_of_bedrooms(String nrbedroom) throws InterruptedException {

		try {
			
            WebElement inputbox= driver.findElement(By.id("uc-message-input"));
            inputbox.sendKeys(nrbedroom);
            inputbox.sendKeys(Keys.ENTER);
            Thread.sleep(500);
             
             
		} catch (NoSuchElementException e) {
			fail("Consumer cannpt respond");
		}
	}
	
	
	@And("Bot asks about moving date$")
	public void Bot_asks_about_moving_date() throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement botmovingdq = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[7]/div[1]/p")));
			
            String moveindate= botmovingdq.getText();
            System.out.println(moveindate);
           // assertTrue(moveindate.equals(botanswer));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find the bot's question about move in date");
		}
	}
	
	
	@And("Prospect picks a move in date in the date picker$")
	public void Prospect_picks_a_move_in_date_in_the_date_picker() throws InterruptedException {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement moveindatepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[8]/div[1]/div/div[2]/div[2]/table/tbody/tr[5]/td[6]")));
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
	
	@And("Bot responds with availability information$")
	public void Bot_responds_with_availability_information() throws InterruptedException {

		try {
			
			
			
			WebElement botavail= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[9]/div[1]/p"));
			String botavailability = botavail.getText();
			System.out.println(botavailability);
			Thread.sleep(500);
			
			if (botavailability.contains("Good news!")); {
				
				Thread.sleep(500);
				driver.findElement(By.className("floorplansCarousel"));
				
				Thread.sleep(500);
				WebElement sctext= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[11]/div[1]"));
				String scheduletxt = sctext.getText();
				System.out.println(scheduletxt);
				assertTrue(scheduletxt.equals("Would you like to schedule a tour?"));
				
				Thread.sleep(500);
			    WebElement inputbox= driver.findElement(By.id("uc-message-input"));
	            inputbox.sendKeys("no");
	            inputbox.sendKeys(Keys.ENTER);
	            Thread.sleep(500);
	            				
			} if (botavailability.contains("Unfortunately")) {
				
				
				
			}
			
			
		
            
		} catch (NoSuchElementException e) {
			fail("Cannot find the bot's answer");
		}
	}
	
	
	
	@And("Bot asks if it can help with anything else \"([^\"]*)\"$")
	public void Bot_asks_if_it_can_help_with_anything_else(String botanswer) throws InterruptedException {

		try {
			
			Thread.sleep(1000);
            WebElement hmb= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[13]/div[1]/p"));
            String howmbedrooms= hmb.getText();
            System.out.println(howmbedrooms);
            assertTrue(howmbedrooms.contains(botanswer));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find the bot's answer about Pet Policy");
		}
	}
	
	
	@And("Prospect answers no thanks \"([^\"]*)\"$")
	public void Prospect_answers_no_thanks(String no) throws InterruptedException {

		try {
			
            WebElement inputbox= driver.findElement(By.id("uc-message-input"));
            inputbox.sendKeys(no);
            inputbox.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
             
		} catch (NoSuchElementException e) {
			fail("Cannot send message about Pet Policy");
		}
	}
	
	@And("Bot ends the conversation with greeting \"([^\"]*)\"$")
	public void Bot_ends_the_conversation_with_greeting(String botanswer) throws InterruptedException {

		try {
			
			Thread.sleep(1000);
            WebElement hmb= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[15]/div[1]/p"));
            String howmbedrooms= hmb.getText();
            System.out.println("####"+howmbedrooms);
            assertTrue(howmbedrooms.contains(botanswer));
            Thread.sleep(1000);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find the bot's answer about Pet Policy");
		}
	}
	
	
	


	}
	



