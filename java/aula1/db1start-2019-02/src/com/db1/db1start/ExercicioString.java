package com.db1.db1start;

public class ExercicioString {

	private String texto;
	
	public ExercicioString(String texto) {
		this.texto = texto;
	}
	
	public String deixarMaiusculo() {
		return texto.toUpperCase();
	}
	
	public String deixarMinusculo() {
		return texto.toLowerCase();
	}
	
	public int contarQuantidadeCaracteres() {
		return texto.length();
	}
	
	public int contarQuantidadeCaracteresComEspaco() {
		return texto.length();
	}
	
	public int contarQuantidadeCaracteresSemEspaco() {
		return texto.trim().length();
	}
	
	public String mostrarQuatroPrimeirasLetras() {
		return texto.substring(0, 4);
	}
	
	public String mostrarTextoPartindoDaTerceiraLetra() {
		return texto.substring(2);
	}
	
	public String mostrarQuatroUltimasLetras() {
		int quatroUltimasLetras = texto.length() - 4;
		
		return texto.substring(quatroUltimasLetras);
	}
	
	public String substituirPrimeiroNome() {
		String textoSemPrimeiroNome = texto.substring(texto.indexOf(" "));
		return ("ALUNO/ALUNA" + textoSemPrimeiroNome);
	}
	
	public String separarPalavras() {
		String[] palavrasSeparadas = texto.split(",\\s");
		return palavrasSeparadas[0] + "\n" + palavrasSeparadas[1] + "\n" + palavrasSeparadas[2];
	}
	
	public int contarVogais() {
		int contagemVogais = 0;
		
		String text = texto.toLowerCase();
		
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			
			if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
				contagemVogais++;
			}
		}
		return contagemVogais;
	}
	
	public String inverterTexto() {
		//String s = "TEXTO"; String invertida = new StringBuilder(s).reverse().toString();
		
		String textoInvertido = "";
		
		for(int i = (texto.length() - 1); i >= 0; i--) {
			textoInvertido += texto.charAt(i);
		}
		return textoInvertido;
	}
}
