package br.com.generation.heranca;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("Cachorro");
		cachorro.setIdade(5);
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getIdade() + " anos");
		cachorro.som();
		cachorro.corre();
		
		Cavalo cavalo = new Cavalo ();
	
		cavalo.setNome("Cavalo");
		cavalo.setIdade(15);
	
		System.out.println();
		System.out.println(cavalo.getNome());
		System.out.println(cavalo.getIdade() + " anos");
		cavalo.som();
		cavalo.corre();
		
		Preguica preguica = new Preguica();
		
		preguica.setNome("Preguiça");
		preguica.setIdade(30);
		
		System.out.println();
		System.out.println(preguica.getNome());
		System.out.println(preguica.getIdade() + " anos");
		preguica.som();
		preguica.escala();
	
	
	
	}
}
