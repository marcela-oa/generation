package br.com.generation.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		List <String> roupa = new ArrayList<String>();
		
		int roda = 0;
		while (roda == 0) {
			
		System.out.println("\nVocê deseja: \n1 - Adicionar uma peça no estoque \n2 - Remover uma peça do estoque\n3 - Atualizar as peças"
				+ "\n4 - Ver as peças no estoque \n5 - Sair do estoque");
		int decisao = entrada.nextInt();
		
			switch (decisao) {
				case 1:
					System.out.print("\nQual peça de roupa você deseja adicionar? ");
					roupa.add(entrada.next());
					
					int sim = 0; 
					while (sim == 0) {
						System.out.println("\nDeseja adicionar mais alguma peça de roupa? \n1 - sim\n2 - não");
						int adicionar = entrada.nextInt();
						
						if (adicionar == 1) {
							System.out.print("\nQual peça de roupa você deseja adicionar? ");
							roupa.add(entrada.next());
						} else {
							sim = 1;
						}
					}
					break;
				case 2:
					System.out.println("\nSeu estoque possui as seguintes peças: ");
					for (String a : roupa) {
						System.out.println(a);
					}
					System.out.println("\nQual dessas peças você deseja remover do estoque?");
					roupa.remove(entrada.next());
					
					int a = 0; 
					while (a == 0) {
						System.out.println("\nDeseja remover mais alguma peça? \n1 - sim\n2 - não");
						int adicionar = entrada.nextInt();
						
						if (adicionar == 1) {
							System.out.print("\nQual peça de roupa você deseja remover? ");
							roupa.add(entrada.next());
						} else {
							a = 1;
						}
					}
					break;
				case 3:
					System.out.print("\nQual peça você deseja substituir? ");
					String produto = entrada.next();
					
					int subst = 0;
					if(roupa.contains(produto)) {
						for (int i = 0; i < roupa.size(); i++) {
							if((roupa.get(i)).equals(produto)) {
								System.out.print("\nPor qual nova peça de roupa você deseja substituir? ");
								String produtoSub = entrada.next();
								roupa.set(i, produtoSub);
							}
						}	
					} else {
						System.out.println("Peça năo encontrada no estoque!");
					}
					break;
				case 4:
					System.out.println("\nO seu estoque possui as seguintes peças: ");
					for (String b : roupa) {
						System.out.println(b);
					}
					break;
				case 5:
					roda = 1;
					break;
				default:
					System.out.println("Opção inválida!");
					break;
					
			}
		}
		
		entrada.close();
	}		
}

