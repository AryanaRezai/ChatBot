Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "SmartWidget"
    Given <userName> wants to navigate the content of <pageName>
    When User clicks on the Start Chatting button 
    Then The first greeting is displayed "Hi! I'm your Virtual Assistant."
    And The second greeting is displayed "I am going to ask a few simple questions.  First, would you like to chat about finding an apartment, scheduling a tour or something else?"
    When Contact answers find an apartment "Find an apartment"
    Then VA asks about desired home size
    And Contact answers number of bedrooms "2 bedrooms"
    Then VA asks about desired move in date "Great, when are you looking to move?"
    And Contact answers desired move in date "Next Month"
    Then VA comes back with availablity information 
    Then VA asks if contact wants to schedule a tour "Would you like to schedule a tour?"
    And Contact answers the question about scheduling a tour "yes"
    Then VA informs that it needs some info to be able to schedule a tour "In order to book a tour, I need a little more information."
    And VA asks for contacts first name
    Then Contact answers the question about first name "Aryana"
    And VA asks for contacts last name 
    Then Contact answers the question about last name "Rezai"
    Then VA asks for contacts email address
    And Contact answers the question about email address "aryana.rezai@realpage.com"
    Then Contact answers the question about phone Number "4692165826"
    And VA asks for desired tour day "What would be a good day for you to come visit?"
    And VA displays the date calendar
    Then Contact picks a date
  
   
   
    Examples:
    |userName|pageName|
    |QA Tester|smartWidgetrja|
    
   
 
   