package com.realpage.ui.botSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.SmartChatBotPetPolicy.SmartChatBotPetPolicyCucumberTest;


@RunWith(value = Suite.class)
@SuiteClasses(value = { SmartChatBotPetPolicyCucumberTest.class})

public class SmartChatBotPetPolicy {

}
