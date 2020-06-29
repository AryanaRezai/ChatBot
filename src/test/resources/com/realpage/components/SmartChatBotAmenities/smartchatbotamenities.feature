Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "SmartChatBotAmenities"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT tab
    Then Bot generates auto greeting
    And Prospect asks about amenities "Amenities"
    Then Bot says that it needs more info "Sounds like you have a question about our amenities, before I can get you over to someone who can help I need a little more information."
    And Bot asks for prospects first name "What's your first name?"
    And Prospect responses with their first name "Aryana"
    And Bot asks for prospects last name "And your last name?"
    And Prospect responds with their last name "Rezai"
    And Bot asks for prospects email or phone number "What is your phone number or email address?"
    And Prospect responds with their phone number or email "4692165826"
    And Bot routes prospect to an agent "Let me get you to an agent that can help."
    Examples:
    |userName|pageName|
    |QA Tester|ConsumerWidgetPage|
  
    
   
 
   