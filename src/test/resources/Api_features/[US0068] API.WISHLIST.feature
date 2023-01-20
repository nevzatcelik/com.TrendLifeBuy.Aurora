
Feature:

  Scenario:
    Given User sets the necessary "ilkdata1" "zeynepdata1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserZ verifies the returned response body

    Scenario: post
      Given User sets Post the necessary "ilkdata1" "zeynepdata1" path param
      Then  UserZ sends Post request and gets response
      Then  User Verifies Post user status is "201"
      Then  User verifies Response Body is Product added to wishlist.