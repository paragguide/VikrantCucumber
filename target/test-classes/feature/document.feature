Feature: Amazon Project Document
  this document is for amazon login and shopping
  
  @amazon @userid
  Scenario: Amazon Userid test
    Given browser "chrome" is open with url "https://www.amazon.in/"
    And i click signin
    When I enter valid userid "paragguide@yahoo.co.in"
    And click continue button
    Then I validate the userid 
  
  @amazon @password  
  Scenario: Amazon Password test
    Given userid is valid
    When enter password "RMinfotech"
    And click submit button
    Then validate password
  
  @amazon @search  
  Scenario Outline: Product search
   Given i am logged in  
   When i search for product <product> in price <price>
   Then results must come
   
   Examples:
   |product|price|
   |Shirt| 1200 |
   | Pant | 3000 |
   | Tie | 500 |
   
   @amazon @register
   Scenario: Signin
   Given i open browser "chrome" and enter url "https://www.amazon.in"
   And clicked sigin link
   When i click new user
   Then Registration form shuold open
     
    

  