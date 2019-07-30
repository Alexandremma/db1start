package com.db1.contacorrente.infra;

import org.junit.Assert;
import org.junit.Test;

public class VerificadoraTest {

	@Test
	public void deveRetornarExceptionQuandoValorNull() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida(null, "Valor n�o pode ser nulo");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Valor n�o pode ser nulo", mensagem);
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorVazio() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida("", "Valor n�o pode ser vazio");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Valor n�o pode ser vazio", mensagem);
	}
	
	@Test
	public void naoDeveRetornarExceptionQuandoValorValido() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida("String V�lida", null);
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals(null, mensagem);
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorNulo() {
		String mensagem = null;
		try {
			Verificadora.valorMaiorQueZero(null, "Valor sacado n�o pode ser nulo");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Valor sacado n�o pode ser nulo", mensagem);
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorZero() {
		String mensagem = null;
		try {
			Verificadora.valorMaiorQueZero(0.0, "Valor sacado deve ser maior que zero");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Valor sacado deve ser maior que zero", mensagem);
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorNegativo() {
		String mensagem = null;
		try {
			Verificadora.valorMaiorQueZero(-0.1, "Valor sacado deve ser positivo");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Valor sacado deve ser positivo", mensagem);
	}
	
	@Test
	public void naoDeveRetornarExceptionQuandoValorPositivo() {
		String mensagem = null;
		try {
			Verificadora.valorMaiorQueZero(50.0, null);
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals(null, mensagem);
	}
}
