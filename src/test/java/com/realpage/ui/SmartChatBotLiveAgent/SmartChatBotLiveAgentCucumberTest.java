package com.realpage.ui.SmartChatBotLiveAgent;

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
		glue = {"com.foundation.cucumber", "com.realpage.ui.SmartChatBotTest", "com.realpage.ui.SmartChatBotAmenities", "com.realpage.ui.SmartChatBotLiveAgent"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/SmartChatBotLiveAgent/smartchatbotliveagent.feature"}
		)
public class SmartChatBotLiveAgentCucumberTest {

}
