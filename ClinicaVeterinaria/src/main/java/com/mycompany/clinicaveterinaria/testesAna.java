
package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class testesAna {
    
    public static void main(String[] args) {
        
        System.out.println("Bem Vindo a Clinica Veterinaria");
               
        Tutor t = new Tutor("Alexandre", "12346789", "Alexandre@gmail.com", 90739274, "Rua Alagoas");
        Tutor t2 = new Tutor("Rafael", "89473740", "Rafael@gmail.com", 8248364, "Rua Lordes");
       
        Animal a1 = new Animal("Bob", "Lulu da Pomerania", "20/04/2020", t);
        Animal a2 = new Animal("Principe", "Pincher", "20/01/2000", t);
        t.addAnimais(a1);
        t.addAnimais(a2);
        
        // Testes de Ana:
        Scanner scanner = new Scanner(System.in);
        
        Clinica petShop = new Clinica("SeuPetShop");
        petShop.addTutor(t2);
        petShop.addTutor(t);
        
        Especialidade cardiologista = new Especialidade("Cardiologista", 50);
        
        Veterinario vet1 = new Veterinario("Ana", "855532", "paulinhasp@gmail.com", 71892284,cardiologista,1313,"14h as 18h");
       
        
        petShop.addVeterinarios(vet1);
        
        LocalTime hora1 = LocalTime.of(10, 0);
        LocalDate data = LocalDate.of(2025, 11, 30);
        LocalDate data2 = LocalDate.of(2025, 11, 29);
        
        LocalTime hora2 = LocalTime.of(14, 0);
        
         
         
        Agendamento ag1 = new Agendamento(data,hora2,cardiologista,a1);
        a1.addListaAgendamentos(ag1);
        
        Agendamento ag2 = new Agendamento(data,hora2,cardiologista,a1);
        a1.addListaAgendamentos(ag2);
        
        Agendamento ag3 = new Agendamento(data,hora2,cardiologista,a1);
        a1.addListaAgendamentos(ag3);
        
        a1.imprimirAgendamentos();
 
        
        Consulta consulta1 = new Consulta(ag1);
        Consulta consulta2 = new Consulta(ag2);
        Consulta consulta3 = new Consulta(ag3);
        
        
        if(consulta2.verificarDisponibilidade(petShop)){
            consulta2.EmitirProntuario("Dor no coracao", "parada cardiaca", "__");
            consulta2.ImprimirProntuario();
            consulta2.getVeterinario().addConsultas(consulta2.getAgendado());
            
        } else{      
            System.out.print("\nDeseja verificar se possuimos algum outro medico disponivel em outros horarios?(s/n): \n Resposta: ");
            String r = scanner.nextLine();
            
            if(r.equals("s")){
                if(consulta2.DisponibilidadeQualquerHorario(petShop, consulta2.getAgendado().getHora())){
                    consulta2.EmitirProntuario("Dor no coracao", "parada cardiaca", "__");
                    consulta2.ImprimirProntuario();
                    consulta2.getVeterinario().addConsultas(consulta2.getAgendado());
                }
      
            } else{
                System.out.print("Te aguardamos em outro dia! ");
            }
        }
        
        if(consulta1.verificarDisponibilidade(petShop)){
            consulta1.EmitirProntuario("Dor no coracao", "parada cardiaca", "__");
            consulta1.ImprimirProntuario();
            consulta1.getVeterinario().addConsultas(consulta1.getAgendado());
            
        } else{      
            System.out.print("\nDeseja verificar se possuimos algum outro medico disponivel em outros horarios?(s/n): \n Resposta: ");
            String r = scanner.nextLine();
            
            if(r.equals("s")){
                if(consulta1.DisponibilidadeQualquerHorario(petShop, consulta1.getAgendado().getHora())){
                    consulta1.EmitirProntuario("Dor no coracao", "sentindo dor", "__");
                    consulta1.ImprimirProntuario();
                    consulta1.getVeterinario().addConsultas(consulta1.getAgendado());
                }
      
            } else{
                System.out.print("Te aguardamos em outro dia! ");
            }
        }
        
        if(consulta3.verificarDisponibilidade(petShop)){
            consulta3.EmitirProntuario("Dor no coracao", "parada cardiaca", "__");
            consulta3.ImprimirProntuario();
            consulta3.getVeterinario().addConsultas(consulta3.getAgendado());
            
        } else{      
            System.out.print("\nDeseja verificar se possuimos algum outro medico disponivel em outros horarios?(s/n): \n Resposta: ");
            String r = scanner.nextLine();
            
            if(r.equals("s")){
                if(consulta3.DisponibilidadeQualquerHorario(petShop, consulta3.getAgendado().getHora())){
                    consulta3.EmitirProntuario("Dor no coracao", "parada cardiaca", "__");
                    consulta3.ImprimirProntuario();
                    consulta3.getVeterinario().addConsultas(consulta3.getAgendado());
                }
      
            } else{
                System.out.print("Te aguardamos em outro dia! ");
            }
        }
        
        a1.imprimirAgendamentos();


    }
    
    public static void limparTela() {
    for (int i = 0; i < 50; i++) {
        System.out.println();
    }
    }
    
    public static void pausar() {
    System.out.println("Pressione Enter para continuar...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
     }


}



