package br.com.generation.poo;

import java.util.Scanner;

public class TestaEletronico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Eletronico aparelho = new Eletronico();
		
		System.out.print("Qual aparelho voc� possui? ");
		aparelho.setTipo(leia.next());
		
		System.out.print("Qual a porcentagem de bateria? ");
		aparelho.setBateria(leia.nextInt());
		
		System.out.print("Quantas horas voc� vai deixar ele carregando? ");
		aparelho.setHorasCarregando(leia.nextDouble());
		
		System.out.println();
		System.out.println(aparelho.getTipo());
		System.out.println("Informa��es do seu eletr�nico: ");
		System.out.println("Est� com " + aparelho.getBateria() + "% de bateria.");
		System.out.println("Ap�s carregar por " + aparelho.getHorasCarregando() + " horas, ter� uma carga de: ");
		aparelho.carregaBateria();
		
		System.out.println();
		System.out.print("Por quantas horas voc� deseja us�-lo depois de carregar? ");
		aparelho.setHorasDeUso(leia.nextDouble());
		
		System.out.println("Ap�s essas horas de uso, voc� ter� uma carga de: ");
		aparelho.gastaBateria();
		
		leia.close();
		
		
	}

}
