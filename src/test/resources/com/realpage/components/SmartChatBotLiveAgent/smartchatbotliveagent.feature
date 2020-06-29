Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "SmartChatBotLiveAgent"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT tab
    Then Bot generates auto greeting
    And Prospect asks about live agent "Live Agent"
    Then Bot responses for information before routing to an agent "Before I get you to an agent, I need a little information."
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
  
    
   
 
   