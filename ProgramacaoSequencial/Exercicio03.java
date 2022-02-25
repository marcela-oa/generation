package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio03 {
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

	public static void main(String[] args) {
		int segundos, minutos, horas, segundosRestantes;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quanto tempo durou o evento na fábrica em segundos? Insira aqui: ");
		segundos = leia.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos % 3600)/60;
		segundosRestantes = (segundos % 3600) % 60;
		
		System.out.println("O evento durou " + horas + " horas, " + minutos + " minutos e " + segundosRestantes + " segundos.");
		
		leia.close();
		
	}
}
