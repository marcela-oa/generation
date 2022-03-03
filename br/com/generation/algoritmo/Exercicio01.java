package br.com.generation.algoritmo;

import java.util.Scanner;

public class Exercicio01 {
	
	/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.*/
	
	public static void main(String[] args) {
		int anos, meses, dia, idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com os anos da sua idade: ");
		anos = leia.nextInt();
		
		System.out.println("Entre com os meses da sua idade: ");
		meses = leia.nextInt();
		
		System.out.println("Entre com os dias da sua idade: ");
		dia = leia.nextInt();
		
		idade = (anos * 365) + (meses * 30) + dia;
		
		System.out.println();
		System.out.println("Você tem " + idade + " dias de idade");
		
		leia.close();
	}
}
