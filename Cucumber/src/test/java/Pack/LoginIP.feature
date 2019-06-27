@tag
Feature: Title
  @nandri @tq
  Scenario: Change Password
    Given user enters password as "abcd123"
    And user enter confirm password as "abcd123"
    Then the password is changed
    
   @tq
   Scenario:Logout
   Given Click the signout button
   Then user is navigated to the home page
  @tag1
  Scenario: Success
    Given User enters username
    When User enters password
    And Click on login button
    Then Home page is displayed
 