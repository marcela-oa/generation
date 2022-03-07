package br.com.generation.poo;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Aviao a1 = new Aviao();
		
		System.out.print("Qual é o modelo do avião? ");
		a1.setModelo(leia.next());
		
		System.out.print("Este avião é particular, comercial ou militar? ");
		a1.setTipo(leia.next());
		
		System.out.print("Qual velocidade em km está o avião? ");
		a1.setVelocidade(leia.nextDouble());
		
		System.out.println();
		System.out.println("Modelo: " + a1.getModelo());
		a1.voa();
		a1.cargaMaxima();
		
		leia.close();
	}
}
