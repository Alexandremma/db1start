package com.db1.db1start;

import java.util.List;

public class App {

	public static void main(String[] args) {
		int tamanhoDoNome = Nome.quantidadeDeCaracteres("Alexandre");
		System.out.println(tamanhoDoNome);
		
		Calculadora calculadora = new Calculadora(10, 15);
				
		System.out.println(calculadora.somar());
		
		String texto = "banana, maçã, melancia";
		
		//String textoSemEspaco = texto.trim();
		String[] palavrasSeparadas = texto.split(",\\s");
		System.out.println(palavrasSeparadas[0] + "\n" + palavrasSeparadas[1] + "\n" + palavrasSeparadas[2]);
	
		List<Integer> listaSemImpar = List.of(1, 2, 3, 4, 5);
		
		ExerciciosDeLista exerciciosDeLista = new ExerciciosDeLista();
		exerciciosDeLista.removeImparesDaLista(listaSemImpar);
	}
	
}
