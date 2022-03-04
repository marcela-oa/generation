package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio05 {
/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		int numero, soma = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Advinhe o número: ");
			numero = leia.nextInt();
			soma += numero;
			
		} while (numero != 0);
		
		System.out.println("Parabéns! Você acertou, o número era o 0.");
		System.out.println("A soma de todos os valores que você chutou foi de: " + soma);
		
		leia.close();
	}
}
