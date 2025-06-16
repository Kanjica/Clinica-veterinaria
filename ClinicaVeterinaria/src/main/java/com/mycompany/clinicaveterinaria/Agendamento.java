package com.mycompany.clinicaveterinaria;

import java.util.Date;

public class Agendamento{

	private Veterinario veterinario;
	private Date date;
	private String hora;
        private String especialidade;
        private Animal animal;

    public Agendamento(Veterinario veterinario, Date date, String hora, String especialidade, Animal animal) {
        this.veterinario = veterinario;
        this.date = date;
        this.hora = hora;
        this.especialidade = especialidade;
        this.animal = animal;
    }
	
	
        
        
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
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
