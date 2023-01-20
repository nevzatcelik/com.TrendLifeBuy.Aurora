
Feature: US0067
  @api
  Scenario: US0067

    Given User sets the necessary "ilkdata1" "boraData1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserB verifies the returned response body

  Scenario: When DELETE Request Body is sent to the /api/profile/address-delete endpoint with valid information, it should be verified that the status code returned is 201 and the message information in the Response Body is "address deleted successfully".

    Given User sets Delete the necessary "ilkdata1" "boraData1" path param
    Then  User sends Delete request and gets response
    Then  User Verifies Delete user status is "201"
    Then  UserB verifies the returned Delete response body







   # Given Bora gerekli path "ilkdata1" "boraData1" "" param ayarlarini yapar
   # Then  KullaniciB GET request islemi yapar ve response alir
   # Then  KullaniciB statusunun "200" oldugunu dogrular
   # And   KullaniciB Kullanici response body bilgelerini dogrular