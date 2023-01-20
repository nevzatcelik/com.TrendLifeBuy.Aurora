
Feature:

  Scenario:
    Given User sets the necessary "ilkdata1" "eminedata1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserE verifies the returned response body

  Scenario:
    Given User sets Post the necessary "ilkdata1" "boraData3" path param
    Then  UserB sends Post request and gets response
    Then  User Verifies Post user status is "201"
    Then  UserB Verifies Post returned response body