

Feature: US0076 As an administrator, I should be able to add products to the cart via DataBase,
  and verify that the added product is in the Carts list.

  Scenario: TC_7601 I should be able to add products to the Carts

    Given Kullanici JDBC ile database'e baglanir
    #Then carts tablosundaki id verilerini alir
    #And id verilerini test eder
    Then carts tablosuna yeni ürün ekler

