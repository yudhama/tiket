@flight
Feature: Create Transaction (case 2)
  Scenario: Create transaction with Virtual Account for domestic round trip with 2 transit and login with email
    Given user login and access tiket.com
    Then user going to flight page
    And search round trip flight
    And user filter for 2 transit
    And user fill all the information for flight
    And user choose virtual account mandiri as payment method
    Then user logout from tiket.com
