Feature:  Testing GitStable website



  Background:
    Given User is on GitStable website  loginpage

@loginP
  Scenario: Verifying login functionality with valid credentials
    Then User logs in with valid credentials login "demo" password "demo"
    Then User verifies logged in to homepage


@loginN
    Scenario: Verifying login functionality with invalid credentials
      Then User logs in with valid credentials login "demoo" password "demoo"
      And User verifies error message "Invalid username or password." message