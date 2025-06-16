package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;

public class Vacina{
	 
private String nomeVacina;
private LocalDate validadeVacina;
private float preco;

	public Vacina(String nomeVacina, LocalDate validadeVacina, float preco) {
		super();
		this.nomeVacina = nomeVacina;
		this.validadeVacina = validadeVacina;
                this.preco = preco;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}


	public LocalDate getValidadeVacina() {
		return validadeVacina;
	}

	public void setValidadeVacina(LocalDate validadeVacina) {
		this.validadeVacina = validadeVacina;
	}

}
