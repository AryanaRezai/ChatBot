Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "SmartChatBotOfficeHours"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT tab
    Then Bot generates auto greeting
    And Prospect asks about Office Hours <officeHours>
    And Bot responds to Office Hours question "Our office hours are:"
    And Bot asks if it can help with something else "What else can I help you with?"
    And Prospect answers nothing thanks "Nothing"
    And Bot responds with Got It "Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691"
    And The rate conversation button is displayed
    Examples:
    |userName|pageName|officeHours|
    |QA Tester|ConsumerWidgetPage|What are your Office Hours?|
    |QA Tester|ConsumerWidgetPage|What are your open Hours?|
    |QA Tester|ConsumerWidgetPage|Opening Hours|
  
    
   
 
   