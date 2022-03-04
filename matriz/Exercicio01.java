package br.com.generation.matriz;

import java.util.Scanner;

public class Exercicio01 {
/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
	
	public static void main(String[] args) {
		
		double[][] n1 = new double[4][6];
		double[][] n2 = new double[4][6];
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira os valores da primeira matriz");
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.print("Matriz 1, linha " + (l+1) + " e coluna " + (c+1) + ": ");
				n1[l][c] = leia.nextDouble();
			}
		}
		
		System.out.println("\nInsira os valores da segunda matriz");
		for(int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				System.out.print("Matriz 2, linha " + (l+1) + " e coluna " + (c+1) + ": ");
				n2[l][c] = leia.nextDouble();
			}
		}
		
		System.out.println("\nA primeira matriz: ");
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.print(n1[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\nA segunda matriz: ");
		for(int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				System.out.print(n2[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\nA matriz resultante das somas: ");
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.print((n1[l][c] + n2[l][c]) + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\nA matriz resultante das diferencas: ");
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.print((n1[l][c] - n2[l][c]) + " | ");
			}
			System.out.println();
		}
		
		leia.close();
		
	}
}
