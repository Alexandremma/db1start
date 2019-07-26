package com.db1.db1start;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExerciciosDeListaTest {

	@Test
	public void deveRetornarCoresFavoritas() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<String> coresFavoritas = exerciciosDeLista.coresFavoritas();
		
		assertEquals(3, coresFavoritas.size());
		assertTrue(coresFavoritas.contains("Azul"));
		assertTrue(coresFavoritas.contains("Verde"));
		assertTrue(coresFavoritas.contains("Vermelho"));
	}
	
	@Test
	public void deveRetornarQuantidadeDeItens() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		int quantidadeDeItens = exerciciosDeLista.quantidadeDeItens();
		
		assertEquals(3, quantidadeDeItens);
	}
	
	@Test
	public void deveRemoverSegundoItem() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<String> listaSemOSegundoItem = exerciciosDeLista.listaSemOSegundoItem("Alexandre", "Maiko", "Roberto");
		
		assertEquals(2, listaSemOSegundoItem.size());
		assertTrue(listaSemOSegundoItem.contains("Alexandre"));
		assertTrue(listaSemOSegundoItem.contains("Roberto"));
		assertFalse(listaSemOSegundoItem.contains("Maiko"));
	}
	
	@Test
	public void deveOrdenarLista() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<String> listaOrdenada = exerciciosDeLista.coresFavoritas();
		exerciciosDeLista.listaOrdenada(listaOrdenada);
		
		assertEquals(3, listaOrdenada.size());
		assertEquals("Azul", listaOrdenada.get(0));
		assertEquals("Verde", listaOrdenada.get(1));
		assertEquals("Vermelho", listaOrdenada.get(2));
	}
	
	@Test
	public void deveRemoverCorDaLista() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<String> listaDeCor = exerciciosDeLista.removerCorDaLista("Azul", "Verde", 1);
		
		assertEquals(1, listaDeCor.size());
		assertTrue(listaDeCor.contains("Azul"));
	}
	
	@Test
	public void deveOrdenarDecrescente() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<String> listaOrdenadaDecrescente = exerciciosDeLista.coresFavoritas();
		exerciciosDeLista.listaOrdenadaDecrescente(listaOrdenadaDecrescente);
		
		assertEquals(3, listaOrdenadaDecrescente.size());
		assertEquals("Vermelho", listaOrdenadaDecrescente.get(0));
		assertEquals("Verde", listaOrdenadaDecrescente.get(1));
		assertEquals("Azul", listaOrdenadaDecrescente.get(2));
	}
	
	@Test
	public void deveSepararParImpar() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<List<Integer>> listaParImpar = exerciciosDeLista.separaParImpar(List.of(1, 2, 3, 4, 5));
	
		assertEquals(2, listaParImpar.size());
		assertEquals(List.of(1, 3, 5), listaParImpar.get(0));
		assertEquals(List.of(2, 4), listaParImpar.get(1));
	}
	
	@Test
	public void deveSepararNomesPelaPrimeiraLetra() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<List<String>> nomesSeparados = exerciciosDeLista.separarNomesPelaPrimeiraLetra(List.of("alexandre", "andre", "bianca", "bruna", "carlos", "cacau", "florentino"));
		
		assertEquals(4, nomesSeparados.size());
		assertEquals(List.of("cacau", "carlos"), nomesSeparados.get(2));
	}
	
	@Test
	public void deveSomarListaDeInteiros() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		int somaDaLista = exerciciosDeLista.somaListaDeInteiros(List.of(2, 4, 8));
		
		assertEquals(14, somaDaLista);
	}
	
	@Test
	public void deveRetornarMediaListaDeDouble() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		double mediaDaLista = exerciciosDeLista.mediaListaDeDouble(List.of(2.5, 3.5, 3.0));
	
		assertEquals(3, mediaDaLista, 0.001);
	}
	
	@Test
	public void deveRetornarMenorValorDaLista() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		int menorValor = exerciciosDeLista.menorValorDaLista(List.of(3, 4, 2, 1));
		
		assertEquals(1, menorValor);
	}
	
	@Test
	public void deveRetornarMaiorValorDaLista() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		int maiorValor = exerciciosDeLista.maiorValorDaLista(List.of(3, 4, 2, 1));
		
		assertEquals(4, maiorValor);	
	}
	
	@Test
	public void deveRemoverImparesDaLista() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<Integer> listaPar = exerciciosDeLista.removeImparesDaLista(List.of(1, 2, 3, 4, 5));
		
		assertEquals(2, listaPar.size());
		assertEquals(2, listaPar.get(0), 0);
		assertEquals(4, listaPar.get(1), 0);
	}
	
	@Test
	public void deveCriarListaDeVogais() {
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		List<Character> listaVogais = exerciciosDeLista.criaListaDeVogais("lalElilOlu");
		
		assertEquals(5, listaVogais.size());
		assertEquals('a', listaVogais.get(0), ' ');
		assertEquals('e', listaVogais.get(1), ' ');
		assertEquals('i', listaVogais.get(2), ' ');
		assertEquals('o', listaVogais.get(3), ' ');
		assertEquals('u', listaVogais.get(4), ' ');
	}
}
