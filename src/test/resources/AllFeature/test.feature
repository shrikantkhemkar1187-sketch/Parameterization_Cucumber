Feature:
Test given application

  @Sanity
  Scenario:
  validate register test functionality

    Given user is on facebook register page
    When user enter "Shrikant" and "Khemkar"
    And user enter valid 9960594 and "shri@yopmail.com"
    And user enter 15 and "Dec" and 2002
    Then user click on Register button

  @Regreesion
  Scenario:
validate mailing page functionality

    Given employee is on address page
    When employee write "Shrikant" and "Khemkar"
    And employee write valid 8888898 and "shrikant@gmail.com"
    And employee write 25 and "June" and 1877
    And employee write city name "Pune"
    And employee write state name "Maharashtra"
    And employee write 411027
    Then employee click on mail button

  @Smoke
  Scenario:
validate the login functionality

    Given staff is on login page
    When staff enter the username and password
    And staff click on login button
    Then staff is on home page
