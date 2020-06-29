package com.realpage.ui.botSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.SmartChatBotTest.SmartChatBotTestCucumberTest;


@RunWith(value = Suite.class)
@SuiteClasses(value = { SmartChatBotTestCucumberTest.class})

public class SmartChatBotTest {

}
