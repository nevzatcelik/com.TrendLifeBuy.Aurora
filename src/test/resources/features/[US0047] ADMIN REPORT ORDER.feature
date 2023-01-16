Feature: US0047 As an administrator, I want the Order page to be able to see the reports about the orders on the site

  Scenario: TC_4701 It must be verified that the page related to the Order Link can be accessed

    Given Open browser go to url "adminUrl"
    Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then page related to the Order Link can be accessed
    And Closes the page

    Scenario: TC_4702 In order to filter the product on the page that opens, it must be verified that the Type and Date are selectable

      Given Open browser go to url "adminUrl"
      Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Admin Reports link
      Then Click order link


