package br.com.generation.matriz;

import java.util.Scanner;

public class Exercicio02 {
/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double[][] m1 = new double[3][3];
		double somaTotal = 0.0, somaDiagonal = 0.0;
		
		System.out.println("Insira os valores da matriz abaixo");
		for(int l = 0; l < m1.length; l++) {
			for(int c = 0; c < m1[l].length; c++) {
				System.out.print("Linha " + (l+1) + " e coluna " + (c+1) + ": ");
				m1[l][c] = leia.nextDouble();
				somaTotal += m1[l][c];
				
				if (l == c) {
					somaDiagonal += m1[l][c];
				}
			}
		}
		
		System.out.println("\nA matriz é igual a: ");
		for(int l = 0; l < m1.length; l++) {
			for(int c = 0; c < m1[l].length; c++) {
				System.out.print(m1[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\nA soma dos valores da matriz é igual a: " + somaTotal);
		System.out.println("E a soma dos valores da diagonal da matriz é igual a: " + somaDiagonal);
		leia.close();
		
	}
}
