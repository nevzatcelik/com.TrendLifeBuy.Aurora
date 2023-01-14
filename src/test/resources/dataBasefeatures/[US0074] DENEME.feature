@dtb
Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

  Scenario Outline: JDBC01 kullanici database de sorgu yapabilmeli

    Given nevzat JDBC ile database ebaglanir "nevzatdata" tablosundaki verileri alir
    And   User verifies "<id>" "first_name" "last_name" "email" "role_id" "<nameAssert>" "<lastAssert>" "<emailAss>" "<roleidAss>"from data base
    Examples:
      |nameAssert|lastAssert|emailAss                       |roleidAss|
      | Super    |  admin   |  powercoders35@gmail.com      |     4    |
      | Anil     |  Surname |  tufsir@gmail.com             |     4    |
      | Super    |  User    |  staff@gmail.com              |     4    |
      | Super    |  Young   |  denemeAdmin@gmail.com        |     4    |


