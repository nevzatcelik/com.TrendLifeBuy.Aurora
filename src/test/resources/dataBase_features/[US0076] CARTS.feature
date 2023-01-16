
Feature:  Zeynep

  Scenario:   Zeynep

    Given  Zeynep JDBC ile database ebaglanir "zeynepdata" tablosundaki veriyi olusturur
  @dtb
  Scenario: ZEYNEP2

    Given Zeynep JDBC ile database ebaglanir "zeynepdata2" tablosundaki verileri alir
    Then  Zeynep  Taha verifies LIST that "id" in the list "104"