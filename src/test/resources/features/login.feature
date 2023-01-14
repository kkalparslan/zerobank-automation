
  Feature: Zero Bank Test Automation


    Scenario: Login Test
      Given The user should be able to login
      When The user should be sign in
      And The user should be able to input valid credantials
      And The user should be navigate new url "http://zero.webappsecurity.com/bank/account-summary.html"
