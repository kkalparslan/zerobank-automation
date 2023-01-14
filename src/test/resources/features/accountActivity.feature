Feature: Account Activity


  Scenario: User should be able to see Account Activity

    Given The user should be able to login
    When The user should be sign in
    And The user should be able to input valid credantials
    And The user should be navigate new url "http://zero.webappsecurity.com/bank/account-summary.html"
    And The user should navigate to "Account Activity"
    And The user should see the "Savings" as default type
    And The user should be see the following Accounts

      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

    And The user should be see the following options
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |