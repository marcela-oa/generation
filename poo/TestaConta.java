package br.com.generation.poo;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Conta conta1 = new Conta();
		
		System.out.print("Quem � o titular da conta? ");
		conta1.setTitular(leia.next());
		
		conta1.setAgencia(1);
		conta1.setConta(12345);
		
		System.out.println();
		System.out.println("Titular: " + conta1.getTitular());
		System.out.println("Ag�ncia: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getConta());
		System.out.println("Saldo: R$" + conta1.getSaldo());
		
		System.out.println("\nQuanto voc� deseja depositar? ");
		conta1.deposita(leia.nextDouble());
		
		System.out.println("\nSaldo atual: R$" + conta1.getSaldo());
		
		System.out.println("\nQuanto voc� deseja sacar? ");
		conta1.saca(leia.nextDouble());
		
		System.out.println("\nSaldo atual: R$" + conta1.getSaldo());
		
		leia.close();

	}
}
