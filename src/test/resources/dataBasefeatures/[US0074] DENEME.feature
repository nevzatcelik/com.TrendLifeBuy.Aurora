
Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

  Scenario Outline: JDBC01 kullanici database de sorgu yapabilmeli

    Given nevzat JDBC ile database ebaglanir "<query>" tablosundaki verileri alir
    And   User verifies "<id>" "first_name" "last_name" "email" "role_id" "<nameAssert>" "<lastAssert>" "<emailAss>" "<roleidAss>"from data base
    Examples:
      |nameAssert|lastAssert|emailAss                       |roleidAss| query|
      | Super    |  admin   |  info@trendlifebuy.com        |     1    |select id,first_name,last_name,email,role_id from u480337000_tlb_training.users where id=1;  |
      | New User |  Surname |  c@c.com                      |     4    |select id,first_name,last_name,email,role_id from u480337000_tlb_training.users where id=46; |
      | Arif     |  Hossain |  arif.hossain@gmail.com       |     4    |select id,first_name,last_name,email,role_id from u480337000_tlb_training.users where id=21; |



