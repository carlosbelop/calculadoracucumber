Feature: Is the sum correct?
  We want to check whether the sum method is correct or not

  Scenario Outline: Comprueba la suma
    Given I have a calculator
    When I sum a=<a> and b=<b>
    Then I should get a + b = <result>

    Examples: 
      | a  | b | result |
      |  3 | 1 |      4 |
      |  2 | 3 |      5 |
      |  0 | 0 |      0 |
      | -1 | 3 |      2 |
      |  3 | 0 |      3 |
      |  2 | 3 |      5 |
      |  3 | 1 |      4 |
      |  2 | 3 |      5 |
