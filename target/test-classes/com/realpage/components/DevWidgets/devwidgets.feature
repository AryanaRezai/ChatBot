Feature: Login HTML Rendering

    Feature : Widgets
    As a user 
    want to verify all the widgets
    so that they are as supposed to

   Scenario Outline: "Login: valid credentials"
    Given I go to login page
    When I enter valid username "john.fischelli@realpage.com"
    And I enter valid password "password"
    And I click on Login Button
    And I am directed to the Home Page "https://realpageos-dev.devplaypen.com/properties"
    When I enter the Widget ID <widgetID>
    Then A payload is visible
    And Widget is visible in less than 10 seconds
    Then I verify the Widget visually
   

    Examples:
    |widgetID|
    |QProY2t3IFg314VU147kzpV|
    
  
    
   
    
  
   
 

   