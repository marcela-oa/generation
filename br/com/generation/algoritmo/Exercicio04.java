package br.com.generation.algoritmo;

import java.util.Scanner;

public class Exercicio04 {
/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a express�o*/
	public static void main(String[] args) {
		double a, b, c, d, r, s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("Escolha o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("Escolha o terceiro n�mero: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r +s)/2;
		
		
		System.out.println("O resultado da express�o �: " + d);
		
		leia.close();
		
	}
}
