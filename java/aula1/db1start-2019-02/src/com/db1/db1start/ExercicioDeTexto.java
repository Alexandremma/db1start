package com.db1.db1start;

public class ExercicioDeTexto {
	
	public static void main(String[] args) {
		String textoMaiusculo = Maiusculo.mudaParaMaiusculo("texto deve aparecer em maiusculo");
		System.out.println(textoMaiusculo);
		
		String textoMinusculo = Minusculo.mudaParaMinusculo("TEXTO DEVE APARECER EM MINUSCULO");
		System.out.println(textoMinusculo);
	}
	
}
