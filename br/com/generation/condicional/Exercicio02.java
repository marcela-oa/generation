package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio02 {
//2- Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {

		double num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número inteiro: ");
		num1 = leia.nextDouble();
		
		System.out.println("Insira o segundo número inteiro: ");
		num2 = leia.nextDouble();
		
		System.out.println("Insira o terceiro número inteiro: ");
		num3 = leia.nextDouble();
		
		System.out.println("O números em ordem crescente serão: ");
		
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1);
			if (num2 < num3) {
				System.out.println(num2);
				System.out.println(num3);
			} else { 
				System.out.println(num3);
				System.out.println(num2);
			}
		} else if (num2 < num1 && num2 < num3) {
			System.out.println(num2);
			if (num1 < num3) {
				System.out.println(num1);
				System.out.println(num3);
			} else { 
				System.out.println(num3);
				System.out.println(num1);
			}
		} else if (num3 < num1 && num3 < num2) {
			System.out.println(num3);
			if (num1 < num2) {
				System.out.println(num1);
				System.out.println(num2);
			} else { 
				System.out.println(num2);
				System.out.println(num1);
			}
		}
		
		leia.close();
	}
}
