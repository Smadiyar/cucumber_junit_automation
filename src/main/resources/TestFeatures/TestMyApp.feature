@DataBase
Feature:  Testing My Database

  Scenario: Verifying data on my UI table with Database
    Given User goes to MyApplication homepage
    Then User gets data from UI table
    And Verify that data is matched with DB
