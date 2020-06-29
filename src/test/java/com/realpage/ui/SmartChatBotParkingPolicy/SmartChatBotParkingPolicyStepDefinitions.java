package com.realpage.ui.SmartChatBotParkingPolicy;

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
public class SmartChatBotParkingPolicyStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent SmartChatBotParkingPolicyComponent;
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
	public SmartChatBotParkingPolicyStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		SmartChatBotParkingPolicyComponent = uiMap.getComponent("smartchatbotparkingpolicy");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	

	@And("Prospect asks about parking policy ([^\"]+)$")
	public void Prospect_asks_about_parking_policy(String parkingPolicy) throws InterruptedException {

		try {
			
			Thread.sleep(1000);
            WebElement inputbox= driver.findElement(By.id("uc-message-input"));
            inputbox.sendKeys(parkingPolicy);
            inputbox.sendKeys(Keys.ENTER);
             
             
		} catch (NoSuchElementException e) {
			fail("Cannot send message about Parking Policy");
		}
	}
	
	
	@And("Bot responds Parking Policy question \"([^\"]*)\"$")
	public void Bot_responds_Parking_Policy_question(String botanswer) throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			WebElement ppa = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[5]/div[1]")));
            String howmbedrooms= ppa.getText();
            System.out.println(howmbedrooms);
            assertTrue(howmbedrooms.contains(botanswer));
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Cannot find the bot's answer about Pet Policy");
		}
	}




	}
	



