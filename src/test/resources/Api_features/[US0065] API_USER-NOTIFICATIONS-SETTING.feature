@api
  Feature: API_USER-NOTIFICATIONS-SETTING

    Scenario: When a GET Request is sent to the /api/user-notifications-setting endpoint, it should be checked that the status code returned is 200 and that the information in the Response Body is correct.


      Given User sets the necessary "ilkdata1" "fatihdata2" path param
      Then  User sends GET request and gets response
      Then  User Verifies user status is "200"
      Then  UserFf verifies the returned response body