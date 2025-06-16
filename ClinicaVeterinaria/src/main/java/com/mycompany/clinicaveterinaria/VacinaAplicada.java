package com.mycompany.clinicaveterinaria;

import java.util.Date;

public class VacinaAplicada {
    private Vacina vacina;
    private Date dataMinistrada;
    private Date proxAplicacao;
    private float preco;

    public VacinaAplicada(Vacina vacina, Date dataMinistrada, Date proxAplicacao, float preco) {
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

    public Date getDataMinistrada() {
        return dataMinistrada;
    }

    public void setDataMinistrada(Date dataMinistrada) {
        this.dataMinistrada = dataMinistrada;
    }

    public Date getProxAplicacao() {
        return proxAplicacao;
    }

    public void setProxAplicacao(Date proxAplicacao) {
        this.proxAplicacao = proxAplicacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
