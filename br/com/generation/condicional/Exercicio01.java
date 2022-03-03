package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio01 {
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		
		int num1, num2, num3, maior1, maior2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("Insira o segundo número inteiro: ");
		num2 = leia.nextInt();
		
		System.out.println("Insira o terceiro número inteiro: ");
		num3 = leia.nextInt();
		
		
		if (num1 > num2) {
			maior1 = num1;
		} else {
			maior1 = num2;
		}
		
		if (maior1 > num3) {
			maior2 = maior1;
		} else {
			maior2 = num3;
		}
	
		/*ou também poderia ser calculado pela biblioteca de matemática
		maior1 = Math.max(num1, num2);
		maior2 = Math.max(maior1, num3);*/
		
		System.out.println("O maior valor entre os números inseridos é " + maior2);
		
		leia.close();
	}
}
