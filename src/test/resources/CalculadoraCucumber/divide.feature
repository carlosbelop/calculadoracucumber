Feature: Is the division correct?
  We want to check whether the division is correct or not

  Scenario Outline: Comprueba la division
    Given I have a calculator
    When I divide a=<a> and b=<b>
    Then I should get <result>

    Examples: 
      | a  | b  | result |
      |  3 | -1 |     -3 |
      | 16 |  4 |      4 |
      | -3 |  3 |     -1 |
      |  0 |  3 |      0 |
      |  9 |  1 |      9 |
      | -4 | -2 |      2 |

  Scenario: No se puede dividir entre 0
    Given I have a calculator
    When I divide 5 and 0
    Then I should get "error"
