package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio03 {
/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantas pessoas irão inserir a idade? Coloque aqui: ");
		int pessoas = leia.nextInt();
		int i = 1, idade, mais50 = 0, menos21 = 0;
		
		while(i <= pessoas) {
			System.out.print("Coloque a idade da " + i + "ª pessoa: ");
			idade = leia.nextInt();
			
				if(idade < 21) {
					menos21++;
				} else if (idade > 50 && idade < 99) {
					mais50++;
				} else if (idade >= 99) {
					System.out.println("Insira idades abaixo de 99 anos.");
					break;
				}
				
				i++;
		}
		
		System.out.println("Existe " + menos21 + " pessoas com menos de 21 anos e " + mais50 + " pessoas com mais de cinquenta anos.");
		
		leia.close();
	}
}
