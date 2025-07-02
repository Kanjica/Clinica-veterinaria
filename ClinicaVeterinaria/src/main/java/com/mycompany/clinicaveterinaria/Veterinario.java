package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDate;
/**
Um veteriario precisa ter uma lista de Consultas ja feitas
* e sua agenda com consultas agendadas
*/

public class Veterinario extends Funcionario{
	 
private Especialidade especialidade;
private int cfmv;
private ArrayList<Agendamento> agenda;
private ArrayList<Consulta> listaConsultas;

	public Veterinario(String nome, String cpf, String email, int telefoneContato, Especialidade especialidade, int cfmv, String turno) {
		super(nome, cpf,email,telefoneContato, turno);
		
		this.especialidade = especialidade;
		this.cfmv = cfmv;
                this.agenda = new ArrayList<>();
                this.listaConsultas = new ArrayList<>();
	}
        
    public boolean verificarAgenda(LocalDate data, LocalTime hora){
        for(Agendamento agen: this.agenda){
            if(agen.getDate().equals(data) && agen.getHora().equals(hora)){
                return false;
            }
        }
        return true;
    }
    
    //verifica a agenda do veterinario e retorna o agendamento da vez:
    public Agendamento verificarAgenda1(LocalDate data, LocalTime hora){
        for(Agendamento agen: this.agenda){
            if(agen.getDate().equals(data) && agen.getHora().equals(hora)){
                return agen;
            }
        }
        return null;
    }
    
    // Quando uma consulta é cancelada, ela é tirada da agenda do veterinario.
    public void cancelarAgendamento(LocalDate data, LocalTime hora ) {
        
        Agendamento agendamento = buscarAgendamentoPorDataHora(data, hora);

       if (agendamento != null) {
         agenda.remove(agendamento);
         System.out.println("Agendamento cancelado com sucesso.");
       } else {
        System.out.println("Agendamento não encontrado para essa data e horário.");
        
       }   
     }
    
    public Agendamento buscarAgendamentoPorDataHora(LocalDate data, LocalTime hora) {
        for (Agendamento ag : agenda) {
           if (ag.getDate().equals(data) && ag.getHora().equals(hora)) {
              return ag;
           }
         }
        return null; // Se não encontrar
       }
    
    public String Imprimir() {
    return "Nome: " + nome + "\n" +
           "CPF: " + cpf + "\n" +
           "Email: " + email + "\n" +
           "Telefone: " + telefoneContato + "\n" +
           "Especialidade: " + especialidade.getNome() + "\n" +
           "CFMV: " + cfmv + "\n" +
           "Turno: " + this.turnoTrabalho;
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
        
    public void addAgenda(Agendamento consulta){
        this.agenda.add(consulta);
    }
    
    public ArrayList<Agendamento> getAgenda() {
         return agenda;
    }
    
    public void addConsultas(Consulta consulta){
        this.listaConsultas.add(consulta);
    }
    
    public ArrayList<Consulta> getListaConsultas() {
         return listaConsultas;
    }
  
}
