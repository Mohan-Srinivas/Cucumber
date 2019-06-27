
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  

 ## @tag2
  ##Scenario Outline: Title of your scenario outline
   ## Given I want to write a step with "<name>"
    ##When I check for the "<value>" in step
   ## Then Logged in

    ##Examples: 
     ## | name  |   value     | 
     ## | Alia  |   abc       | 
     ## | Nazi  |   abc@3     | 

  @tag3
   Scenario: Account Creation
  Given Want to create a Account
  When I enter my Credentials
  
      | name  |   value     | age |
      | Alia  |   abc       | 21  |
      | Nazi  |   abc@3     | 20	|
  
   Then I verified
  