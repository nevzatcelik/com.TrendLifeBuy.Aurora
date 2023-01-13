
Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

  Scenario Outline: JDBC01 kullanici database de sorgu yapabilmeli

    Given Kullanici JDBC ile database ebaglanir
    Then  "orders" tablosundaki verilerini alir
    And User verifies "<id>" "order_payment_id" from data base
    Examples:
      | id |
      | 3 |