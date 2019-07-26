package com.db1.db1start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciciosDeLista {

	public List<String> coresFavoritas() {
		List<String> coresFavoritas = new ArrayList<>();
		
		coresFavoritas.add("Azul");
		coresFavoritas.add("Vermelho");
		coresFavoritas.add("Verde");
		
		return coresFavoritas;
	}
	
	public int quantidadeDeItens() {
		List<String> listaDeItens = new ArrayList<>();
		
		listaDeItens.add("Alexandre");
		listaDeItens.add("Maiko");
		listaDeItens.add("Roberto");
		
		return listaDeItens.size();
	}
	
	public List<String> listaSemOSegundoItem(String item1, String item2, String item3) {
		List<String> listaSemOSegundoItem = new ArrayList<>();
		
		listaSemOSegundoItem.add(item1);
		listaSemOSegundoItem.add(item2);
		listaSemOSegundoItem.add(item3);
		
		listaSemOSegundoItem.remove(1);
		
		return listaSemOSegundoItem;
	}
	
	public void listaOrdenada(List<String> lista) {		
		Collections.sort(lista);
	}
	
	public List<String> removerCorDaLista(String cor1, String cor2, int indice) {
		List<String> listaDeCor = new ArrayList<>();
		
		listaDeCor.add(cor1);
		listaDeCor.add(cor2);
		
		listaDeCor.remove(indice);
		
		return listaDeCor;
	}
	
	public void listaOrdenadaDecrescente(List<String> lista) {
		Collections.sort(lista);
		Collections.reverse(lista);
	}
	
	public List<List<Integer>> separaParImpar(List<Integer> lista) {
		List<Integer> listaImpar = new ArrayList<>();
		List<Integer> listaPar = new ArrayList<>();
		List<List<Integer>> listaParImpar = new ArrayList<>();
		
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 == 0) {
				listaPar.add(lista.get(i));
			} else {
				listaImpar.add(lista.get(i));
			}
		}
		
		listaParImpar.add(listaImpar);
		listaParImpar.add(listaPar);
		
		return listaParImpar;
	}
	
	/* [REVISAR] Exercício 8 - Ver no DontPad */
    public List<List<String>> separarNomesPelaPrimeiraLetra(List<String> nomes) {
        List<List<String>> separados = new ArrayList<>();

       	for(String nome : nomes) {
           	List<String> nomePorLetra = null;
           	for (List<String> listComNomeSeparado : separados) {
               	if(listComNomeSeparado.get(0).startsWith(nome.substring(0, 1))) {
                   	nomePorLetra = listComNomeSeparado;
                   	break;
               	}
            }

           	if (nomePorLetra == null) {
               	nomePorLetra = new ArrayList<>();
               	separados.add(nomePorLetra);
            }

           	nomePorLetra.add(nome);
           	Collections.sort(nomePorLetra);
        }
       	return separados;
    }
	
	public int somaListaDeInteiros(List<Integer> lista) {
		int somaDaLista = 0;
		
		for(int i = 0; i < lista.size(); i++) {
			somaDaLista += lista.get(i);
		}
		
		return somaDaLista;
	}
	
	public double mediaListaDeDouble(List<Double> lista) {
		double mediaDaLista = 0;
		
		for(int i = 0; i < lista.size(); i++) {
			mediaDaLista += lista.get(i);
		}
		
		return mediaDaLista / lista.size();
	}
	
	public int menorValorDaLista(List<Integer> lista) {
		int menorValor = lista.get(0);
		
		for(int i = 0; i < lista.size()-1; i++) {
			if (lista.get(i+1) < menorValor) {
				menorValor = lista.get(i+1);
			} 
		}
		
		return menorValor;
	}
	
	public int maiorValorDaLista(List<Integer> lista) {
		int maiorValor = lista.get(0);
		
		for(int i = 0; i < lista.size()-1; i++) {
			if (lista.get(i+1) > maiorValor) {
				maiorValor = lista.get(i+1);
			}
		}
		
		return maiorValor;
	}
	
	public List<Integer> removeImparesDaLista(List<Integer> numeros) {
		
		List<Integer> listaSemImpares = new ArrayList<Integer>();
		
		for(Integer numero : numeros) {
			if (numero % 2 == 0) {
				listaSemImpares.add(numero);
			}
		}
		
		return listaSemImpares;
	}
	
	public List<Character> criaListaDeVogais(String texto) {
		List<Character> listaVogais = new ArrayList<>();
		
		String textoMin = texto.toLowerCase();
		
		for(int i = 0; i < textoMin.length(); i++) {
			char vogal = textoMin.charAt(i);
			if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
				listaVogais.add(vogal);
			}
		}
		
		return listaVogais;
	}
	
}
