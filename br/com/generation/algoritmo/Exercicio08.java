package br.com.generation.algoritmo;

import java.util.Scanner;

public class Exercicio08 {
	/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/
	
	public static void main(String[] args) {
		double custoDeFabrica, custoConsumidor, impostos = 0.45, distribuidor;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Qual é o custo de fábrica do carro? Insira aqui: ");
		custoDeFabrica = leia.nextDouble();
	
		distribuidor = custoDeFabrica + (custoDeFabrica * 0.28);
		custoConsumidor = distribuidor + (distribuidor * impostos);
		
		System.out.println();
		System.out.println("O custo deste carro ao consumidor será de R$ " + custoConsumidor);
		
		leia.close();
		
	}

}
