$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/ProductsSettings/productssettings.feature");
formatter.feature({
  "line": 1,
  "name": "Properties HTML Rendering",
  "description": "",
  "id": "properties-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3897626100,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Rendering Properties Page",
  "description": "",
  "id": "properties-html-rendering;rendering-properties-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "QA Tester wants to navigate the content of LoginPage",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User have landed on Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters valid username \"john.fischelli@realpage.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters valid password \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User is directed to the Home Page \"/properties\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User navigates to the Proprty Product URL https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/products",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User picks Chat For Leasing",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User navigates to Settings Page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "The Leasing settings Card is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User navigates to the widget https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "The Leasing Subject is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User navigates back to Products",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User selects Chat for Maintenance",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User navigates to Settings Page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "The Maintenance settings Card is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User navigates to the widget https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "The Maintenance Subject is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User navigates back to Products",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User selects Text for Leasing",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User navigates to Settings Page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "The Phone Numbers card is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "the IVR Greeting Menus is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User navigates to the widget https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Text Messages option is Enabled under Leasing subject",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User navigates back to Products",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User selects Text for Maintenance",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User navigates to Settings Page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "The Phone Numbers card is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "the IVR Greeting Menus is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User navigates to the widget https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Text Messages option is Enabled under Maintenance subject",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User unmarks all the options",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "QA Tester",
      "offset": 0
    },
    {
      "val": "LoginPage",
      "offset": 43
    }
  ],
  "location": "CucumberStepDefinitions.open_site(String,String)"
});
formatter.result({
  "duration": 1577836300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_have_landed_on_Login_Page()"
});
formatter.result({
  "duration": 40999000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john.fischelli@realpage.com",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinitions.User_enters_valid_username(String)"
});
formatter.result({
  "duration": 322006600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinitions.User_enters_valid_password(String)"
});
formatter.result({
  "duration": 192691200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 1773136100,
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
  "duration": 1022520600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/products",
      "offset": 42
    }
  ],
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_Proprty_Product_URL(String)"
});
formatter.result({
  "duration": 2352734100,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_picks_Chat_For_Leasing()"
});
formatter.result({
  "duration": 2736059000,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_Settings_Page()"
});
formatter.result({
  "duration": 4759463200,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.The_Leasing_settings_Card_is_displayed()"
});
formatter.result({
  "duration": 66153800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg",
      "offset": 29
    }
  ],
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_the_widget(String)"
});
formatter.result({
  "duration": 3085218200,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.The_Leasing_Subject_is_displayed()"
});
formatter.result({
  "duration": 131979300,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_navigates_back_to_Products()"
});
formatter.result({
  "duration": 3775568000,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_selects_Chat_for_Maintenance()"
});
formatter.result({
  "duration": 2175847000,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_Settings_Page()"
});
formatter.result({
  "duration": 4543210900,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.The_Maintenance_settings_Card_is_displayed()"
});
formatter.result({
  "duration": 76090300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg",
      "offset": 29
    }
  ],
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_the_widget(String)"
});
formatter.result({
  "duration": 2887439900,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.The_Maintenance_Subject_is_displayed()"
});
formatter.result({
  "duration": 99613200,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_navigates_back_to_Products()"
});
formatter.result({
  "duration": 3809337900,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_selects_Text_for_Leasing()"
});
formatter.result({
  "duration": 2194586400,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_Settings_Page()"
});
formatter.result({
  "duration": 4503471900,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.The_Phone_Numbers_card_is_displayed()"
});
formatter.result({
  "duration": 57260900,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.the_IVR_Greeting_Menus_is_displayed()"
});
formatter.result({
  "duration": 56214200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg",
      "offset": 29
    }
  ],
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_the_widget(String)"
});
formatter.result({
  "duration": 2871645000,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.Text_Messages_option_is_Enabled_under_Leasing_subject()"
});
formatter.result({
  "duration": 75500,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_navigates_back_to_Products()"
});
formatter.result({
  "duration": 3834155600,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_selects_Text_for_Maintenance()"
});
formatter.result({
  "duration": 2064985700,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_Settings_Page()"
});
formatter.result({
  "duration": 4628530900,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.The_Phone_Numbers_card_is_displayed()"
});
formatter.result({
  "duration": 68946800,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.the_IVR_Greeting_Menus_is_displayed()"
});
formatter.result({
  "duration": 46487200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg",
      "offset": 29
    }
  ],
  "location": "ProductsSettingsStepDefinitions.User_navigates_to_the_widget(String)"
});
formatter.result({
  "duration": 2822905500,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.Text_Messages_option_is_Enabled_under_Maintenance_subject()"
});
formatter.result({
  "duration": 56700,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSettingsStepDefinitions.User_unmarks_all_the_options()"
});
formatter.result({
  "duration": 3462489900,
  "status": "passed"
});
formatter.after({
  "duration": 1381225800,
  "status": "passed"
});
});