package com.db1.db1start;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
	
	//private Calculadora calculadora;
	
	//@Before
	//public void setUp() {
	//	calculadora = new Calculadora(12, 13);
	//}
	
	@Test
	public void deveSomarDoisValores() {
		Calculadora calculadora = new Calculadora(12, 13);
		int soma = calculadora.somar();
		assertEquals(25,soma);
	}
	
	@Test
	public void deveSubtrairDoisValores() {
		Calculadora calculadora = new Calculadora(10, 7);
		int subtracao = calculadora.subtrair();
		assertEquals(3, subtracao);
	}
	
	@Test
	public void deveMultiplicararDoisValores() {
		Calculadora calculadora = new Calculadora(2, 4);
		int multiplica = calculadora.multiplicar();
		assertEquals(8, multiplica);
	}
	
	@Test
	public void deveDividirDoisValores() {
		Calculadora calculadora = new Calculadora(10, 2);
		int divide = calculadora.dividir();
		assertEquals(5, divide);
	}
	
	@Test
	public void deveVerificarMaiorValor() {
		Calculadora calculadora = new Calculadora(10, 5);
		int verificaMaior = calculadora.verificarMaior();
		assertEquals(10, verificaMaior);
	}
}






