
Feature:  BRANDS

  Scenario Outline: The brands in the Brands table should be saved in a list and it should be verified whether the desired brand is in the list.

    Given Talha JDBC ile database ebaglanir "talhadata" tablosundaki verileri alir
    Then  Then  Taha verifies LIST that "name" in the list "<expected>"
    Examples:
      | expected |
      | Casio |
      | Nike |
      | Apple |
      |  LG |