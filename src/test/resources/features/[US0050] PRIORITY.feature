
Feature: US050 As an administrator, I want a page to be able to perform operations related to
  the priorities that users will choose when opening a ticket.

  Scenario: TC_5001 Verify that the Priority link leads to the Priority page

    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin verifies if the Priority link leads to Priority page
    And Admin closes "adminUrl"

  Scenario: TC_5002 It should be verified that a new Priority can be created for
  Tickets by entering the name and status from the Add new section on the Priority page.

    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin clicks on Add New Box and enters a name
    Then Admin verifies if a new Priority can be seen under the Priority List
    And Admin closes "adminUrl"

  Scenario: TC_5003 It should be verified that a new Priority can be created for
  Tickets by entering the name and status from the Add new section on the Priority page.

    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin verifies if the Priorities are displayed according to Name,Status and Actions headings
    And Admin closes "adminUrl"

  Scenario: TC_5004 It should be verified that the status of the
  Priorities can be changed under the Status title in the Priority List.


    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin verifies if the status of the Priorities can be changed under the Status title
    And Admin closes "adminUrl"



