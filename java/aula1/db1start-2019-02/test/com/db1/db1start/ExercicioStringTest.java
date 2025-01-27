package com.db1.db1start;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExercicioStringTest {
	
	@Test
	public void deveDeixarMaiusculo() {
		ExercicioString exercicioString = new ExercicioString("db1start");
		String textoMaiusculo = exercicioString.deixarMaiusculo();
		assertEquals("DB1START", textoMaiusculo);
	}
	
	@Test
	public void deveDeixarMinusculo() {
		ExercicioString exercicioString = new ExercicioString("DB1START");
		String textoMinusculo = exercicioString.deixarMinusculo();
		assertEquals("db1start", textoMinusculo);
	}
	
	@Test
	public void deveContarQuantidadeCaracteres() {
		ExercicioString exercicioString = new ExercicioString("DB1Start");
		int quantidadeCaracteres = exercicioString.contarQuantidadeCaracteres();
		assertEquals(8, quantidadeCaracteres);
	}
	
	@Test
	public void deveContarQuantidadeCaracteresComEspaco() {
		ExercicioString exercicioString = new ExercicioString(" DB1Start ");
		int quantidadeCaracteresComEspaco = exercicioString.contarQuantidadeCaracteres();
		assertEquals(10, quantidadeCaracteresComEspaco);
	}
	
	@Test
	public void deveContarQuantidadeCaracteresSemEspaco() {
		ExercicioString exercicioString = new ExercicioString(" DB1Start ");
		int quantidadeCaracteresSemEspaco = exercicioString.contarQuantidadeCaracteresSemEspaco();
		assertEquals(8, quantidadeCaracteresSemEspaco);
	}
	
	@Test
	public void deveMostrarQuatroPrimeirasLetras() {
		ExercicioString exercicioString = new ExercicioString("Alexandre Martins Maciel");
		String quatroPrimeirasLetras = exercicioString.mostrarQuatroPrimeirasLetras();
		assertEquals("Alex", quatroPrimeirasLetras);
	}
	
	@Test
	public void deveMostrarTextoPartindoDaTerceiraLetra() {
		ExercicioString exercicioString = new ExercicioString("Alexandre Martins Maciel");
		String textoPartindoDaTerceiraLetra = exercicioString.mostrarTextoPartindoDaTerceiraLetra();
		assertEquals("exandre Martins Maciel", textoPartindoDaTerceiraLetra);
	}
	
	@Test
	public void deveMostrarQuatroUltimasLetras() {
		ExercicioString exercicioString = new ExercicioString("Alexandre Martins Maciel");
		String quatroUltimasLetras = exercicioString.mostrarQuatroUltimasLetras();
		assertEquals("ciel", quatroUltimasLetras);
	}
	
	@Test
	public void deveSubstituirPrimeiroNome() {
		ExercicioString exercicioString = new ExercicioString("Alexandre Martins Maciel");
		String semPrimeiroNome = exercicioString.substituirPrimeiroNome();
		assertEquals("ALUNO/ALUNA Martins Maciel", semPrimeiroNome);
	}
	
	@Test
	public void deveSepararPalavras() {
		ExercicioString exercicioString = new ExercicioString("banana, ma��, melancia");
		String palavrasSeparadas = exercicioString.separarPalavras();
		String textoSeparado = "banana" + "\n" + "ma��" + "\n" + "melancia";
		assertEquals(textoSeparado, palavrasSeparadas);
	}

	@Test
	public void deveContarVogais() {
		ExercicioString exercicioString = new ExercicioString("Contar Vogais");
		int numeroVogais = exercicioString.contarVogais();
		assertEquals(5, numeroVogais);
	}
	
	@Test
	public void deveInverterTexto() {
		ExercicioString exercicioString = new ExercicioString("Texto Invertido");
		String textoInvertido = exercicioString.inverterTexto();
		assertEquals("oditrevnI otxeT", textoInvertido);
	}
}
