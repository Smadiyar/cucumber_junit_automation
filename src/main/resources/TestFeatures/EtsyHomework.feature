@EtsyHomeWork
Feature: Testing Etsy.com webSite

  Background:
    Given User entering etsy.com page

  Scenario: Choosing items and verifying their prices
    Given User searching for item

      | Item    |ItemN|
      | Earing  |1    |
      | Ring    |2    |
      | Neckles |3    |

    Then User saves item in the cart
    And  User verifyies price