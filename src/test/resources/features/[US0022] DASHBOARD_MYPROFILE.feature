@SmokeTest
Feature: US22

  Scenario: TC_2201 Kullanici My account sayfasinin gorulur oldugunu dogrular

    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then  User clicks on dashboard link
    Then  User clicks My Account section on dashboard page
    Then  User verifies that the page is "expected" accessible
    And   Closes the page


  Scenario: TC_2202
    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User clicks Choose File button on My Profile page and "uploadPhoto" Photo
    Then User verifies that the photo  is uploaded
