/**
 * 
 * @author Carlos Beltrán López
 * 
 */
package CalculadoraCucumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	private double result;
	private Calculadora c;
	private String res;

	/**
	 * Crea una calculadora, es el estado inicial a todos los escenarios.
	 */
	@Given("I have a calculator")
	public void calcucreator() {
		c = new Calculadora();
	}
	
	/**
	 * Testea la suma
	 * @param a :double -- primer parámetro a sumar
	 * @param b :double -- segundo parámetro a sumar
	 */
	
	@When("I sum a={double} and b={double}")
	public void i_sum_a_and_b(Double a, Double b) {
		//result = summing.IsSumCorrect(a, b, c);
		result = c.suma(a, b);
	}
	/**
	 * Comprueba que el resultado obtenido es el mismo que el que se debería en la suma
	 * @param expectedAnswer
	 */
	
	@Then("I should get a + b = {double}")
	public void i_should_get_sum(double expectedAnswer) {
		assertEquals(expectedAnswer, result);
	}
	
	/**
	 * Testea la resta
	 * @param a
	 * @param b
	 */
	
	@When("I subtract a={double} minus b={double}")
	public void i_subtract_a_minus_b(Double a, Double b) {
		//result = summing.IsSumCorrect(a, b, c);
		result = c.resta(a, b);
	}
	
	@Then("I should get a - b = {double}")
	public void i_should_get_subtraction(double expectedAnswer) {
		assertEquals(expectedAnswer, result);
	}
	
	/**
	 * Testea la multiplicación
	 * @param a
	 * @param b
	 */
	
	@When("I multiply a={double} and b={double}")
	public void i_multiply_a_and_b(Double a, Double b) {
		//result = summing.IsSumCorrect(a, b, c);
		result = c.mult(a, b);
	}
	
	@Then("I should get a * b = {double}")
	public void i_should_get_multiplication(double expectedAnswer) {
		assertEquals(expectedAnswer, result);
	}
	
	/**
	 * TEstea la división
	 * @param a
	 * @param b
	 */
	@When("I divide a={double} and b={double}")
	public void i_divide_a_and_b(Double a, Double b) {
		//result = summing.IsSumCorrect(a, b, c);
		result = c.divide(a, b);
	}
	
	@Then("I should get {double}")
	public void i_should_get_division(double expectedAnswer) {
		assertEquals(expectedAnswer, result);
	}
	
	/**
	 * Comprueba si el programa no permite dividir entre 0
	 * @param a
	 * @param b
	 */
	
	@When("I divide {double} and {double}")
	public void i_divido(Double a, Double b) {
		res = assertThrows(ArithmeticException.class, ()->c.divide(a,b))==null ? "NO error": "error";

	}
	
	@Then("I should get {string}")
	public void i_should_get_error(String expectedAnswer) {
		assertEquals(expectedAnswer, res);
	}
	
	/**
	 * Testea el resultado del calculo de un factorial
	 * @param a
	 */
	
	@When("I ask for the factorial of {int}")
	public void i_factoreo(int a) {
		result = c.fact(a);

	}
	
	@Then("I should get fact = {int}")
	public void i_should_get_fact(int expectedAnswer) {
		assertEquals(expectedAnswer, result);
	}
	/**
	 * Comprueba que devuelve un error cuando se le pide el factorial de un numero negativo
	 * @param a
	 */
	
	@When("I ask for the factorial of a negative number: {int}")
	public void i_fact_error(int a) {
		res = assertThrows(ArithmeticException.class, ()->c.fact(a))==null ? "NO error": "imposible";

	}
	@Then("I should be warned: {string}")
	public void i_should_get_facterror(String expectedAnswer) {
		assertEquals(expectedAnswer, res);
	}
	
	/**
	 * Pregunta si tal numero es primo o no
	 * @param a
	 */
	
	@When("I ask for this number {int}")
	public void prime(int a) {
		if (c.esPrimo(a)) {
			res="True";
		}else res="False";

	}
	@Then("I should get: {string}")
	public void is_it_prime(String expectedAnswer) {
		assertEquals(expectedAnswer, res);
	}
}
