Feature: Is the multiplication correct?
  We want to check whether the multiplication is correct or not

  Scenario Outline: Comprueba la multiplicacion
    Given I have a calculator
    When I multiply a=<a> and b=<b>
    Then I should get a * b = <result>

    Examples: 
      | a                | b  | result |
      |                3 |  1 |      3 |
      |                2 |  3 |      6 |
      |                0 |  0 |      0 |
      |               -1 |  3 |     -3 |
      |                3 |  0 |      0 |
      |                0 |  1 |      0 |
      |               -2 | -4 |      8 |