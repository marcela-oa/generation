package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio02 {
//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	public static void main(String[] args) {

		double num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero inteiro: ");
		num1 = leia.nextDouble();
		
		System.out.println("Insira o segundo n�mero inteiro: ");
		num2 = leia.nextDouble();
		
		System.out.println("Insira o terceiro n�mero inteiro: ");
		num3 = leia.nextDouble();
		
		System.out.println("O n�meros em ordem crescente ser�o: ");
		
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
