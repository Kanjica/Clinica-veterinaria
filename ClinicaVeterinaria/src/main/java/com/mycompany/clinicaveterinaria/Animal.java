package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;

public class Animal{
	
	private String nome;
	private String raca;
	private String dataNascimento;
	private Tutor tutor;
        private ArrayList<Consulta> listaConsultas;
        private ArrayList<VacinaAplicada> listaVacinasAplicada;
	
	
	public Animal(String nome, String raca, String dataNascimento, Tutor tutor) {
		this.nome = nome;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
		this.tutor = tutor;
                this.listaConsultas = new ArrayList();
                this.listaVacinasAplicada = new ArrayList();		
	}
        
        public void addConsultas(Consulta c){
            listaConsultas.add(c);         
        }
        
        public void addVacinasAplicada(VacinaAplicada va){
            listaVacinasAplicada.add(va);
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
               return listaConsultas;
        }

        public ArrayList<VacinaAplicada> getVacinasAplicada() {
            return listaVacinasAplicada;
        }

        public ArrayList<Consulta> getListaConsultas() {
            return listaConsultas;
        }

        public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
            this.listaConsultas = listaConsultas;
        }

        public ArrayList<VacinaAplicada> getListaVacinasAplicada() {
            return listaVacinasAplicada;
        }

        public void setListaVacinasAplicada(ArrayList<VacinaAplicada> listaVacinasAplicada) {
            this.listaVacinasAplicada = listaVacinasAplicada;
        }
        
        public float CalcularPrecoDasVacinas(){
            float total = 0;
            for(VacinaAplicada v: listaVacinasAplicada){
                total = v.getPreco() + total;            
            }
            return total;
        }
        
        public float CalcularPrecoDasConsultas(){
            float total = 0;
            for(Consulta c: listaConsultas){
                total = c.getAgendado().ValorConsulta() + total;
            }
            return total;
        }

        
        @Override
        public String toString() {
               return "Nome: " + nome + 
                       "\nRaça: " + raca + 
                       "\nData de Nascimento: " + dataNascimento + 
                       "\nTutor: " + tutor.getNome() + "\n";
        }

	
	
}
