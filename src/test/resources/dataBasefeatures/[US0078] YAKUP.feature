@dtb
  Feature: yakup

    Scenario Outline: yakup

      Given Yakup gets the data in the table "yakupdata" by connecting to the database
      Then  Then  The user verifies that "name" in the list "<expected>"
      Examples:
         |expected|
        | Czarna Bialostocka |
        | Czersk|
        | Czluchow |
        | Czechowice-Dziedzice|
        | Czeladz |
        | Czerwionka-Leszczyny |
        | Czestochowa |
        | Czarnkow |