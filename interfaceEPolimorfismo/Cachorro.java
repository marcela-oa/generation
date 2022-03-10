package br.com.generation.interfaceEPolimorfismo;

public class Cachorro extends Animal2 implements Animal1{

	@Override
	public void emiteSom() {
		System.out.println("Late: au au!");
	}
	
	@Override
	public void seMove() {
		System.out.println("O cachorro corre!");
	}
}
