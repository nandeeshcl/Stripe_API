@update_customer_api
Feature: Validate Update Customer API
  This feature is used to test Update Customer API

  Scenario Outline: Validate Update Customer API with valid key
    Given I have valid auth key
    And new Balance <balance>
    And new Description "<description>"
    When I send post request for update customer api
    Then the status code should be <status_code>
    And response should have balance <balance> and description "<description>"

    Examples: 
      | balance | description | status_code |
      |    5100 | New Update  |         200 |
