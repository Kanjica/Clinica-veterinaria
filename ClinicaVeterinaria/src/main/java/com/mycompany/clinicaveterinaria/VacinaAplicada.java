package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;
import java.util.Objects;

public class VacinaAplicada {
    private Vacina vacina;
    private LocalDate dataMinistrada;
    private LocalDate proxAplicacao;
    private float preco;
    
    public VacinaAplicada(Vacina vacina, LocalDate dataMinistrada, LocalDate proxAplicacao, float preco) {
        this.vacina = vacina;
        this.dataMinistrada = dataMinistrada;
        this.proxAplicacao = proxAplicacao;
        this.preco = preco;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public LocalDate getDataMinistrada() {
        return dataMinistrada;
    }

    public void setDataMinistrada(LocalDate dataMinistrada) {
        this.dataMinistrada = dataMinistrada;
    }

    public LocalDate getProxAplicacao() {
        return proxAplicacao;
    }

    public void setProxAplicacao(LocalDate proxAplicacao) {
        this.proxAplicacao = proxAplicacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public String proxApli(){
        return "Nome: " + this.vacina.getNomeVacina() +
            "\nData ministrada: " + this.dataMinistrada +
            "\n**Próxima aplicação**: " + this.proxAplicacao +
            "\nPreço da aplicação: " + this.preco;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; 
        
        VacinaAplicada that = (VacinaAplicada) o; 

        return Float.compare(that.preco, preco) == 0 &&
               Objects.equals(vacina, that.vacina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vacina, preco);
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.vacina.getNomeVacina() +
            "\nValidade: " + this.vacina.getValidadeVacina() +
            "\nPreço da vacina: " + this.vacina.getPreco() + 
            "\nQuantidade: " + this.vacina.getQuantidade() +
            "\nData ministrada: " + this.dataMinistrada +
            "\nPróxima aplicação" + this.proxAplicacao +
            "\nPreço da aplicação" + this.preco;
    }
}