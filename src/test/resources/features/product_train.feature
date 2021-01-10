Feature: Create Transaction (case 3)
  Scenario: Create transaction with non-instant payment for one-way trip, 3 adults and 2 infants and select seats
    Given user login and access tiket.com
    Then user going to train page
    And search single trip with 1 dewasa and 1 anak
    And user fill all the information for train
    And choose seat for all the passangers
    And user choose virtual account bca as payment method
    Then user logout from tiket.com
