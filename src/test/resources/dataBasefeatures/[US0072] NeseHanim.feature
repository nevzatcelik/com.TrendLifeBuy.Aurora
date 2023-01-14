Feature:Bir yönetici olarak DataBase üzerinden kullanici email adreslerini listeleyebilmeli ve istenen e_mail adresinin Users tablosunda olup olmadigini dogrulayabilmeliyim

  Scenario: Users tablosundaki emailler bir listeye alinarak istenilen emailin bu listede olup olmadigi dogrulanmali.

    Given  nese JDBC ile database ebaglanir "nesequery" tablosundaki verileri alir