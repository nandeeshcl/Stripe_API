@retrieve_customer_API
Feature: Validate Retrieve Customer API
  This API is used to test functinality of retireve customer api

  Scenario: Validate Retrieve Customer API with valid key
    Given I have valid auth key
    When I send Get request
    Then status code should be <status_code>
    And same customer id should be in response
    And response should consists <balance>
    And object should be customer
