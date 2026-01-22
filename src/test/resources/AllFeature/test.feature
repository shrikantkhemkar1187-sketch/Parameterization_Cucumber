Feature:
Test facebook application

  Scenario:
  validate register test functionality

    Given user is on facebook register page
    When user enter "Shrikant" and "Khemkar"
    And user enter valid 9960594 and "shri@yopmail.com"
    And user enter 15 and "Dec" and 2002
    Then user click on Register button
