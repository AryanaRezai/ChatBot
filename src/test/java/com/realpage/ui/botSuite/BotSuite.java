package com.realpage.ui.botSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.realpage.ui.SmartChatBotAmenities.SmartChatBotAmenitiesCucumberTest;
import com.realpage.ui.SmartChatBotLiveAgent.SmartChatBotLiveAgentCucumberTest;
import com.realpage.ui.SmartChatBotOfficeHours.SmartChatBotOfficeHoursCucumberTest;
import com.realpage.ui.SmartChatBotParkingPolicy.SmartChatBotParkingPolicyCucumberTest;
import com.realpage.ui.SmartChatBotPetPolicy.SmartChatBotPetPolicyCucumberTest;
import com.realpage.ui.SmartChatBotScheduleTour.SmartChatBotScheduleTourCucumberTest;
import com.realpage.ui.SmartChatBotTest.SmartChatBotTestCucumberTest;


@RunWith(value = Suite.class)
@SuiteClasses(value = {
		
						SmartChatBotAmenitiesCucumberTest.class,
						SmartChatBotLiveAgentCucumberTest.class,
						SmartChatBotOfficeHoursCucumberTest.class, 
						SmartChatBotParkingPolicyCucumberTest.class,
						SmartChatBotPetPolicyCucumberTest.class,
						SmartChatBotTestCucumberTest.class,
						SmartChatBotScheduleTourCucumberTest.class
						
})

public class BotSuite {
	

}
