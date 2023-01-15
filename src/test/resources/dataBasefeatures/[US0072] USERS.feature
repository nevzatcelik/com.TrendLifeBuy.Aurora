
Feature: NESE

  Scenario Outline: NESE

    Given Nese gets the data in the table "nesedata" by connecting to the database
    Then  Nese verifies LIST that "email" in the list "<expectedmail>"
    Examples:
      | expectedmail |
      | customer@gmail.com|
      | denemeAdmin@gmail.com |