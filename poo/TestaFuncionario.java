package br.com.generation.poo;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Funcionario f1 = new Funcionario();
		
		System.out.print("Insira seu nome: ");
		f1.setNome(leia.next());
		
		System.out.println("\nBem vinde, " + f1.getNome() + "!");
		f1.setCargo("Recepcionista");
		System.out.println("Cargo: " + f1.getCargo());
		f1.setSalario(2000.0);
		System.out.println("Seu salário é R$" + f1.getSalario());
		
		System.out.print("\nQuantas horas extras você trabalhou? ");
		f1.setHorasExtra(leia.nextInt());
		
		System.out.println("Seu salário total com as horas extras é: R$" + f1.valorHoraExtra());
		
		leia.close();
	}
}
