
Feature:

  Scenario:
    Given User sets the necessary "ilkdata1" "zeynepdata1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserZ verifies the returned response body

  # Bu seneryo da olusturudugumuz objedeki id her sorguda degismeli
    Scenario: post
      Given User sets Post the necessary "ilkdata1" "zeynepdata1" path param
      Then  UserZ sends Post request and gets response
      Then  User Verifies Post user status is "201"
      Then  User Verifies Post returned "message" "Product added to wishlist." response body

    Scenario: When a POST Request Body is sent to the /api/wishlist endpoint with a product information already in Wishlist, it should be verified that the status code returned is 409 Conflict and the message information in the Response Body is "Product already in wishlist".

      Given User sets Post the necessary "ilkdata1" "zeynepdata1" path param
      Then  Userzzz sends Post request and gets response
      Then  User Verifies Post user status is "409"
      Then  User Verifies Post returned "message" "Product already in wishlist" response body