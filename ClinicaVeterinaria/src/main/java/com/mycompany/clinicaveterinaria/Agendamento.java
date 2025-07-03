package com.mycompany.clinicaveterinaria;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Agendamento{
    
    private LocalDate date;
    private LocalTime hora;
    private Especialidade especialidade;
    private Animal animal;
    
    //Agendamento
    public Agendamento(LocalDate date, LocalTime hora, Especialidade especialidade, Animal animal) {
        this.date = date;
        this.hora = hora;
        this.especialidade = especialidade;
        this.animal = animal;
    }
    
    public String imprimir() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada1 = this.getDate().format(formatoBR);
        
    return "Data: " + dataFormatada1 + "\n" +
           "Hora: " + hora + "\n" +
           "Especialidade: " + especialidade.getNome() + "\n" +
           "Animal: " + animal.getNome() + "\n" +
           "Tutor: " + animal.getTutor().getNome();
}


    
    public float ValorConsulta(){    
        return this.getEspecialidade().getPreco();        
    }
    
    public LocalDate getDate() {
	return date;
	}
    
    public void setDate(LocalDate date) {
    	this.date = date;
	}
    
    public LocalTime getHora() {
    	return hora;
	}
    
    public void setHora(LocalTime hora) {
    	this.hora = hora;
	}

    public Especialidade getEspecialidade() {
    	return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
        	
}