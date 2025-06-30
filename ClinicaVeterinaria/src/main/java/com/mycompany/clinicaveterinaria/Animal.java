package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Animal{
	
    private String nome;
    private String raca;
    private String dataNascimento;
    private Tutor tutor;
    private ArrayList<Consulta> listaConsultas;
    private ArrayList<VacinaAplicada> listaVacinasAplicada;
    private ArrayList<Agendamento> listaAgendamentos;


    public Animal(String nome, String raca, String dataNascimento, Tutor tutor) {
            this.nome = nome;
            this.raca = raca;
            this.dataNascimento = dataNascimento;
            this.tutor = tutor;
            this.listaConsultas = new ArrayList<>();
            this.listaVacinasAplicada = new ArrayList<>();	
            this.listaAgendamentos = new ArrayList<>();
    }
    
    private List<VacinaAplicada> vacinasVencendoNoMes(String mesStr) {
    	try {
            int mesDesejado = Month.valueOf(mesStr.toUpperCase()).getValue();
            return listaVacinasAplicada.stream()
                .filter(v -> v.getProxAplicacao().getMonthValue() == mesDesejado)
                .collect(Collectors.toList());
    	}catch(IllegalArgumentException e) {
    		System.out.println(e.getStackTrace());
    		return Collections.emptyList();
    	}
    }
    
    public void printVacinasVencendoNoMes(String mesStr) {
    	List<VacinaAplicada> aVencer = vacinasVencendoNoMes(mesStr);
    	
    	if(aVencer.isEmpty()) {
    		System.out.println(this.nome +" não tem nenhuma vacina a vencer no mês " + mesStr);
    		return;
    		}
    	
    	aVencer.forEach(v-> 
    	System.out.println("Vacina: " + v.getVacina().getNomeVacina() + 
				"\n Data da próxima aplicação: " + v.getProxAplicacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }
    
    public void consultarProximasDatasDeVencimento(){
    	listaVacinasAplicada.forEach(v-> 
    	System.out.println("Vacina: " + v.getVacina().getNomeVacina() + 
				"\n Data da próxima aplicação: " + v.getProxAplicacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }
    
    public void prontuario() {
    	List<Consulta> consultasOrdenadas = new ArrayList<>(listaConsultas);
    	consultasOrdenadas.sort((c1, c2) -> 
            c2.getAgendado().getDate().compareTo(c1.getAgendado().getDate())//ordenando da mais recente a mais antiga
        );

        System.out.println("Consultas do animal " + this.nome + " :");
        consultasOrdenadas.forEach(c -> c.ImprimirProntuario());
    }
    
    
    
    
    public float CalcularPrecoDasVacinas(){
        float total = 0;
        for(VacinaAplicada v: listaVacinasAplicada){
            total = v.getPreco() + total;            
        }
        return total;
    }
    
    public float CalcularPrecoDasConsultas(){
        float total = 0;
        for(Consulta c: listaConsultas){
            total = c.getAgendado().ValorConsulta() + total;
        }
        return total;
    }

    @Override
    public String toString() {
           return "Nome: " + nome + 
                   "\nRaça: " + raca + 
                   "\nData de Nascimento: " + dataNascimento + 
                   "\nTutor: " + tutor.getNome() + "\n";
    }
    
    
    // Cancelar um agendamento que o animal tinha
    public void cancelarAgendamento(LocalDate data, LocalTime hora ) {
        
        Agendamento agendamento = buscarAgendamentoPorDataHora(data, hora);

       if (agendamento != null) {
         listaAgendamentos.remove(agendamento);
         System.out.println("Agendamento cancelado com sucesso.");
       } else {
        System.out.println("Agendamento não encontrado para essa data e horário.");
        
       }   
     }
    
    public void imprimirAgendamentos(){
        int i = 1;
        System.out.println("\nSegue a lista das futuras consultas de " + this.getNome()+ "\n");
        for(Agendamento agen: listaAgendamentos){
            System.out.println("Agendamento n: " + i);
            System.out.println("Dia do agendamento: " + agen.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("Agendamento: " + agen.getHora());
            System.out.println();
            i++;
        }
    }
    
    public Agendamento buscarAgendamentoPorDataHora(LocalDate data, LocalTime hora) {
        for (Agendamento ag : listaAgendamentos) {
           if (ag.getDate().equals(data) && ag.getHora().equals(hora)) {
              return ag;
           }
         }
        return null; // Se não encontrar
       }

    // Encontrar uma consulta especifica a partir de um tipo de agendamento:
    public Consulta BuscarConsulta(Agendamento ag1){
        for(Consulta con: listaConsultas){
            if(con.getAgendado().equals(ag1)){
                return con;
            }
        }
        return null;
    }

    public void addConsultas(Consulta c){
        listaConsultas.add(c);         
    }
    
    public void addVacinaAplicada(VacinaAplicada va){
        listaVacinasAplicada.add(va);
    }

    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public String getRaca() {
            return raca;
    }

    public void setRaca(String raca) {
            this.raca = raca;
    }

    public String getDataNascimento() {
            return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
    }

    public Tutor getTutor() {
            return tutor;
    }

    public void setTutor(Tutor tutor) {
            this.tutor = tutor;
    }

    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    public ArrayList<VacinaAplicada> getListaVacinasAplicada() {
        return listaVacinasAplicada;
    }

    public void setListaVacinasAplicada(ArrayList<VacinaAplicada> listaVacinasAplicada) {
        this.listaVacinasAplicada = listaVacinasAplicada;
    }

    public ArrayList<Agendamento> getListaAgendamentos() {
        return listaAgendamentos;
    }

    public void addListaAgendamentos(Agendamento agendado) {
        this.listaAgendamentos.add(agendado);
    }
    
}