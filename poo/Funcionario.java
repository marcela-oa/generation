package br.com.generation.poo;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	private int horasExtra;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	
	public double valorHoraExtra () {
		return salario += (horasExtra * 10);
	}
	
}
