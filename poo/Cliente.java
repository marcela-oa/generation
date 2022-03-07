package br.com.generation.poo;

public class Cliente {
		
	String nome;
	String cpf;
	int formaDePagamento;
	int opiniao;
	
	public void pagamento() {
		if (this.formaDePagamento == 1) {
			System.out.println("Seu pagamento será em dinheiro, então você terá 5% de desconto!");
		} else if (this.formaDePagamento == 2){
			System.out.println("Seu pagamento será no débito, então você terá 5% de desconto!");
		} else if (this.formaDePagamento == 3 || this.formaDePagamento == 4){
			System.out.println("Você não terá nenhum desconto com esta forma de pagamento.");
		} else {
			System.out.println("Você não inseriu uma forma de pagamento válida.");
		}
	}
	
	public void atendimento () {
		System.out.println("De acordo com a sua nota, sua opinião foi: ");
		switch (opiniao) {
		case 5:
			System.out.println("O atendimento foi execelente, não tenho nenhuma reclamação!");
			break;
		case 4: 
			System.out.println("O atendimento foi muito bom.");
			break;
		case 3:
			System.out.println("O atendimento foi bom mas pode melhorar.");
			break;
		case 2:
			System.out.println("O atendimento não foi bom.");
			break;
		case 1: 
			System.out.println("O atendiento foi ruim, precisa melhorar.");
			break;
		case 0:
			System.out.println("O atendimento foi péssimo, não tenho nenhum elogio.");
			break;
		default:
			System.out.println("Você não forneceu uma nota válida.");
			break;
		}
		
		System.out.println("Muito obrigade!");
		
	}
}
