
  Feature: GURSEL

    Scenario: GURSEL

      Then Kullanici gerekli path "ilkdata1" "gurseldata2" "" param ayarlarini yapar
      * Kullanici request islemi yapar ve response alir
      * Kullanici statusunun "200" oldugunu dogrular
      * User degerlerini Matcher class yontemi ile dogrular

      Scenario:
        * Kullanici gerekli path "ilkdata1" "gurseldata2" "" param ayarlarini yapar
        * Kullanici request islemi yapar ve response alir
        * Kullanici statusunun "200" oldugunu dogrular
        Then Kullanici token oldugunu dogrular