
Feature: US0067

  Scenario: US0067

    Given User sets the necessary "ilkdata1" "boraData1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserB verifies the returned response body











   # Given Bora gerekli path "ilkdata1" "boraData1" "" param ayarlarini yapar
   # Then  KullaniciB GET request islemi yapar ve response alir
   # Then  KullaniciB statusunun "200" oldugunu dogrular
   # And   KullaniciB Kullanici response body bilgelerini dogrular