
Feature: Pay Bills

  @wip
  Scenario: User should be able to complete pay operation

    Given The user should be able to login
    When The user should be sign in
    And The user should be able to input valid credantials
    And The user should be navigate new url "http://zero.webappsecurity.com/bank/account-summary.html"
    And The user should navigate to "Pay Bills"
    And The user should input pay requirments
    Then "The payment was successfully submitted" message should be displayed
