package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio02 {
/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double numero;
		int par = 0, impar = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira um n�mero: ");
			numero = leia.nextDouble();
			
				if ((numero % 2) == 0) {
					par++;
				} else {
					impar++;
				}
		}
		
		System.out.println("Voc� inseriu " + par + " n�meros pares e " + impar + " n�meros �mpares.");
		
		leia.close();
	}
}
