package br.com.generation.interfaceEPolimorfismo;

public class Preguica extends Animal2 implements Animal1 {
	
	@Override
	public void emiteSom() {
		System.out.println("Grita: AAAAAAA!");
	}
	
	@Override
	public void seMove() {
		System.out.println("A preguiça escala árvores!");
	}

}
