Feature: Bir yönetici olarak DataBase üzerinden Staff tablosundaki istenen Personelin ID'sini dogrulayabilmeliyim

  Scenario Outline:Staff tablosundaki ID'ler bir listeye alinarak istenilen ID'nin bu listede olup olmadigi dogrulanmali.

    Given AdminG gets the data in the table "gurseldata" by connecting to the database
    Then  AdminG verifies that "id" in the list "<expected>"
    Examples:
      | expected |
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |
      | 7 |
