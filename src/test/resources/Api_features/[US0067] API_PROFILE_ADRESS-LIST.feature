@Api
Feature: US0067

  Scenario: US0067

    Given Bora gerekli path "ilkdata1" "boraData1" "" param ayarlarini yapar
    Then  KullaniciB GET request islemi yapar ve response alir
    Then  KullaniciB statusunun "200" oldugunu dogrular
    And   KullaniciB Kullanici response body bilgelerini dogrular