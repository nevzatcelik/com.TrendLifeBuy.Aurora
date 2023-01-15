
Feature:

  Scenario Outline: EMINE

    Given  Emine gets the data in the table "<eminedata>" by connecting to the database
    Then   Emine verifies LIST that "name" "phonecode"  in the list "<expectedname>" "<expectedphone>"
    Examples:
    |eminedata                                                                  |expectedname|expectedphone|
    |Select id,name,phonecode from u480337000_tlb_training.countries where id=5;|Andorra     |376|
    |Select id,name,phonecode from u480337000_tlb_training.countries where id=6;|Angola      |244|
    |Select id,name,phonecode from u480337000_tlb_training.countries where id=7;|Anguilla    |1264|
    |Select id,name,phonecode from u480337000_tlb_training.countries where id=8;|Antarctica  |0|
