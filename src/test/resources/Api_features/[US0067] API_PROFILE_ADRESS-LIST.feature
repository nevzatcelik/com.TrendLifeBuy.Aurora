
Feature: US0067

  Scenario: US0067

    Given User sets the necessary "ilkdata1" "boraData1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserB verifies the returned response body

  Scenario:
    Given User sets Post the necessary "ilkdata1" "boraData3" path param
    Then  UserB sends Post request and gets response
    Then  User Verifies Post user status is "201"
    Then  User Verifies Post returned "message" "address added successfully" response body

  Scenario:

    Given User sets Patch the necessary "ilkdata1" "boradata4" path param
    Then  User sends Patch request and gets response
    Then  User Verifies Patch user status is "202"
    Then  User Verifies Patch returned "message" "address updated successfully" response body
  @api
  Scenario:
# bu seneryo sadece 1 kere calisir 2. kez calistirilmak istenildiginde id numarasi degismeli 59,58......
  Given  User sets Delete the necessary "ilkdata1" "boraData2" path param
  Then   UserB sends Delete request and gets response
  Then   User Verifies Delete user status is "202"
  Then   UserB verifies the returned Deleted "message" "address deleted successfully" response body







   # Given Bora gerekli path "ilkdata1" "boraData1" "" param ayarlarini yapar
   # Then  KullaniciB GET request islemi yapar ve response alir
   # Then  KullaniciB statusunun "200" oldugunu dogrular
   # And   KullaniciB Kullanici response body bilgelerini dogrular