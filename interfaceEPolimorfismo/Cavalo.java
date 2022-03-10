package br.com.generation.interfaceEPolimorfismo;

public class Cavalo extends Animal2 implements Animal1 {

	@Override
	public void emiteSom() {
		System.out.println("Relincha: iiirrrrí!");
	}
	
	@Override
	public void seMove() {
		System.out.println("O cavalo corre!");
	}
}
