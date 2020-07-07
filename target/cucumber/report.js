$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/SmartChatBotAmenities/smartchatbotamenities.feature");
formatter.feature({
  "line": 1,
  "name": "ChatTest HTML Rendering",
  "description": "",
  "id": "chattest-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7299071400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Rendering Consumer Widget Page",
  "description": "",
  "id": "chattest-html-rendering;rendering-consumer-widget-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "QA Tester wants to navigate the content of ConsumerWidgetPage",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Consumer selects CHAT tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Bot generates auto greeting",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Prospect asks about amenities Amenities",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Bot says that it needs more info \"Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Bot asks for prospects first name \"What\u0027s your first name?\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Prospect responses with their first name \"Aryana\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Bot asks for prospects last name \"And your last name?\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Prospect responds with their last name \"Rezai\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Bot asks for prospects email or phone number \"What is your phone number or email address?\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Prospect responds with their phone number or email \"4692165826\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Bot routes prospect to an agent \"Let me get you to an agent that can help.\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "QA Tester",
      "offset": 0
    },
    {
      "val": "ConsumerWidgetPage",
      "offset": 43
    }
  ],
  "location": "CucumberStepDefinitions.open_site(String,String)"
});
formatter.result({
  "duration": 34148233700,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Consumer_selects_CHAT_tab()"
});
formatter.result({
  "duration": 834701600,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Bot_generates_auto_greeting()"
});
formatter.result({
  "duration": 20845458300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amenities",
      "offset": 30
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_asks_about_amenities(String)"
});
formatter.result({
  "duration": 1200354400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.",
      "offset": 34
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_says_that_it_needs_more_info(String)"
});
formatter.result({
  "duration": 5799966400,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.realpage.ui.SmartChatBotAmenities.SmartChatBotAmenitiesStepDefinitions.Bot_says_that_it_needs_more_info(SmartChatBotAmenitiesStepDefinitions.java:104)\r\n\tat ✽.Then Bot says that it needs more info \"Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.\"(src/test/resources/com/realpage/components/SmartChatBotAmenities/smartchatbotamenities.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "What\u0027s your first name?",
      "offset": 35
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Aryana",
      "offset": 42
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responses_with_their_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "And your last name?",
      "offset": 34
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rezai",
      "offset": 40
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responds_with_their_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "What is your phone number or email address?",
      "offset": 46
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_email_or_phone_number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4692165826",
      "offset": 52
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responds_with_their_phone_number_or_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Let me get you to an agent that can help.",
      "offset": 33
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_routes_prospect_to_an_agent(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1801537800,
  "status": "passed"
});
formatter.before({
  "duration": 2390110600,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Rendering Consumer Widget Page",
  "description": "",
  "id": "chattest-html-rendering;rendering-consumer-widget-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "QA Tester wants to navigate the content of ConsumerWidgetPage",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Consumer selects CHAT tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Bot generates auto greeting",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Prospect asks about amenities Do you have a pool?",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Bot says that it needs more info \"Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Bot asks for prospects first name \"What\u0027s your first name?\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Prospect responses with their first name \"Aryana\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Bot asks for prospects last name \"And your last name?\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Prospect responds with their last name \"Rezai\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Bot asks for prospects email or phone number \"What is your phone number or email address?\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Prospect responds with their phone number or email \"4692165826\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Bot routes prospect to an agent \"Let me get you to an agent that can help.\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "QA Tester",
      "offset": 0
    },
    {
      "val": "ConsumerWidgetPage",
      "offset": 43
    }
  ],
  "location": "CucumberStepDefinitions.open_site(String,String)"
});
formatter.result({
  "duration": 2316639900,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Consumer_selects_CHAT_tab()"
});
formatter.result({
  "duration": 925751700,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Bot_generates_auto_greeting()"
});
formatter.result({
  "duration": 19995179900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Do you have a pool?",
      "offset": 30
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_asks_about_amenities(String)"
});
formatter.result({
  "duration": 1378789600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.",
      "offset": 34
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_says_that_it_needs_more_info(String)"
});
formatter.result({
  "duration": 4158887000,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.realpage.ui.SmartChatBotAmenities.SmartChatBotAmenitiesStepDefinitions.Bot_says_that_it_needs_more_info(SmartChatBotAmenitiesStepDefinitions.java:104)\r\n\tat ✽.Then Bot says that it needs more info \"Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.\"(src/test/resources/com/realpage/components/SmartChatBotAmenities/smartchatbotamenities.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "What\u0027s your first name?",
      "offset": 35
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Aryana",
      "offset": 42
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responses_with_their_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "And your last name?",
      "offset": 34
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rezai",
      "offset": 40
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responds_with_their_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "What is your phone number or email address?",
      "offset": 46
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_email_or_phone_number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4692165826",
      "offset": 52
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responds_with_their_phone_number_or_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Let me get you to an agent that can help.",
      "offset": 33
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_routes_prospect_to_an_agent(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1552025000,
  "status": "passed"
});
formatter.before({
  "duration": 2336014600,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Rendering Consumer Widget Page",
  "description": "",
  "id": "chattest-html-rendering;rendering-consumer-widget-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "QA Tester wants to navigate the content of ConsumerWidgetPage",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Consumer selects CHAT tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Bot generates auto greeting",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Prospect asks about amenities Gym?",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Bot says that it needs more info \"Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Bot asks for prospects first name \"What\u0027s your first name?\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Prospect responses with their first name \"Aryana\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Bot asks for prospects last name \"And your last name?\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Prospect responds with their last name \"Rezai\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Bot asks for prospects email or phone number \"What is your phone number or email address?\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Prospect responds with their phone number or email \"4692165826\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Bot routes prospect to an agent \"Let me get you to an agent that can help.\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "QA Tester",
      "offset": 0
    },
    {
      "val": "ConsumerWidgetPage",
      "offset": 43
    }
  ],
  "location": "CucumberStepDefinitions.open_site(String,String)"
});
formatter.result({
  "duration": 23058636400,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Consumer_selects_CHAT_tab()"
});
formatter.result({
  "duration": 785903200,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Bot_generates_auto_greeting()"
});
formatter.result({
  "duration": 20387879300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gym?",
      "offset": 30
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_asks_about_amenities(String)"
});
formatter.result({
  "duration": 1242896500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.",
      "offset": 34
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_says_that_it_needs_more_info(String)"
});
formatter.result({
  "duration": 4595701100,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.realpage.ui.SmartChatBotAmenities.SmartChatBotAmenitiesStepDefinitions.Bot_says_that_it_needs_more_info(SmartChatBotAmenitiesStepDefinitions.java:104)\r\n\tat ✽.Then Bot says that it needs more info \"Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information.\"(src/test/resources/com/realpage/components/SmartChatBotAmenities/smartchatbotamenities.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "What\u0027s your first name?",
      "offset": 35
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Aryana",
      "offset": 42
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responses_with_their_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "And your last name?",
      "offset": 34
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rezai",
      "offset": 40
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responds_with_their_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "What is your phone number or email address?",
      "offset": 46
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_asks_for_prospects_email_or_phone_number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4692165826",
      "offset": 52
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Prospect_responds_with_their_phone_number_or_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Let me get you to an agent that can help.",
      "offset": 33
    }
  ],
  "location": "SmartChatBotAmenitiesStepDefinitions.Bot_routes_prospect_to_an_agent(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4232616900,
  "status": "passed"
});
});