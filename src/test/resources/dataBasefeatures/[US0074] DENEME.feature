@dtb
Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

  Scenario Outline: JDBC01 kullanici database de sorgu yapabilmeli

    Given nevzat JDBC ile database ebaglanir "nevzatdata" tablosundaki verileri alir
    And   User verifies "<id>" "first_name" "last_name" "email" "role_id" from data base
    Examples:
      | id |
      | 1 |

