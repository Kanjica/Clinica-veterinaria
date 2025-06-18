package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class Clinica {
    private String nome;
    private ArrayList<Veterinario> listaVeterinarios;
    private ArrayList<Tutor> listaTutores;
    private ArrayList<Consulta> listaConsultas;
    private ArrayList<Vacina> listaVacinas;
    private ArrayList<Especialidade> listaEspecialidades;

    
    public Clinica(String nome){
        this.nome = nome;
        this.listaTutores = new ArrayList<>();
        this.listaConsultas = new ArrayList<>();
        this.listaVeterinarios = new ArrayList<>();
        this.listaVacinas = new ArrayList<>();
        this.listaEspecialidades = new ArrayList<>();
    }
    
    public boolean verificarTurno(LocalTime hora, int inicioTurno, int fimTurno ){
       
        LocalTime inicio = LocalTime.of(inicioTurno, 0);   
        LocalTime fim = LocalTime.of(fimTurno, 0);     
        
         if ((hora.equals(inicio) || hora.isAfter(inicio)) 
            && (hora.equals(fim) || hora.isBefore(fim))) {
            return true;
        } 
         
         return false;
    }
      
    
    public Veterinario EncontrarVeterinario(String especialidade,LocalDate data, LocalTime hora){
         String turno;
         if(this.verificarTurno(hora, 8, 12)){
           turno = "08h as 12h";
           
         } else{
           turno = "14h as 18h";
         }
         
        for(Veterinario vet: listaVeterinarios){
            // encontrar um veterinario na clinica com a especialidade
            if(vet.getEspecialidade().getNome().equals(especialidade) && vet.getTurnoTrabalho().equals(turno)){
                
                // encontrar agr um veterinario com horario livre para atender
                if(vet.verificarAgenda(data, hora)){
                    return vet;
                }
            }           
        }
        
        return null;
    }
    
    public Tutor buscarTutor(){
        return null;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return this.listaVeterinarios;
    }

    public void addVeterinarios(Veterinario veterinario) {
        this.listaVeterinarios.add(veterinario);
    }

    public ArrayList<Tutor> getListaTutores() {
        return this.listaTutores;
    }

    public void addTutor(Tutor animal) {
        this.listaTutores.add(animal);
    }

    public ArrayList<Consulta> getConsultas() {
        return this.listaConsultas;
    }

    public void addConsultas(Consulta consultas) {
        this.listaConsultas.add(consultas);
    }
    
    public ArrayList<Vacina> getVacina() {
        return this.listaVacinas;
    }

    public void addVacinas(Vacina vacina) {
        this.listaVacinas.add(vacina);
    }
    
     public ArrayList<Especialidade> getListaEspecialidades() {
        return listaEspecialidades;
    }

    public void addEspecialidades(Especialidade especialidade) {
        this.listaEspecialidades.add(especialidade);
    }
    
}
