package com.mycompany.clinicaveterinaria;

public class Funcionario{

	protected String nome;
	protected String cpf;
	protected String email;
	protected String telefoneContato;
	protected String turnoTrabalho;
	
	public Funcionario(String nome, String cpf, String email, String telefoneContato, String turnoTrabalho) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefoneContato = telefoneContato;
		this.turnoTrabalho = turnoTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getTurnoTrabalho() {
		return turnoTrabalho;
	}

	public void setTurnoTrabalho(String turnoTrabalho) {
		this.turnoTrabalho = turnoTrabalho;
	}
}
