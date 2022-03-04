package br.com.generation.vetor;

import java.util.Random;

public class Exercicio02 {
/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
	
	public static void main(String[] args) throws InterruptedException {
		
		Random aleatorio = new Random();
		int[] dado = new int[10];
		double soma = 0.0, media = 0.0;
		int maior = 0, c = 0;
		
		System.out.println("Rolando o dado: ");
		for (int i = 0; i < 10; i++) {
			dado[i] = aleatorio.nextInt((6 - 1) + 1) + 1;
			soma += dado[i];
			System.out.println(dado[i]);
			Thread.sleep(500);
			
			if (dado[i] > maior) {
				maior = dado[i];
				c = 1;
			} else if (dado[i] == maior) {
				c++;
			}
		}
		
		media = soma / 10;
				
		System.out.println("O resultado dos lançamentos foi: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(dado[i] + " | ");
		}
		
		System.out.println("\nA média dos lançamentos foi de: " + media);
		System.out.println("E maior valor rolado foi " + maior + ", que apareceu " + c + " vezes.");
		
		
	}
}
