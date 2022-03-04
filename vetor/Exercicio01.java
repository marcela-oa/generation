package br.com.generation.vetor;

import java.util.Scanner;

public class Exercicio01 {
/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double[] pontuacao = new double[5];
		double maior = 0.0;
		
		for(int i = 0; i < pontuacao.length; i++) {
			System.out.print("Insira a " + (i+1) + "ª pontuação: ");
			pontuacao[i] = leia.nextDouble();
			
			if (pontuacao[i] > maior && pontuacao[i] <= 10) {
				maior = pontuacao[i];
			}
			
			if (pontuacao[i] > 10 || pontuacao[i] < 0) {
				System.out.println("Pontuações válidas apenas de 0 a 10. Tente novamente");
				i--;
			}
		}
		
		System.out.println();
		System.out.println("Pontuações: ");
		
		for(int i = 0; i < pontuacao.length; i++) {
			System.out.print(pontuacao[i] + " | ");
		}
		
		System.out.println("\nE a maior pontuação foi: " + maior);
		
		leia.close();
	}
}
