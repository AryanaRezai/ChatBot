$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/SmartChatBotParkingPolicy/smartchatbotparkingpolicy.feature");
formatter.feature({
  "line": 1,
  "name": "ChatTest HTML Rendering",
  "description": "",
  "id": "chattest-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4843629100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
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
  "name": "Prospect asks about parking policy What is your parking Policy?",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Bot responds Parking Policy question \"Parking policy: Open parking at no charge\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Bot asks if it can help with something else \"What else can I help you with?\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Prospect answers nothing thanks \"Nothing\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Bot responds with Got It \"Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "The rate conversation button is displayed",
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
  "duration": 33890969100,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Consumer_selects_CHAT_tab()"
});
formatter.result({
  "duration": 688494100,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Bot_generates_auto_greeting()"
});
formatter.result({
  "duration": 17322513500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "What is your parking Policy?",
      "offset": 35
    }
  ],
  "location": "SmartChatBotParkingPolicyStepDefinitions.Prospect_asks_about_parking_policy(String)"
});
formatter.result({
  "duration": 1302279500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Parking policy: Open parking at no charge",
      "offset": 38
    }
  ],
  "location": "SmartChatBotParkingPolicyStepDefinitions.Bot_responds_Parking_Policy_question(String)"
});
formatter.result({
  "duration": 4854058600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "What else can I help you with?",
      "offset": 45
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Bot_asks_if_it_can_help_with_something_else(String)"
});
formatter.result({
  "duration": 1999970000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nothing",
      "offset": 33
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Prospect_answers_nothing_thanks(String)"
});
formatter.result({
  "duration": 2121419000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691",
      "offset": 26
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Bot_responds_with_Got_It(String)"
});
formatter.result({
  "duration": 3606534100,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotOfficeHoursStepDefinitions.The_rate_conversation_button_is_displayed()"
});
formatter.result({
  "duration": 1969646000,
  "status": "passed"
});
formatter.after({
  "duration": 1258064100,
  "status": "passed"
});
formatter.before({
  "duration": 2068921800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
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
  "name": "Prospect asks about parking policy Garage",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Bot responds Parking Policy question \"Parking policy: Open parking at no charge\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Bot asks if it can help with something else \"What else can I help you with?\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Prospect answers nothing thanks \"Nothing\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Bot responds with Got It \"Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "The rate conversation button is displayed",
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
  "duration": 24648019900,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Consumer_selects_CHAT_tab()"
});
formatter.result({
  "duration": 683037400,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Bot_generates_auto_greeting()"
});
formatter.result({
  "duration": 6338202100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Garage",
      "offset": 35
    }
  ],
  "location": "SmartChatBotParkingPolicyStepDefinitions.Prospect_asks_about_parking_policy(String)"
});
formatter.result({
  "duration": 1145666200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Parking policy: Open parking at no charge",
      "offset": 38
    }
  ],
  "location": "SmartChatBotParkingPolicyStepDefinitions.Bot_responds_Parking_Policy_question(String)"
});
formatter.result({
  "duration": 3286055500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "What else can I help you with?",
      "offset": 45
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Bot_asks_if_it_can_help_with_something_else(String)"
});
formatter.result({
  "duration": 2000135600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nothing",
      "offset": 33
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Prospect_answers_nothing_thanks(String)"
});
formatter.result({
  "duration": 2112570900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691",
      "offset": 26
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Bot_responds_with_Got_It(String)"
});
formatter.result({
  "duration": 2912903400,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotOfficeHoursStepDefinitions.The_rate_conversation_button_is_displayed()"
});
formatter.result({
  "duration": 1937409600,
  "status": "passed"
});
formatter.after({
  "duration": 1135266200,
  "status": "passed"
});
formatter.before({
  "duration": 1764286500,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
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
  "name": "Prospect asks about parking policy Parking cost",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Bot responds Parking Policy question \"Parking policy: Open parking at no charge\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Bot asks if it can help with something else \"What else can I help you with?\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Prospect answers nothing thanks \"Nothing\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Bot responds with Got It \"Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "The rate conversation button is displayed",
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
  "duration": 11713002100,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Consumer_selects_CHAT_tab()"
});
formatter.result({
  "duration": 694485700,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotTestStepDefinitions.Bot_generates_auto_greeting()"
});
formatter.result({
  "duration": 17174224300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Parking cost",
      "offset": 35
    }
  ],
  "location": "SmartChatBotParkingPolicyStepDefinitions.Prospect_asks_about_parking_policy(String)"
});
formatter.result({
  "duration": 1190195500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Parking policy: Open parking at no charge",
      "offset": 38
    }
  ],
  "location": "SmartChatBotParkingPolicyStepDefinitions.Bot_responds_Parking_Policy_question(String)"
});
formatter.result({
  "duration": 3551095400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "What else can I help you with?",
      "offset": 45
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Bot_asks_if_it_can_help_with_something_else(String)"
});
formatter.result({
  "duration": 2011762100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nothing",
      "offset": 33
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Prospect_answers_nothing_thanks(String)"
});
formatter.result({
  "duration": 2109174100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691",
      "offset": 26
    }
  ],
  "location": "SmartChatBotOfficeHoursStepDefinitions.Bot_responds_with_Got_It(String)"
});
formatter.result({
  "duration": 3179552700,
  "status": "passed"
});
formatter.match({
  "location": "SmartChatBotOfficeHoursStepDefinitions.The_rate_conversation_button_is_displayed()"
});
formatter.result({
  "duration": 1991117500,
  "status": "passed"
});
formatter.after({
  "duration": 1074809100,
  "status": "passed"
});
});