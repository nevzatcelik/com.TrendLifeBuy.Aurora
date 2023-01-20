
  Feature: US0066 As a user, I shouldn't be able to connect to the API with my wrong Email and Wrong Password.


    Scenario: [TC_5601] When a request is sent with the wrong email and correct password information in the /api/login endpoint body, it should be verified that the status code of the response is 401 Unauthorized and that "Invalid Credintials" is written in the message section.

      Given User sets Post the necessary "ilkdata1" "leventData3" path param
      Then  User sends Post request with wrong email and correct password and gets response
      Then  User Verifies Post user status is "401"
      Then  UserL Verifies that there is "Invalid Credintials" message in the response


    Scenario: [TC_5602] When a request is sent with the wrong email and correct password information in the /api/login endpoint body, it should be verified that the status code of the response is 401 Unauthorized and that "Invalid Credintials" is written in the message section.

      Given User sets Post the necessary "ilkdata1" "leventData3" path param
      Then  User sends Post request with correct email and wrong password and gets response
      Then  User Verifies Post user status is "401"
      Then  UserL Verifies that there is "Invalid Credintials" message in the response


    Scenario: [TC_5603] When a request is sent with the wrong email and correct password information in the /api/login endpoint body, it should be verified that the status code of the response is 401 Unauthorized and that "Invalid Credintials" is written in the message section.

      Given User sets Post the necessary "ilkdata1" "leventData3" path param
      Then  User sends Post request with wrong email and wrong password and gets response
      Then  User Verifies Post user status is "401"
      Then  UserL Verifies that there is "Invalid Credintials" message in the response
