package br.com.generation.interfaceEPolimorfismo;

public abstract class Animal2 implements Animal1 {
	
	private String nome;
	private int idade;
	
	@Override
	public void emiteSom() {
		System.out.println("O animal emite som!");
	}
	
	@Override
	public void seMove() {
		System.out.println("O animal se move!");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
