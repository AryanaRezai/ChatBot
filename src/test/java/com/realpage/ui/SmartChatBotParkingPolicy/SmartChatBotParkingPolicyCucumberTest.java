package com.realpage.ui.SmartChatBotParkingPolicy;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * This runs all the defined cucumber tests
 *
 * @author:  Aryana.R
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		glue = {"com.foundation.cucumber", "com.realpage.ui.SmartChatBotTest", "com.realpage.ui.SmartChatBotOfficeHours", "com.realpage.ui.SmartChatBotParkingPolicy"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/SmartChatBotParkingPolicy/smartchatbotparkingpolicy.feature"}
		)
public class SmartChatBotParkingPolicyCucumberTest {

}
