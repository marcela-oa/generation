package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio03 {
/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira a idade: ");
		int idade = leia.nextInt();
		
		switch (idade) {
			case 10, 11, 12, 13, 14:
				System.out.println("Esta pessoa está na categoria Infantil.");
				break;
			case 15, 16, 17:
				System.out.println("Esta pessoa está na categoria Juvenil.");
				break;
			case 18, 19, 20, 21, 22, 23, 24, 25:
				System.out.println("Esta pessoa está na categoria Adulto.");
				break;
			default: 
				System.out.println("Esta pessoa não está em nenhuma categoria.");
				break;
		}
		
		leia.close();
		
	}
}
