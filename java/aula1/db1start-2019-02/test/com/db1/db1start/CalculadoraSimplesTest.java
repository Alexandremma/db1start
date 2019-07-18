package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;


public class CalculadoraSimplesTest {
	
	@Test
	public void deveSomarDoisValores() {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		int soma = calculadoraSimples.somar(10, 15);
		Assert.assertEquals(25, soma);
	}
}
