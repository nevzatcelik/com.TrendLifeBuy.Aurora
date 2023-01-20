
  Feature:

    Scenario:
      Given User sets the necessary "ilkdata1" "talhadata2" path param
      Then  User sends GET request and gets response
      Then  User Verifies user status is "200"
      Then  UserT verifies the returned response body