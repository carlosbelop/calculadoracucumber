Feature: Is the subtraction correct?
  We want to check whether the subtraction is correct or not

  Scenario Outline: Comprueba la resta
    Given I have a calculator
    When I subtract a=<a> minus b=<b>
    Then I should get a - b = <result>

    Examples: 
      | a  | b | result |
      |  3 | 1 |      2 |
      |  2 | 3 |     -1 |
      |  0 | 0 |      0 |
      | -1 | 3 |     -4 |
      |  3 | 0 |      3 |
      |  0 | 1 |     -1 |
