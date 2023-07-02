@Login
  Feature: login
  as a user i want to login website sauce demo

    Scenario Outline: Login
      #Precondition
      Given User already on login page

      #Step
      When User input "<userName>" as username and input "<password>" as password
      Then User see "<errorText>" as error text on login page
      Examples:
        | userName      | password  | errorText                                                                 |
        | standard_user |           | Epic sadface: Password is required                                        |
        |               | 124354345 | Epic sadface: Username is required                                        |
        |               |           | Epic sadface: Username is required                                        |
        | logintest     | loginpass | Epic sadface: Username and password do not match any user in this service |