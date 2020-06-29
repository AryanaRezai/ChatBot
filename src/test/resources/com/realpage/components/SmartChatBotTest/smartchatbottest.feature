Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "SmartChatBotTest"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT tab
    Then Bot generates auto greeting
    And Prospect has leasing question <leasingQuestion>
    Then Bot asks how many bedrooms "How many bedrooms are you looking for?"
    And Prospect responds with number of bedrooms <nrBeds>
    And Bot asks about moving date 
    And Prospect picks a move in date in the date picker
    And Bot responds with availability information 
    And Bot asks if it can help with anything else "Alright. Is there anything else I can help with?"
    And Prospect answers no thanks "No"
    And Bot ends the conversation with greeting "Thank you for chatting with me today! If you have additional questions, please feel free to start a new chat or call us at (972) 484-5691"
    
    Examples:
    |userName|pageName|leasingQuestion|nrBeds|
    |QA Tester|ConsumerWidgetPage|Find an apartment|2|
  
    
   
 
   