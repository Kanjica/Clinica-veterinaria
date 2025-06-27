package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;

public class Vacina{
	 
private String nomeVacina;
private LocalDate validadeVacina;
private float preco;
private int quantidade;

    public Vacina(String nomeVacina, LocalDate validadeVacina, float preco, int quantidade) {
            super();
            this.nomeVacina = nomeVacina;
            this.validadeVacina = validadeVacina;
            this.preco = preco;
            this.quantidade = quantidade;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}