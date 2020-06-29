package com.realpage.ui.SmartChatBotOfficeHours;

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
		glue = {"com.foundation.cucumber", "com.realpage.ui.SmartChatBotTest", "com.realpage.ui.SmartChatBotAmenities", "com.realpage.ui.SmartChatBotOfficeHours"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/SmartChatBotOfficeHours/smartchatbotofficehours.feature"}
		)
public class SmartChatBotOfficeHoursCucumberTest {

}
