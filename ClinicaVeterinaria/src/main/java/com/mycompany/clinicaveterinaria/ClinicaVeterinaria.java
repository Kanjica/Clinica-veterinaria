package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClinicaVeterinaria {

    public static void main(String[] args) {
        // Testes de kessia:
        System.out.println("Bem Vindo a Clinica Veterinaria");
               
        Tutor t = new Tutor("Alexandre", "12346789", "Alexandre@gmail.com", 90739274, "Rua Alagoas");
        Tutor t2 = new Tutor("Rafael", "89473740", "Rafael@gmail.com", 8248364, "Rua Lordes");
       
        Animal a1 = new Animal("Bob", "Lulu da Pomerania", "20/04/2020", t);
        Animal a2 = new Animal("Principe", "Pincher", "20/01/2000", t);
        t.addAnimais(a1);
        t.addAnimais(a2);
        t.listarAnimais();
        t.alterarAnimal("Bob", "Liu", "Hodcdv", "fhf", t2);
        t.excluirAnimal("Principe");
       
        t.consultarAnimal("Liu");
        
        // Testes de Ana:
        Clinica petShop = new Clinica("SeuPetShop");
        Especialidade cardiologista = new Especialidade("Cardiologista", 50);
        
        Veterinario vet1 = new Veterinario("Ana", "855532", "paulinhasp@gmail.com", 71892284,cardiologista,1313,"12h as 18h");
         LocalTime hora = LocalTime.of(14, 0);
         LocalDate data = LocalDate.of(2025, 11, 30);
         
        Agendamento ag1 = new Agendamento(data,hora,cardiologista,a1);
        
        System.out.println("Vamos marcar uma consulta, vai sai no valor de: " + ag1.ValorConsulta());
        
        
        
    }
}
