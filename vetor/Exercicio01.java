package br.com.generation.vetor;

import java.util.Scanner;

public class Exercicio01 {
/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double[] pontuacao = new double[5];
		double maior = 0.0;
		
		for(int i = 0; i < pontuacao.length; i++) {
			System.out.print("Insira a " + (i+1) + "� pontua��o: ");
			pontuacao[i] = leia.nextDouble();
			
			if (pontuacao[i] > maior && pontuacao[i] <= 10) {
				maior = pontuacao[i];
			}
			
			if (pontuacao[i] > 10 || pontuacao[i] < 0) {
				System.out.println("Pontua��es v�lidas apenas de 0 a 10. Tente novamente");
				i--;
			}
		}
		
		System.out.println();
		System.out.println("Pontua��es: ");
		
		for(int i = 0; i < pontuacao.length; i++) {
			System.out.print(pontuacao[i] + " | ");
		}
		
		System.out.println("\nE a maior pontua��o foi: " + maior);
		
		leia.close();
	}
}
