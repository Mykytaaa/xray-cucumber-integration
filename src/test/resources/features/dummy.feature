Feature: Authorization on Youtube

  Scenario: Successful opened the website
    Given user is on the page
    When he enters login "admin" and password "password"
    Then he should see the Youtube dashboard