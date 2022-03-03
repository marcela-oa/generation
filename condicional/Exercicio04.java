package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio04 {
/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
	
	public static void main(String[] args) {
		
		double raiz, quadrado;
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira um número: ");
		double num = leia.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("O seu número é par!");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada do seu número é: " + raiz);
		} else {
			System.out.println("O seu número é ímpar!");
			quadrado = Math.pow(num, 2);
			System.out.println("O seu número elevado ao quadrado é: " + quadrado);
		}
		
		leia.close();
	}
}
