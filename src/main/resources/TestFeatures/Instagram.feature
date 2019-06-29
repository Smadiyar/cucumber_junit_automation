Feature: Testing Instagram

  Scenario: Verifying that user is able to login using a valid credentials

    Given User is on Instagram login page
    Then User logs in with valid credentials username "moon_light_in_the_dark" userpassword "<qwertyuiop>"
    Then User verifies logged in to homepage of Instagram