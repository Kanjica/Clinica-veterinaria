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
    
    public float calcularTotalAtendimento(Tutor tutor){
        float total = 0;
        for(Animal a: tutor.getlistaAnimais()){
            total = total + a.CalcularPrecoDasVacinas() + a.CalcularPrecoDasConsultas();
        }
        
        return total;
    }
    
    public Veterinario buscarVeterinarioPorCpf(String cpf) {
        for (Veterinario vet : listaVeterinarios) {
            if (vet.getCpf().equals(cpf)) {
                return vet;
            }
        }
        return null; 
    }
    
    public Veterinario buscarVeterinarioPorNome(String nome) {
        for (Veterinario vet : listaVeterinarios) {
            if (vet.getNome().equals(nome)) {
                return vet;
            }
        }
        return null;
    }

    public Tutor buscarTutorPorNome(String nome) {
        for (Tutor tutor : listaTutores) {
            if (tutor.getNome().equals(nome)) {
                return tutor;
            }
        }
        return null;
    }

    public Vacina buscarVacinaPorNome(String nome) {
        for (Vacina vacina : listaVacinas) {
            if (vacina.getNomeVacina().equals(nome)) {
                return vacina;
            }
        }
        return null;
    }

    public Especialidade buscarEspecialidadePorNome(String nome) {
        for (Especialidade esp : listaEspecialidades) {
            if (esp.getNome().equals(nome)) {
                return esp;
            }
        }
        return null;
    }
    
    /*
    public boolean jaPodeOutraDose(Animal ani, Vacina vac){
        return ;
    }
    */
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void addConsultas(Consulta consultas) {
        this.listaConsultas.add(consultas);
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

    public ArrayList<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
        this.listaVeterinarios = listaVeterinarios;
    }

    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
    
    public void addVacina(Vacina vacina){
        listaVacinas.add(vacina);
    }
    public ArrayList<Vacina> getListaVacinas() {
        return listaVacinas;
    }
    
    public void setListaVacinas(ArrayList<Vacina> listaVacinas) {
        this.listaVacinas = listaVacinas;
    }
    
}
