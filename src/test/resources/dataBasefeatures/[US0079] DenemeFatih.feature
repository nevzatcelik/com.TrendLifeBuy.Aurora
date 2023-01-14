
Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

  Scenario Outline: JDBC01 kullanici database de sorgu yapabilmeli

    Given The user gets the data in the table "fatihdata" by connecting to the database
    And User verifies that "order_number" of "id" is in the list "<expected>"
    Examples:
      | expected |
      | 3 |