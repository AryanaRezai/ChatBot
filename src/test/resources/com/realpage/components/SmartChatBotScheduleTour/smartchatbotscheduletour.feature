Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "SmartChatBotScheduleTour"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT tab
    Then Bot generates auto greeting
    And Prospect asks to schedule tour "Schedule Tour"
    And In order to schedule tour bot needs information "In order to schedule a tour, I need a little more information."
    And Bot asks for prospects first name "What's your first name?"
    And Prospect responses with their first name "Aryana"
    And Bot asks for prospects last name "And your last name?"
    And Prospect responds with their last name "Rezai"
    And Bot asks for prospects email or phone number "What is your phone number or email address?"
    And Prospect responds with their phone number or email "4692165826"
    Then Bot asks how many bedrooms prospect is looking for "How many bedrooms are you looking for?"
    And Prospect responds with number of bedrooms <nrBeds>
    And Bot asks prospect about moving date 
    And Prospect picks their move in date in the date picker
    And Bot asks about day to come and visit "What would be a good day for you to come visit?"
    Then Bot displays a calendar
    When Prospect selects a visit date
    Then Bot confirms that date "Your visit is scheduled for Friday June 19th at 9:00 am. Looking forward to see you there!"
    
 
    Examples:
    |userName|pageName|nrBeds|
    |QA Tester|ConsumerWidgetPage|2|
    
  
    
   
 
   