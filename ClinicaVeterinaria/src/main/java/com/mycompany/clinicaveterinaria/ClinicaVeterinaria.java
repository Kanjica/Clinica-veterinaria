package com.mycompany.clinicaveterinaria;


public class ClinicaVeterinaria {

    public static void main(String[] args) {
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
    }
}
