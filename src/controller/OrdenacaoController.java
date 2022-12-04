package controller;

import br.com.leandrocolevati.merge.OrdenacaoMerge;
import br.com.leandrocolevati.quick.OrdenacaoQuick;

public class OrdenacaoController extends Thread {

	private int valor;
	private int[] vetor;

	public OrdenacaoController(int[] vetor, int valor) {
		this.valor = valor;
		this.vetor = vetor;
	}

	public void run() {

		threadVetor(vetor, valor);
	}

	private void threadVetor(int[] vetor, int valor) {

		if (valor == 1) {

			double inicio = System.nanoTime();

			OrdenacaoQuick quick = new OrdenacaoQuick();
			int[] vetorOrdenado = quick.quickSort(vetor, 0, vetor.length - 1);

			double fim = System.nanoTime();
			double tempo = (fim - inicio) / Math.pow(10, 9);

			System.out.println("\nTempo para ordenar o vetor com QuickSort: " + tempo + "\n");
		}

		if (valor == 2) {

			double inicio = System.nanoTime();

			OrdenacaoMerge merge = new OrdenacaoMerge();

			int[] vetorOrdenadoMerge = merge.mergeSort(vetor, 0, vetor.length - 1);

			double fim = System.nanoTime();
			double tempo = (fim - inicio) / Math.pow(10, 9);
			System.out.println("\nTempo para ordenar o vetor com MergeSort: " + tempo + "\n");
		}
	}

}
