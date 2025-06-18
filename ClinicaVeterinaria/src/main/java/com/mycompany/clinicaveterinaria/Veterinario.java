package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDate;


public class Veterinario extends Funcionario{
	 
private Especialidade especialidade;
private int cfmv;
private ArrayList<Agendamento> listaConsultas;

	public Veterinario(String nome, String cpf, String email, int telefoneContato, Especialidade especialidade, int cfmv, String turno) {
		super(nome, cpf,email,telefoneContato, turno);
		
		this.especialidade = especialidade;
		this.cfmv = cfmv;
                this.listaConsultas = new ArrayList<>();
	}
        
        public boolean verificarAgenda(LocalDate data, LocalTime hora){
            for(Agendamento agenda: this.listaConsultas){
                if(agenda.getDate().equals(data) && agenda.getHora().equals(hora)){
                    return false;
                }
            }
            return true;
        }
        
        
	
	
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	public int getCfmv() {
		return cfmv;
	}
	
	public void setCfmv(int cfmv) {
		this.cfmv = cfmv;
	}
        
        public void addConsultas(Agendamento consulta){
            this.listaConsultas.add(consulta);
        }
        
        public ArrayList<Agendamento> getConsultas(){
            return this.listaConsultas;
        }
}
