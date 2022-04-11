package br.com.joaosantana.ExecSpringUDF.model;

public class Funcionario {
	private String nome_funcionario;
	private String nome_dependente;
	private float salario_funcionario;
	private float salario_dependente;

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getNome_dependente() {
		return nome_dependente;
	}

	public void setNome_dependente(String nome_dependente) {
		this.nome_dependente = nome_dependente;
	}

	public float getSalario_funcionario() {
		return salario_funcionario;
	}

	public void setSalario_funcionario(float salario_funcionario) {
		this.salario_funcionario = salario_funcionario;
	}

	public float getSalario_dependente() {
		return salario_dependente;
	}

	public void setSalario_dependente(float salario_dependente) {
		this.salario_dependente = salario_dependente;
	}

	@Override
	public String toString() {
		return "Funcionario [nome_funcionario=" + nome_funcionario + ", nome_dependente=" + nome_dependente
				+ ", salario_funcionario=" + salario_funcionario + ", salario_dependente=" + salario_dependente + "]";
	}
}
