package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio01 {
//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		
		int num1, num2, num3, maior1, maior2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("Insira o segundo n�mero inteiro: ");
		num2 = leia.nextInt();
		
		System.out.println("Insira o terceiro n�mero inteiro: ");
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
	
		/*ou tamb�m poderia ser calculado pela biblioteca de matem�tica
		maior1 = Math.max(num1, num2);
		maior2 = Math.max(maior1, num3);*/
		
		System.out.println("O maior valor entre os n�meros inseridos � " + maior2);
		
		leia.close();
	}
}
