package com.db1.contacorrente;

import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteTest {
	
	@Test
	public void deveRetornarErroQuandoInformadoAgenciaInvalida() {
		String mensagem = null;
		
		try {
			ContaCorrente contaCorrente = new ContaCorrente(null,  "00009876",  "Maiko Cunha");
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertNotNull(mensagem);
		Assert.assertEquals("Deve ser informada uma agência válida", mensagem);
	}
	
	@Test
	public void deveRetornarErroQuandoInformadoNumeroInvalida() {
		String mensagem = null;
		
		try {
			ContaCorrente contaCorrente = new ContaCorrente("0465",  null,  "Maiko Cunha");
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertNotNull(mensagem);
		Assert.assertEquals("Deve ser informada um número de conta válido", mensagem);
	}
	
	@Test
	public void deveRetornarErroQuandoInformadoClienteInvalido() {
		String mensagem = null;
		
		try {
			ContaCorrente contaCorrente = new ContaCorrente("0465",  "000099999999",  null);
		}catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertNotNull(mensagem);
		Assert.assertEquals("Deve ser informada um cliente válido", mensagem);
	}
	
	@Test
	public void deveCriarContaCorrenteComValoresValidos() {
		ContaCorrente contaCorrente = new ContaCorrente("0465", "000097564", "Maiko Cunha");
		
		Assert.assertEquals("0465", contaCorrente.getAgencia());
		Assert.assertEquals("000097564", contaCorrente.getNumero());
		Assert.assertEquals("Maiko Cunha", contaCorrente.getCliente());
		Assert.assertEquals(0.0, contaCorrente.getSaldo(), 0.0001);
		Assert.assertEquals(0, contaCorrente.getHistorico().size());
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorDepositadoInvalido() {
		ContaCorrente contaCorrente = new ContaCorrente("0465", "00009992", "Nome Cliente");
		String mensagem = null;
		try {
			contaCorrente.depositar(-0.01);
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Valor a ser depositado deve ser maior que zero", mensagem);
		Assert.assertEquals(0.0, contaCorrente.getSaldo(), 0.0001);
		Assert.assertEquals(0, contaCorrente.getHistorico().size());
	}
	
	@Test
	public void deveDepositarValor() {
		ContaCorrente contaCorrente = new ContaCorrente("0465", "00009992", "Nome Cliente");
		contaCorrente.depositar(100.0);
		
		Assert.assertEquals(100.0, contaCorrente.getSaldo(), 0.0001);
		Assert.assertEquals("Depositado: R$100.0", contaCorrente.getHistorico().get(0));
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorSacadoNull() {
		ContaCorrente contaCorrente = new ContaCorrente("0465", "00009992", "Nome Cliente");
		String mensagem = null;
		try {
			contaCorrente.depositar(100.0);
			contaCorrente.sacar(null);
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Valor a ser sacado deve ser maior que zero", mensagem);
		Assert.assertEquals(100.0, contaCorrente.getSaldo(), 0.0);
		Assert.assertEquals(1, contaCorrente.getHistorico().size());
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorSacadoZero() {
		ContaCorrente contaCorrente = new ContaCorrente("0465", "00009992", "Nome Cliente");
		String mensagem = null;
		try {
			contaCorrente.depositar(100.0);
			contaCorrente.sacar(0.0);
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Valor a ser sacado deve ser maior que zero", mensagem);
		Assert.assertEquals(100.0, contaCorrente.getSaldo(), 0.0);
		Assert.assertEquals(1, contaCorrente.getHistorico().size());
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorSacadoInvalido() {
		ContaCorrente contaCorrente = new ContaCorrente("0465", "00009992", "Nome Cliente");
		String mensagem = null;
		try {
			contaCorrente.depositar(100.0);
			contaCorrente.sacar(110.0);
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals("Saldo Insuficiente", mensagem);
		Assert.assertEquals(100.0, contaCorrente.getSaldo(), 0.0);
		Assert.assertEquals(1, contaCorrente.getHistorico().size());
	}
	
	@Test
	public void deveSacarValor() {
		ContaCorrente contaCorrente = new ContaCorrente("0465", "00009992", "Nome Cliente");
		String mensagem = null;
		try {
			contaCorrente.depositar(100.0);
			contaCorrente.sacar(100.0);
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertEquals(null, mensagem);
		Assert.assertEquals(0.0, contaCorrente.getSaldo(), 0.0);
		Assert.assertEquals(2, contaCorrente.getHistorico().size());
		Assert.assertEquals("Sacado: R$100.0", contaCorrente.getHistorico().get(1));
	}
	
}