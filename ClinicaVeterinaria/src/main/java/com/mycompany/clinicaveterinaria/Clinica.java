package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class Clinica {
    private String nome;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Animal> animais;
    private ArrayList<Consulta> consultas;
    private ArrayList<Vacina> vacinas;
    
    
    public Clinica(String nome){
        this.nome = nome;
        this.animais = new ArrayList<>();
        this.consultas = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
    }
    
    public Veterinario EncontrarVeterinario(String especialidade,LocalDate data, LocalTime hora){
        for(Veterinario vet: veterinarios){
            // encontrar um veterinario na clinica com a especialidade
            if(vet.getEspecialidade().equals(especialidade)){
                
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
        return veterinarios;
    }

    public void addVeterinarios(Veterinario veterinario) {
        this.veterinarios.add(veterinario);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void addAnimais(Animal animal) {
        this.animais.add(animal);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void addConsultas(Consulta consultas) {
        this.consultas.add(consultas);
    }
    
    public ArrayList<Vacina> getVacina() {
        return vacinas;
    }

    public void addVacinas(Vacina vacina) {
        this.vacinas.add(vacina);
    }
    
}
