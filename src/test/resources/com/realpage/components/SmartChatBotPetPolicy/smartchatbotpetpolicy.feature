Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "SmartChatBot Pet Policy"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT tab
    Then Bot generates auto greeting
    And Prospect asks about pet policy <petQuestion>
    And Bot responds to Pet Policy question "Our pet policy is:"
    And Bot asks if it can help with something else "What else can I help you with?"
    And Prospect answers nothing thanks "Nothing"
     And Bot responds with Got It "Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691"
    And The rate conversation button is displayed
    
    
    Examples:
    |userName|pageName|petQuestion|
    |QA Tester|ConsumerWidgetPage|What is your pet policy?|
    |QA Tester|ConsumerWidgetPage|Do you accept big dogs?|
    |QA Tester|ConsumerWidgetPage|How many pets is allowed?|
  
    
   
 
   