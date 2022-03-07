package br.com.generation.poo;

import java.util.Scanner;

public class TestaEletronico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Eletronico aparelho = new Eletronico();
		
		System.out.print("Qual aparelho você possui? ");
		aparelho.setTipo(leia.next());
		
		System.out.print("Qual a porcentagem de bateria? ");
		aparelho.setBateria(leia.nextInt());
		
		System.out.print("Quantas horas você vai deixar ele carregando? ");
		aparelho.setHorasCarregando(leia.nextDouble());
		
		System.out.println();
		System.out.println(aparelho.getTipo());
		System.out.println("Informações do seu eletrônico: ");
		System.out.println("Está com " + aparelho.getBateria() + "% de bateria.");
		System.out.println("Após carregar por " + aparelho.getHorasCarregando() + " horas, terá uma carga de: ");
		aparelho.carregaBateria();
		
		System.out.println();
		System.out.print("Por quantas horas você deseja usá-lo depois de carregar? ");
		aparelho.setHorasDeUso(leia.nextDouble());
		
		System.out.println("Após essas horas de uso, você terá uma carga de: ");
		aparelho.gastaBateria();
		
		leia.close();
		
		
	}

}
