
 Feature: nese

   Scenario: nese

     Then nese gerekli path "ilkdata1" "nesedata2" "" param ayarlarini yapar
     Then Kullanici GET request islemi yapar ve response alir
     Then KullaniciN statusunun "200" oldugunu dogrular
     Then Kullanici response body bilgelerini dogrular