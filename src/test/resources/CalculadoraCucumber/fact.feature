Feature: Is the factorial correct?
  We want to check whether the fact method is correct or not

  Scenario Outline: Comprueba el factorial
    Given I have a calculator
    When I ask for the factorial of <a>
    Then I should get fact = <result>

    Examples: 
      | a | result |
      | 3 |      6 |
      | 2 |      2 |
      | 0 |      1 |
      | 5 |    120 |
      | 1 |      1 |

  Scenario: Comprueba que no hay factoriales de numeros negativos
    Given I have a calculator
    When I ask for the factorial of a negative number: -6
    Then I should be warned: "imposible"
