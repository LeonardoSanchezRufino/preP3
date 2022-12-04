package view;

import controller.OrdenacaoController;

public class Main {

	public static void main(String[] args) {

		int[] vetor = new int[1000];
		int tamanhoVetor = vetor.length;

		for (int i = 0; i < tamanhoVetor; i++) {

			vetor[i] = (int) ((Math.random() * 1001) + 1);
		}

		
		for (int valor = 1; valor < 3; valor++) {

			Thread thread = new OrdenacaoController(vetor, valor);
			thread.start();
		}

	}
}