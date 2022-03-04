package br.com.generation.vetor;

import java.util.Random;

public class Exercicio02 {
/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
	
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
				
		System.out.println("O resultado dos lan�amentos foi: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(dado[i] + " | ");
		}
		
		System.out.println("\nA m�dia dos lan�amentos foi de: " + media);
		System.out.println("E maior valor rolado foi " + maior + ", que apareceu " + c + " vezes.");
		
		
	}
}
