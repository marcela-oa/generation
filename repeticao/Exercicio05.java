package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio05 {
/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		int numero, soma = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Advinhe o n�mero: ");
			numero = leia.nextInt();
			soma += numero;
			
		} while (numero != 0);
		
		System.out.println("Parab�ns! Voc� acertou, o n�mero era o 0.");
		System.out.println("A soma de todos os valores que voc� chutou foi de: " + soma);
		
		leia.close();
	}
}
