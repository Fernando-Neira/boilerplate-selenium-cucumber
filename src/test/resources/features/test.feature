Feature: Example test

  Scenario: Example test 01
    Given open url "http://www.google.com"
    And type "Cucumber tutorial baeldung" in search box
    When press search button
    Then watch result list