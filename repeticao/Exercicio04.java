package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio04 {
/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 O número de pessoas calmas;
 O número de mulheres nervosas;
 O número de homens agressivos;
 O número de outros calmos;
 O número de pessoas nervosas com mais de 40 anos;
 O número de pessoas calmas com menos de 18 anos.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade, sexo, temperamento, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, 
				nervosos40 = 0, calmos18 = 0, total = 150, i = 1;
		
		while (i <= total) {
			System.out.print("Insira a idade da pessoa " + i + ": ");
			idade = leia.nextInt();
			
			System.out.println("Insira o sexo da pessoa sendo: \n1 - feminino\n2 - masculino\n3 - outros");
			sexo = leia.nextInt();
			
			System.out.println("Qual o temperamento dessa pessoas? \n1 - calma\n2 - nervosa\n3 - agressiva");
			temperamento = leia.nextInt();
			
			if (temperamento == 1) {
				pessoasCalmas++;
				
				if (sexo == 3) {
					outrosCalmos++;
				}
				
				if (idade < 18) {
					calmos18++;
				}
			}
			
			if (temperamento == 2) {
				if (sexo == 1) {
					mulheresNervosas++;
				}
				
				if (idade > 40) {
					nervosos40++;
				}
			}
			
			if (temperamento == 3) {
				if (sexo == 2) {
					homensAgressivos++;
				}
			}
			
			i++;
		}
		
		System.out.println("O número de pessoas calmas é: " + pessoasCalmas
				+ "\nO número de mulheres nervosas é: " + mulheresNervosas
				+ "\nO número de homens agressivos é: " + homensAgressivos
				+ "\nO número de outros calmos é: " + outrosCalmos
				+ "\nO número de pessoas nervosas com mais de 40 anos é: " + nervosos40 
				+ "\nE o número de pessoas calmas com menos de 18 anos é: " + calmos18);
		leia.close();
	}
}
