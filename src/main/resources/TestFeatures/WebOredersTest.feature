@WebOrdersTest
Feature: Testing WebOrders application

  Background:
    Given User is loged in to WebOrders with username "Tester" and password "test"

  Scenario: Creating order and verifying it is created
    Given User verifies that he is on WebOrder home page
    Then User goes to Orders page
    And User creates orders

      | Quantity | Customer name | Street | City       | Zip   | Card Nr   | Expire date |
      | 1        | John          | Elm    | Chicago    | 60625 | 876543212 | 06/21        |
      | 2        | Elza          | Clark  | New York   | 11229 | 12345678  | 07/24        |
      | 3        | Aria          | State  | Washington | 22453 | 987654321 | 08/21        |

    Then User goes to View All Orders page
    And User verifies that orders are created

