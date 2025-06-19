package com.mycompany.clinicaveterinaria;

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
	
	
	public Animal(String nome, String raca, String dataNascimento, Tutor tutor) {
		this.nome = nome;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
		this.tutor = tutor;
        this.listaConsultas = new ArrayList<>();
        this.listaVacinasAplicada = new ArrayList<>();		
	}
        
    public void addConsultas(Consulta c){
        listaConsultas.add(c);         
    }
    
    public void addVacinasAplicada(VacinaAplicada va){
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

}