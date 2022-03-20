Feature: Is this a prime number?
  We want to check if this is a prime number

  Scenario Outline: Comprueba si es primo
    Given I have a calculator
    When I ask for this number <a>
    Then I should get: <result>

    Examples: 
      | a  | result |
      |  3 | "True"   |
      |  2 | "True"   |
      |  0 | "False"  |
      |  5 | "True"   |
      | 16 | "False"  |
