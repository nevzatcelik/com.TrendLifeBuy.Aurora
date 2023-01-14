
Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

  Scenario Outline: JDBC01 kullanici database de sorgu yapabilmeli

    Given fatih JDBC ile database ebaglanir "fatihdata" tablosundaki verileri alir
    And User verifies "<id>" "order_number" from data base
    Examples:
      | id |
      | 3 |