Feature: Account Summary


  Scenario: User should be able to see different Account Types
    Given The user should be able to login
    When The user should be sign in
    And The user should be able to input valid credantials
    And The user should be navigate new url "http://zero.webappsecurity.com/bank/account-summary.html"
    And The "Zero - Account Summary" page should be displayed
    Then The user should see different Account Types

      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

    And Credit Account table should have following columns

      | Account     |
      | Credit Card |
      | Balance     |