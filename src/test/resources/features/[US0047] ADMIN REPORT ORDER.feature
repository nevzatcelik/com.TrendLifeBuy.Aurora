Feature: US0047 As an administrator, I want the Order page to be able to see the reports about the orders on the site

  Scenario: TC_4701 It must be verified that the page related to the Order Link can be accessed

    Given Open browser go to url "adminUrl"
    Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link