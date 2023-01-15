
Feature: LEVENT

  Scenario: LEVENT

    Given Levent gets the data in the table "leventdata1" by connecting to the database
    Then  Levent verifies that "address" in the list ""

  Scenario Outline:  LEVENT 2

    Given Levent gets the data in the table "leventdata2" by connecting to the database
    Then  Levent verifies LIST that "address" in the list "<expected>"
  Examples:
    | expected |
    | Savar, Dhaka, Bangladesh |
    |  Dhaka|
