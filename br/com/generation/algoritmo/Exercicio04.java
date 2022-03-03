package br.com.generation.algoritmo;

import java.util.Scanner;

public class Exercicio04 {
/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a expressão*/
	public static void main(String[] args) {
		double a, b, c, d, r, s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha o primeiro número: ");
		a = leia.nextInt();
		
		System.out.println("Escolha o segundo número: ");
		b = leia.nextInt();
		
		System.out.println("Escolha o terceiro número: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r +s)/2;
		
		
		System.out.println("O resultado da expressão é: " + d);
		
		leia.close();
		
	}
}
