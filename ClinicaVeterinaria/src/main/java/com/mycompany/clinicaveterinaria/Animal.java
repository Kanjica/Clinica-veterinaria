package com.mycompany.clinicaveterinaria;


import java.util.ArrayList;

public class Animal{
	
	private String nome;
	private String raca;
	private String dataNascimento;
	private Tutor tutor;
        private ArrayList<Consulta> consultas;
        private ArrayList<VacinaAplicada> vacinasAplicada;
	
	
	public Animal(String nome, String raca, String dataNascimento, Tutor tutor) {
		this.nome = nome;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
		this.tutor = tutor;
                consultas = new ArrayList();
                vacinasAplicada = new ArrayList();		
	}
        
        public void addConsultas(Consulta c){
            consultas.add(c);         
        }
        
        public void addVacinasAplicada(VacinaAplicada va){
            vacinasAplicada.add(va);
        }
        

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

        public ArrayList<Consulta> getConsultas() {
               return consultas;
        }

        public void setConsultas(ArrayList<Consulta> consultas) {
            this.consultas = consultas;
        }

        public ArrayList<VacinaAplicada> getVacinasAplicada() {
        return vacinasAplicada;
        }

        public void setVacinasAplicada(ArrayList<VacinaAplicada> vacinasAplicada) {
        this.vacinasAplicada = vacinasAplicada;
        }
        
        @Override
        public String toString() {
               return "Nome: " + nome + 
                       "\nRaça: " + raca + 
                       "\nData de Nascimento: " + dataNascimento + 
                       "\nTutor: " + tutor.getNome() + "\n";
        }

	
	
}
