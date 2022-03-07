package br.com.generation.poo;

public class Cliente {
		
	String nome;
	String cpf;
	int formaDePagamento;
	int opiniao;
	
	public void pagamento() {
		if (this.formaDePagamento == 1) {
			System.out.println("Seu pagamento ser� em dinheiro, ent�o voc� ter� 5% de desconto!");
		} else if (this.formaDePagamento == 2){
			System.out.println("Seu pagamento ser� no d�bito, ent�o voc� ter� 5% de desconto!");
		} else if (this.formaDePagamento == 3 || this.formaDePagamento == 4){
			System.out.println("Voc� n�o ter� nenhum desconto com esta forma de pagamento.");
		} else {
			System.out.println("Voc� n�o inseriu uma forma de pagamento v�lida.");
		}
	}
	
	public void atendimento () {
		System.out.println("De acordo com a sua nota, sua opini�o foi: ");
		switch (opiniao) {
		case 5:
			System.out.println("O atendimento foi execelente, n�o tenho nenhuma reclama��o!");
			break;
		case 4: 
			System.out.println("O atendimento foi muito bom.");
			break;
		case 3:
			System.out.println("O atendimento foi bom mas pode melhorar.");
			break;
		case 2:
			System.out.println("O atendimento n�o foi bom.");
			break;
		case 1: 
			System.out.println("O atendiento foi ruim, precisa melhorar.");
			break;
		case 0:
			System.out.println("O atendimento foi p�ssimo, n�o tenho nenhum elogio.");
			break;
		default:
			System.out.println("Voc� n�o forneceu uma nota v�lida.");
			break;
		}
		
		System.out.println("Muito obrigade!");
		
	}
}
