@create_customer_api
Feature: Validate Create Customer API
  This feature will check Create new Customer API with valid and in-valid auth key

  Scenario Outline: Validate Create Customer API with valid Auth Key
    Given I have valid auth key
    And I have Balance amount <balance>
    And I have Description "<description>"
    When I send post request
    Then the status code should be <status_code>
    And the field "<id>" should in the response
    And the Balance amount should be <balance>

    Examples: 
      | balance | description            | status_code |
      |    5000 | This is new Customer 1 |         200 |
      |   10000 | This is new Customer 2 |         200 |

  Scenario Outline: Validate Create Customer API with In-valid Auth Key
    Given I have In-valid auth key
    And I have Balance amount <balance>
    When I send post request
    Then the status code should be <status_code>
    And the field id should not be in the response

    Examples: 
      | balance | status_code |
      |    5000 |         401 |
