package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Vacina{
	 
private String nomeVacina;
private LocalDate validadeVacina;
private float preco;
private int quantidade;
private int dosesMinimas;

    public Vacina(String nomeVacina, LocalDate validadeVacina, float preco, int quantidade, int dosesMinimas) {
            super();
            this.nomeVacina = nomeVacina;
            this.validadeVacina = validadeVacina;
            this.preco = preco;
            this.quantidade = quantidade;
            this.dosesMinimas = dosesMinimas;
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
    
    public int getDosesMinimas(){
        return dosesMinimas;
    }
    
    public void setDosesMinimas(int dosesMinimas){
        this.dosesMinimas = dosesMinimas;
    }
    
    @Override
    public String toString(){
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada1 = this.getValidadeVacina().format(formatoBR);
        
    return"Nome: " + this.nomeVacina +
            "\nValidade: " + dataFormatada1 +
            "\nPreço: " + this.preco + 
            "\nQuantidade: " + this.quantidade +
            "\nDoses Mínimas: " + this.dosesMinimas;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false; 
        Vacina vacina = (Vacina) o;
        return Objects.equals(nomeVacina, vacina.nomeVacina) &&
               Objects.equals(validadeVacina, vacina.validadeVacina) &&
               Objects.equals(preco, vacina.preco) &&
               Objects.equals(quantidade, vacina.quantidade) &&
               Objects.equals(dosesMinimas, vacina.dosesMinimas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeVacina, validadeVacina, preco, quantidade, dosesMinimas);
    }
}