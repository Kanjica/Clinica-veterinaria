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
    
    
    public Clinica(String nome){
        this.nome = nome;
        this.listaTutores = new ArrayList<>();
        this.listaConsultas = new ArrayList<>();
        this.listaVeterinarios = new ArrayList<>();
        this.listaVacinas = new ArrayList<>();
    }
    
    public Veterinario EncontrarVeterinario(String especialidade,LocalDate data, LocalTime hora){
        for(Veterinario vet: listaVeterinarios){
            // encontrar um veterinario na clinica com a especialidade
            if(vet.getEspecialidade().getNome().equals(especialidade)){
                // encontrar agr um veterinario com horario livre para atender
                if(vet.verificarAgenda(data, hora)){
                return vet;
                }
            }           
        }
        
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
    
}
