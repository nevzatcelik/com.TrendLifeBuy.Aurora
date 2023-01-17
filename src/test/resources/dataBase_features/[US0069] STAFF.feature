
Feature: Bir yönetici olarak DataBase üzerinden Staff tablosundaki istenen Personelin ID'sini dogrulayabilmeliyim

  Scenario:Staff tablosundaki ID'ler bir listeye alinarak istenilen ID'nin bu listede olup olmadigi dogrulanmali.

    Given gursel JDBC ile database ebaglanir "gurseldata" tablosundaki verileri alir
    Then  Kullanici listenen idleri litede oldugunu dogrular "expected"
