@api
Feature:

  Scenario:
    Given User sets the necessary "ilkdata1" "eminedata1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserE verifies the returned response body