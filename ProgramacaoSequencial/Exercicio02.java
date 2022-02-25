package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio02 {
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

	public static void main(String[] args) {
		int dias, meses, anos, idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade em dias: ");
		idade = leia.nextInt();
		
		anos = idade/365;
		meses = (idade % 365)/30;
		dias = (idade % 365) % 30;
		
		System.out.println();
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de idade.");
		
		leia.close();
		
	}
}
