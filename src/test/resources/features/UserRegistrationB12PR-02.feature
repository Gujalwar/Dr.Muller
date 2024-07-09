Feature: Registration Page Functions

  @US2AC01
  Scenario: User should be able to see registration page
    Given The user is on home page
    When The user clicks on account
    Then The user is able to see registration page

    @US2AC02
    Scenario: User should be able to get an error message when he/she incorrectly fills the required fields or keep it empty
      Given The user is on home page
      When The user clicks on account
      Then The user is able to see registration page
      Then The user clicks on registration page
      Then The user selects gender
      Then Then user keeps first name field empty
      Then The user enters "Muller" as a last name
      Then The user selects date of birth
      Then The user enters "muller@gmail.com" as a email
      Then The user enters "euroTech" as a company
      Then The user enters "1234546" as a password
      Then The user enters "123456" as a confirm password
      Then The user clicks on register button
      Then The user gets an error message

  @US2AC03
  Scenario: User should be able to register with valid data
        Given The user is on home page
        When The user clicks on account
        Then The user is able to see registration page
        Then The user clicks on registration page
        Then The user selects gender
        Then Then user enters "Niko" as a first name
        Then The user enters "Muller" as a last name
        Then The user selects date of birth
        Then The user enters "niko@gmail.com" as a email
        Then The user enters "euroTech" as a company
        Then The user enters "123456" as a password
        Then The user enters "123456" as a confirm password
        Then The user clicks on register button
        Then The user is able to register successfully

       @US2AC04
        Scenario: User gets an error message when tries to enter password less than 6 character
          Given The user is on home page
          When The user clicks on account
          Then The user is able to see registration page
          Then The user clicks on registration page
          Then The user selects gender
          Then Then user enters "Daniel" as a first name
          Then The user enters "Muller" as a last name
          Then The user selects date of birth
          Then The user enters "muller@gmail.com" as a email
          Then The user enters "euroTech" as a company
          Then The user enters "12345" as a password
          Then The user enters "12345" as a confirm password
          Then The user clicks on register button
          Then The user gets an password error message



