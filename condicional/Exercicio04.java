package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio04 {
/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
	
	public static void main(String[] args) {
		
		double raiz, quadrado;
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira um n�mero: ");
		double num = leia.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("O seu n�mero � par!");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada do seu n�mero �: " + raiz);
		} else {
			System.out.println("O seu n�mero � �mpar!");
			quadrado = Math.pow(num, 2);
			System.out.println("O seu n�mero elevado ao quadrado �: " + quadrado);
		}
		
		leia.close();
	}
}
