$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/feature_file/Create_Customer.feature");
formatter.feature({
  "name": "Validate Create Customer API",
  "description": "  This feature will check Create new Customer API with valid and in-valid auth key",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@create_customer_API"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate Create Customer API with valid Auth Key",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have valid auth key",
  "keyword": "Given "
});
formatter.step({
  "name": "I have Balance amount \u003cbalance\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I have Description \"\u003cdescription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I send post request",
  "keyword": "When "
});
formatter.step({
  "name": "the status code should be \u003cstatus_code\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "the field \"\u003cid\u003e\" should in the response",
  "keyword": "And "
});
formatter.step({
  "name": "the Balance amount should be \u003cbalance\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "balance",
        "description",
        "status_code"
      ]
    },
    {
      "cells": [
        "5000",
        "This is new Customer 1",
        "200"
      ]
    },
    {
      "cells": [
        "10000",
        "This is new Customer 2",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Create Customer API with valid Auth Key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create_customer_API"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have valid auth key",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_have_valid_auth_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have Balance amount 5000",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_have_Balance_amount(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have Description \"This is new Customer 1\"",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_have_Description(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send post request",
  "keyword": "When "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_send_post_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.the_status_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the field \"\u003cid\u003e\" should in the response",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.the_field_should_in_the_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Balance amount should be 5000",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.the_Balance_amount_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Create Customer API with valid Auth Key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create_customer_API"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have valid auth key",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_have_valid_auth_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have Balance amount 10000",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_have_Balance_amount(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have Description \"This is new Customer 2\"",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_have_Description(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send post request",
  "keyword": "When "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_send_post_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.the_status_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the field \"\u003cid\u003e\" should in the response",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.the_field_should_in_the_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Balance amount should be 10000",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.the_Balance_amount_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate Create Customer API with In-valid Auth Key",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have In-valid auth key",
  "keyword": "Given "
});
formatter.step({
  "name": "I have Balance amount \u003cbalance\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I send post request",
  "keyword": "When "
});
formatter.step({
  "name": "the status code should be \u003cstatus_code\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "the field id should not be in the response",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "balance",
        "status_code"
      ]
    },
    {
      "cells": [
        "5000",
        "401"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Create Customer API with In-valid Auth Key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create_customer_API"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have In-valid auth key",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_have_In_valid_auth_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have Balance amount 5000",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_have_Balance_amount(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send post request",
  "keyword": "When "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.i_send_post_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code should be 401",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.the_status_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the field id should not be in the response",
  "keyword": "And "
});
formatter.match({
  "location": "Create_New_Customer_with_ValidKey.the_field_id_should_not_be_in_the_response()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});