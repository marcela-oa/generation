package br.com.generation.algoritmo;

import java.util.Scanner;

public class Exercicio05 {
	/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
	
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5));
		
		System.out.println();
		System.out.println("A média ponderada será de: " + media);
		
		leia.close();
		
		
	}

}
