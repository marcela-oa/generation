package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio06 {
/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0, i = 0;
		double media = 0;
		
		System.out.println("Entre apenas com n�meros inteiros e caso deseje sair, insira o 0.");
		System.out.println();
		
		do {
			System.out.print("Insira um n�mero: ");
			numero = leia.nextInt();
			
			if ((numero % 3) == 0 && numero != 0) {
				soma += numero;
				i++;
			}
		} while (numero != 0);
		
		
		media = (soma/i);
		System.out.println("\nVoc� inseriu " + i + " n�meros m�ltiplos de 3. "
				+ "\nA m�dia desses n�meros �: " + media);
		leia.close();
	}
}
