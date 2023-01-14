Feature: Negative Login Test

  @negativeLogin
  Scenario Outline:
    Given The user should be able to login
    When The user should be sign in
    And The user should be able to invalid "<userName>" and "<passWord>"
    Then The warning message contains "<message>"

    Examples:
      | userName      | passWord      | message                          |
      | username      | wrongPassword | Login and/or password are wrong. |
      | wrongUsername | password      | Login and/or password are wrong. |
      |               | password      | Login and/or password are wrong. |
      | username      |               | Login and/or password are wrong. |
      |               |               | Login and/or password are wrong. |


