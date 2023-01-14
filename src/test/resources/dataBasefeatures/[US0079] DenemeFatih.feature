
Feature: Fatih

  Scenario Outline: FATIH

    Given fatih JDBC ile database ebaglanir "<query>" tablosundaki verileri alir
    And User verifies "customer_id" "order_number" "<expected>" from data base
    Examples:
      | expected |        query       |
      |Order-35-211116030414| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=26;  |
      |Order-23-211116030754| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=26;  |
      |Order-26-211116031600| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=26;  |
      |Order-60-211116034341| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=26;  |
      |Order-83-211116035939| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=26;  |
      |Order-45-211122114237| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=4;   |
