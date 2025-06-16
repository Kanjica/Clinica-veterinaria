package com.mycompany.clinicaveterinaria;
import java.time.LocalTime;
import java.time.LocalDate;

public class Agendamento{

	private Veterinario veterinario;
	private LocalDate date;
	private LocalTime hora;
        private String especialidade;
        private Animal animal;

    public Agendamento(Veterinario veterinario, LocalDate date, LocalTime hora, String especialidade, Animal animal) {
        this.veterinario = veterinario;
        this.date = date;
        this.hora = hora;
        this.especialidade = especialidade;
        this.animal = animal;
    }
    
    public float ValorConsulta(){
            // depende da especialidade
            return 0;
            
    }
	
	
        
        
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
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

        public String getEspecialidade() {
        return especialidade;
        }

        public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        }

        public Animal getAnimal() {
        return animal;
        }

        public void setAnimal(Animal animal) {
        this.animal = animal;
        }
        
        
	
}
