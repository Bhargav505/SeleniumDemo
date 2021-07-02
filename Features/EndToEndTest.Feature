# Comment
@Alltestcases
Feature:EndtoEndTest

  @Testcase1
  Scenario: Verify the title of the Amazon fashion page
    Given open the "https://www.amazon.in/" of the application
    And Take Screenshot of the page
    When click on button "Fashion" in amazon page
    #And Take Screenshot of the page
    Then verify the title "Amazon Fashion" of the page
    #And Take Screenshot of the page
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
 
  @Testcase2
  Scenario: Verify the title of the Electroincs
    Given open the "https://www.amazon.in/" of the application
    And click on button " Electronics " in amazon page
    Then verify the title "Electronics " of the page
    
  @Testcase3
  Scenario: Verify the title of the page
    Given open the "http://demo.automationtesting.in/" of the application
    And Take Screenshot of the page
    And click on the button "Skip Sign In" in the Home page
    Then wait for the page to load
    When Enter the "First" as "Bhargav" in thee Register page
    And Take Screenshot of the page
    When Enter the "Last Name" as "Alluri" in thee Register page
    And Take Screenshot of the page
    Then close the browser
    
     
  @Testcase4
  Scenario: buy the product from shop
  Given open the "http://practice.automationtesting.in/" of the application
  And click on the button "Shop" in the webpage
  And Take Screenshot of the page
    
  
  @Testcase5
  Scenario: upload file in demoautomationtestsuit
  Given open the "http://practice.automationtesting.in/" of the application
  And click on the button "Shop" in the webpage
  And Take Screenshot of the page
  
   @Testcase6
  Scenario: upload file in demoautomationtestsuit
  Given open the "http://automationpractice.com/index.php" of the application
  And click on the button "Shop" in the webpage
  And Take Screenshot of the page
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
    
    
    
    