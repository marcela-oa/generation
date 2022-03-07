package br.com.generation.poo;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Cliente c1 = new Cliente();
		
		System.out.print("Qual é seu nome? ");
		c1.nome = leia.next();
		
		System.out.print("Insira seu CPF: ");
		c1.cpf = leia.next();
		
		System.out.println("Insira a sua forma de pagamento, sendo: \n1 - Dinheiro \n2 - Débito \n3 - Crédito \n4 - Outro");
		c1.formaDePagamento = leia.nextInt();
		
		System.out.print("De uma nota de 0 a 5 para o atendimento: ");
		c1.opiniao = leia.nextInt();
		
		System.out.println();
		System.out.println("Nome: " + c1.nome);
		System.out.println("CPF: " + c1.cpf);
		c1.pagamento();
		c1.atendimento();
		
		leia.close();
	}

}
