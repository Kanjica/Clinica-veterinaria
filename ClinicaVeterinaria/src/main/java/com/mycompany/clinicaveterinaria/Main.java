package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {
        // Testes de kessia:
        System.out.println("Bem vindo a Clinica Veterinaria");
      
        Tutor t = new Tutor("Alexandre", "12346789", "Alexandre@gmail.com", "90739274", "Rua Alagoas");
        Tutor t2 = new Tutor("Rafael", "89473740", "Rafael@gmail.com", "8248364", "Rua Lordes");
        
        Animal a1 = new Animal("Bob", "Lulu da Pomerania", "20/04/2020", t);
        Animal a2 = new Animal("Principe", "Pincher", "20/01/2000", t);
             
        Especialidade esp1 = new Especialidade("Dermatologia", 100);
        Especialidade esp2 = new Especialidade("Neurologia", 40);
        
        Agendamento ag = new Agendamento(LocalDate.of(2025, 6, 20), LocalTime.of(10, 0), esp1, a1);
        
        Veterinario vet1 = new Veterinario("Rogerio", "111335346096", "Rogerio@gmail.com", "9472923", esp1, 1, "matutino");
        Veterinario vet = new Veterinario("João Silva", "123.456.789-00", "joao@vet.com", "11999999", esp2, 123456, "manhã");
        
        Consulta c1 = new Consulta(ag);
        
        Vacina vacina1 = new Vacina("Vacina1", LocalDate.of(2025, 6, 18), 10.0f, 10, 1);
        Vacina vacina2 = new Vacina("Vacina2", LocalDate.of(2025, 6, 10), 10.0f, 10, 1);
        VacinaAplicada VA1 = new VacinaAplicada(vacina1, LocalDate.of(2025, 6, 10), LocalDate.of(2025, 6, 20), 80.0f);
        VacinaAplicada VA2 = new VacinaAplicada(vacina2, LocalDate.of(2025, 6, 8), LocalDate.of(2025, 6, 28), 50.0f);
      
        Clinica clinica = new Clinica("Veterinarios");
        
        t.addAnimais(a1);
        t.addAnimais(a2);
        
        a1.addVacinaAplicada(VA1);
        a1.addVacinaAplicada(VA2);
        a1.addConsultas(c1);
        
        
        System.out.println("Preço Total: " +clinica.calcularTotalAtendimento(t));
        /*
        t.listarAnimais();
        t.alterarAnimal("Bob", "Liu", "Hodcdv", "fhf", t2);
        t.excluirAnimal("Principe");
       
        t.consultarAnimal("Liu"); */  
    }
}
