package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio02 {
/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double numero;
		int par = 0, impar = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira um número: ");
			numero = leia.nextDouble();
			
				if ((numero % 2) == 0) {
					par++;
				} else {
					impar++;
				}
		}
		
		System.out.println("Você inseriu " + par + " números pares e " + impar + " números ímpares.");
		
		leia.close();
	}
}
