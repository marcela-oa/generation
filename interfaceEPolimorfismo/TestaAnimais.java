package br.com.generation.interfaceEPolimorfismo;

public class TestaAnimais {

	public static void main(String[] args) {

		Animal2 cc = new Cachorro();
		Animal2 cv = new Cavalo();
		Animal2 pg = new Preguica();
		
		cc.setNome("Cachorro");
		cv.setNome("Cavalo");
		pg.setNome("Preguiça");
		
		cc.setIdade(5);
		cv.setIdade(9);
		pg.setIdade(20);
		
		System.out.println(cc.getNome() + ": " + cc.getIdade() + " anos.");
		cc.emiteSom();
		cc.seMove();
		
		System.out.println();
		System.out.println(cv.getNome() + ": " + cv.getIdade() + " anos.");
		cv.emiteSom();
		cv.seMove();
		
		System.out.println();
		System.out.println(pg.getNome() + ": " + pg.getIdade() + " anos.");
		pg.emiteSom();
		pg.seMove();
	}

}
