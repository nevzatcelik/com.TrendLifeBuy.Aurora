
  Feature: GURSEL

    Scenario: GURSEL

      Then Kullanici gerekli path "ilkdata1" "gurseldata2" "" param ayarlarini yapar
      Then Kullanici request islemi yapar ve response alir
      Then Kullanici statusunun "200" oldugunu dogrular
      Then User degerlerini Matcher class yontemi ile dogrular
    @api
      Scenario:
        Then Kullanici gerekli path "ilkdata1" "gurseldata2" "" param ayarlarini yapar
        Then Kullanici request islemi yapar ve response alir
        Then Kullanici statusunun "200" oldugunu dogrular
        Then Kullanici token oldugunu dogrular