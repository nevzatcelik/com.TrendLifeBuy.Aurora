
Feature:  Talha

  Scenario Outline:  TALHA

    Given Talha JDBC ile database ebaglanir "talhadata" tablosundaki verileri alir
    Then  Then  Taha verifies LIST that "name" in the list "<expected>"
    Examples:
      | expected |
      | Casio |
      | Nike |
      | Apple |
      |  LG |