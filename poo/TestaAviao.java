package br.com.generation.poo;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Aviao a1 = new Aviao();
		
		System.out.print("Qual � o modelo do avi�o? ");
		a1.setModelo(leia.next());
		
		System.out.print("Este avi�o � particular, comercial ou militar? ");
		a1.setTipo(leia.next());
		
		System.out.print("Qual velocidade em km est� o avi�o? ");
		a1.setVelocidade(leia.nextDouble());
		
		System.out.println();
		System.out.println("Modelo: " + a1.getModelo());
		a1.voa();
		a1.cargaMaxima();
		
		leia.close();
	}
}
