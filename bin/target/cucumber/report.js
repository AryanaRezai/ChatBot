<<<<<<< Updated upstream
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/Properties/properties.feature");
formatter.feature({
  "line": 1,
  "name": "Properties HTML Rendering",
  "description": "",
  "id": "properties-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6497576600,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Rendering Properties Page",
  "description": "",
  "id": "properties-html-rendering;rendering-properties-page;;2",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/SmartWidget/smartwidget.feature");
formatter.feature({
  "line": 1,
  "name": "ChatTest HTML Rendering",
  "description": "",
  "id": "chattest-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8623615200,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Rendering Consumer Widget Page",
  "description": "",
  "id": "chattest-html-rendering;rendering-consumer-widget-page;;2",
>>>>>>> Stashed changes
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "QA Tester wants to navigate the content of smartWidgetrja",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the Start Chatting button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
<<<<<<< Updated upstream
  "name": "User enters valid username \"john.fischelli@realpage.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters valid password \"password\"",
=======
  "name": "The first greeting is displayed \"Hi! I\u0027m your Virtual Assistant.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "The second greeting is displayed \"I am going to ask a few simple questions.  First, would you like to chat about finding an apartment, scheduling a tour or something else?\"",
>>>>>>> Stashed changes
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Contact answers find an apartment \"Find an apartment\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
<<<<<<< Updated upstream
  "name": "User is directed to the Home Page \"/properties\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User expands the Naigation Menu",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User clicks on Properties",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User is directed to the Properties Page \"/properties\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User clicks on the property search drop down",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User sees a list of search options",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User picks Property Name",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters a Property Name 1000 Kiely",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User clicks on the search submit icon",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User sees eight information titles",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User sees information related to the search",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks on the property search drop down",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User picks Company Name",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User enters a Company Name \"Essex\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User clicks on the search submit icon",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User sees eight information titles",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User sees information related to the search",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User clicks on the property search drop down",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User picks Property ID",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enters a Property ID \"7789\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User clicks on the search submit icon",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User sees eight information titles",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User sees information related to the search",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User clicks on the actual property name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User is directed to the property details page \"/property/\"",
=======
  "name": "VA asks about desired home size",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Contact answers number of bedrooms \"2 bedrooms\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "VA asks about desired move in date \"Great, when are you looking to move?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Contact answers desired move in date \"Next Month\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "VA comes back with availablity information",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "VA asks if contact wants to schedule a tour \"Would you like to schedule a tour?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Contact answers the question about scheduling a tour \"yes\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "VA informs that it needs some info to be able to schedule a tour \"In order to book a tour, I need a little more information.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "VA asks for contacts first name",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Contact answers the question about first name \"Aryana\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "VA asks for contacts last name",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Contact answers the question about last name \"Rezai\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "VA asks for contacts email address",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Contact answers the question about email address \"aryana.rezai@realpage.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Contact answers the question about phone Number \"4692165826\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "VA asks for desired tour day \"What would be a good day for you to come visit?\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "VA displays the date calendar",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Contact picks a date",
>>>>>>> Stashed changes
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "QA Tester",
      "offset": 0
    },
    {
      "val": "smartWidgetrja",
      "offset": 43
    }
  ],
  "location": "CucumberStepDefinitions.open_site(String,String)"
});
formatter.result({
<<<<<<< Updated upstream
  "duration": 5216056100,
=======
  "duration": 23700346500,
>>>>>>> Stashed changes
  "status": "passed"
});
formatter.match({
  "location": "SmartWidgetStepDefinitions.User_clicks_on_the_Start_Chatting_button()"
});
formatter.result({
<<<<<<< Updated upstream
  "duration": 68684500,
=======
  "duration": 68182294100,
>>>>>>> Stashed changes
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "john.fischelli@realpage.com",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinitions.User_enters_valid_username(String)"
});
formatter.result({
  "duration": 406239300,
  "status": "passed"
=======
      "val": "Hi! I\u0027m your Virtual Assistant.",
      "offset": 33
    }
  ],
  "location": "SmartWidgetStepDefinitions.The_first_greeting_is_displayed(String)"
});
formatter.result({
  "duration": 31766238400,
  "error_message": "java.lang.AssertionError: Not able to find the first greeting messages\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat com.realpage.chatntour.SmartWidget.SmartWidgetStepDefinitions.The_first_greeting_is_displayed(SmartWidgetStepDefinitions.java:141)\r\n\tat ✽.Then The first greeting is displayed \"Hi! I\u0027m your Virtual Assistant.\"(src/test/resources/com/realpage/components/SmartWidget/smartwidget.feature:9)\r\n",
  "status": "failed"
>>>>>>> Stashed changes
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "password",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinitions.User_enters_valid_password(String)"
});
formatter.result({
  "duration": 233734700,
  "status": "passed"
=======
      "val": "I am going to ask a few simple questions.  First, would you like to chat about finding an apartment, scheduling a tour or something else?",
      "offset": 34
    }
  ],
  "location": "SmartWidgetStepDefinitions.The_second_greeting_is_displayed(String)"
});
formatter.result({
  "status": "skipped"
>>>>>>> Stashed changes
});
formatter.match({
  "arguments": [
    {
      "val": "Find an apartment",
      "offset": 35
    }
  ],
  "location": "SmartWidgetStepDefinitions.Contact_answers_find_an_apartment(String)"
});
formatter.result({
<<<<<<< Updated upstream
  "duration": 2751626400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/properties",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinitions.User_is_directed_to_the_Home_Page(String)"
});
formatter.result({
  "duration": 1021270400,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_expands_the_Naigation_Menu()"
});
formatter.result({
  "duration": 1231828000,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_Properties()"
});
formatter.result({
  "duration": 1336629200,
  "status": "passed"
=======
  "status": "skipped"
});
formatter.match({
  "location": "SmartWidgetStepDefinitions.VA_asks_about_desired_home_size()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2 bedrooms",
      "offset": 36
    }
  ],
  "location": "SmartWidgetStepDefinitions.Contact_answers_number_of_bedrooms(String)"
});
formatter.result({
  "status": "skipped"
>>>>>>> Stashed changes
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "/properties",
      "offset": 41
    }
  ],
  "location": "PropertiesStepDefinitions.User_is_directed_to_the_Properties_Page(String)"
});
formatter.result({
  "duration": 1010715100,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_property_search_drop_down()"
});
formatter.result({
  "duration": 716116700,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_a_list_of_search_options()"
});
formatter.result({
  "duration": 526918300,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_picks_Property_Name()"
});
formatter.result({
  "duration": 631250800,
  "status": "passed"
=======
      "val": "Great, when are you looking to move?",
      "offset": 36
    }
  ],
  "location": "SmartWidgetStepDefinitions.VA_asks_about_desired_move_in_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Next Month",
      "offset": 38
    }
  ],
  "location": "SmartWidgetStepDefinitions.Contact_answers_desired_move_in_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmartWidgetStepDefinitions.VA_comes_back_with_availablity_information()"
});
formatter.result({
  "status": "skipped"
>>>>>>> Stashed changes
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "1000 Kiely",
      "offset": 28
    }
  ],
  "location": "PropertiesStepDefinitions.User_enters_a_Property_Name(String)"
});
formatter.result({
  "duration": 249137600,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_search_submit_icon()"
});
formatter.result({
  "duration": 3101669900,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_eight_information_titles()"
});
formatter.result({
  "duration": 63500,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_information_related_to_the_search()"
});
formatter.result({
  "duration": 444379900,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_property_search_drop_down()"
});
formatter.result({
  "duration": 715075000,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_picks_Company_Name()"
});
formatter.result({
  "duration": 646915700,
  "status": "passed"
=======
      "val": "Would you like to schedule a tour?",
      "offset": 45
    }
  ],
  "location": "SmartWidgetStepDefinitions.VA_asks_if_contact_wants_to_schedule_a_tour(String)"
});
formatter.result({
  "status": "skipped"
>>>>>>> Stashed changes
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "Essex",
      "offset": 28
    }
  ],
  "location": "PropertiesStepDefinitions.User_enters_a_Company_Name(String)"
});
formatter.result({
  "duration": 269790700,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_search_submit_icon()"
});
formatter.result({
  "duration": 3215409200,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_eight_information_titles()"
});
formatter.result({
  "duration": 77400,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_information_related_to_the_search()"
});
formatter.result({
  "duration": 301228000,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_property_search_drop_down()"
});
formatter.result({
  "duration": 688624400,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_picks_Property_ID()"
});
formatter.result({
  "duration": 618867400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7789",
      "offset": 27
    }
  ],
  "location": "PropertiesStepDefinitions.User_enters_a_Property_ID(String)"
});
formatter.result({
  "duration": 161038200,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_search_submit_icon()"
});
formatter.result({
  "duration": 3115419000,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_eight_information_titles()"
});
formatter.result({
  "duration": 99500,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_information_related_to_the_search()"
});
formatter.result({
  "duration": 374931300,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_actual_property_name()"
});
formatter.result({
  "duration": 805501700,
  "status": "passed"
=======
      "val": "yes",
      "offset": 54
    }
  ],
  "location": "SmartWidgetStepDefinitions.Contact_answers_the_question_about_scheduling_a_tour(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "In order to book a tour, I need a little more information.",
      "offset": 66
    }
  ],
  "location": "SmartWidgetStepDefinitions.VA_informs_that_it_needs_some_info_to_be_able_to_schedule_a_tour(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmartWidgetStepDefinitions.VA_asks_for_contacts_first_name()"
});
formatter.result({
  "status": "skipped"
>>>>>>> Stashed changes
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "/property/",
      "offset": 47
    }
  ],
  "location": "PropertiesStepDefinitions.User_is_directed_to_the_property_details_page(String)"
});
formatter.result({
  "duration": 3073933300,
  "status": "passed"
});
formatter.after({
  "duration": 1727268800,
=======
      "val": "Aryana",
      "offset": 47
    }
  ],
  "location": "SmartWidgetStepDefinitions.Contact_answers_the_question_about_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmartWidgetStepDefinitions.VA_asks_for_contacts_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rezai",
      "offset": 46
    }
  ],
  "location": "SmartWidgetStepDefinitions.Contact_answers_the_question_about_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmartWidgetStepDefinitions.VA_asks_for_contacts_email_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "aryana.rezai@realpage.com",
      "offset": 50
    }
  ],
  "location": "SmartWidgetStepDefinitions.Contact_answers_the_question_about_email_address(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4692165826",
      "offset": 49
    }
  ],
  "location": "SmartWidgetStepDefinitions.Contact_answers_the_question_about_phone_number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "What would be a good day for you to come visit?",
      "offset": 30
    }
  ],
  "location": "SmartWidgetStepDefinitions.VA_asks_for_desired_tour_day(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmartWidgetStepDefinitions.VA_displays_the_date_calendar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmartWidgetStepDefinitions.Contact_picks_a_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1804794800,
>>>>>>> Stashed changes
  "status": "passed"
});
});