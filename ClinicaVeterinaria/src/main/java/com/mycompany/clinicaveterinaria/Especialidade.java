package com.mycompany.clinicaveterinaria;

public class Especialidade {
    
    private String nome;
    private float preco;

    public Especialidade(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
    return nome; // Ou o que você quiser mostrar no combo
    }

    
}
