package br.com.generation.poo;

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Patinete p1 = new Patinete();
		
		System.out.print("Qual é a cor do seu patinete? ");
		p1.setCor(leia.next());
		
		System.out.print("Seu patinete é pequeno, medio ou grende? ");
		p1.setTamanho(leia.next());
		
		System.out.print("Qual a velocidade em km/h do seu patinete? ");
		p1.setVelocidade(leia.nextDouble());
		
		p1.rodas();
		System.out.println("Seu patinete é " + p1.getCor() + ", tem " + p1.getRodas() + " rodas e... ");
		p1.anda();
		
		leia.close();
	}
}
