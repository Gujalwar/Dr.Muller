Feature: User login functionality
  @US1AC01
  Scenario: The user is able to login the webpage using valid credentials
    Given The user is on home page
    When The user clicks on account
    Then The user enters "niko@gmail.com" as a email for login
    Then The user enters "123456" as a password for login
    When The user clicks on login button
    Then The user is able to login

    @US1AC02
    Scenario: The user gets an error message when tries to enter invalid email
      Given The user is on home page
      When The user clicks on account
      Then The user enters "ni@gmail.com" as a email for login
      Then The user enters "123456" as a password for login
      When The user clicks on login button
      Then The user gets an invalid credentials error message

Scenario:
  @US1AC03
  Scenario: The user gets an error message when tries to enter invalid password
    Given The user is on home page
    When The user clicks on account
    Then The user enters "niko@gmail.com" as a email for login
    Then The user enters "1234" as a password for login
    When The user clicks on login button
    Then The user gets an invalid credentials error message for password

