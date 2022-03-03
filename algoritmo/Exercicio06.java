package br.com.generation.algoritmo;

import java.util.Scanner;

public class Exercicio06 {
	/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.*/
	
	public static void main(String[] args) {
		double x1, x2, y1, y2, potenciaX, potenciaY, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a coordenada X do ponto 1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Insira a coordenada Y do ponto 1: ");
		y1 = leia.nextDouble();

		System.out.println("Insira a coordenada X do ponto 2: ");
		x2 = leia.nextDouble();

		System.out.println("Insira a coordenada Y do ponto 2: ");
		y2 = leia.nextDouble();
		
		potenciaX = Math.pow((x2 - x1), 2);
		potenciaY = Math.pow((y2 - y1), 2);
		d = Math.sqrt(potenciaX + potenciaY);
		
		System.out.println("A distância entre esses dois pontos é: " + d);
		
		leia.close();

	}

}
