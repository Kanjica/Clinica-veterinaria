package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDate;


public class Veterinario extends Funcionario{
	 
private String especialidade;
private int cfmv;
private ArrayList<Agendamento> consultas;

	public Veterinario(String nome, String cpf, String email, int telefoneContato, String especialidade, int cfmv, String turno) {
		super(nome, cpf,email,telefoneContato, turno);
		
		this.especialidade = especialidade;
		this.cfmv = cfmv;
                this.consultas = new ArrayList<>();
	}
        
        public boolean verificarAgenda(LocalDate data, LocalTime hora, String especialidade){
            for(Agendamento agenda: consultas){
                if(agenda.getDate() == data && agenda.getHora().equals(hora)){
                    return false;
                }
            }
            return true;
        }
        
        
	
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public int getCfmv() {
		return cfmv;
	}
	
	public void setCfmv(int cfmv) {
		this.cfmv = cfmv;
	}
        
        public void addConsultas(Agendamento consulta){
            this.consultas.add(consulta);
        }
        
        public ArrayList<Agendamento> getConsultas(){
            return this.consultas;
        }
}
