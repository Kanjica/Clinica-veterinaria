package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;

public class Tutor {
	private String nome;
	private String cpf;
	private String email;
	private int telefoneContato;
	private String endereco;
	private ArrayList<Animal> listaAnimais;
	
	public Tutor(String nome, String cpf, String email, int telefoneContato, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefoneContato = telefoneContato;
		this.endereco = endereco;
                listaAnimais = new ArrayList();
	}
	
	public void addAnimais(Animal animal){
		this.listaAnimais.add(animal);
	}

	public ArrayList<Animal> getlistaAnimais(){
		return this.listaAnimais;
	}

    public void setListaAnimais(ArrayList<Animal> listaAnimais) {
           this.listaAnimais = listaAnimais;
    }
        
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(int telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}
        
     public void alterarAnimal(String nomeAntigo, String novoNome, String raca, String dataNascimento, Tutor tutor){
        for(Animal a: listaAnimais){
            if(nomeAntigo.equalsIgnoreCase(a.getNome())){
                a.setNome(novoNome);
                a.setRaca(raca);
                a.setDataNascimento(dataNascimento);
                a.setTutor(tutor);
                System.out.println("Animal alterado com sucesso");
                return;
            }
        }
        System.out.println("Animal não encontrado");     
     }        
    
     public void excluirAnimal(String nome){            
        for(int i = 0; i <listaAnimais.size(); i++){
            if(listaAnimais.get(i).getNome().equalsIgnoreCase(nome)){
                listaAnimais.remove(i);
                 System.out.println("Animal excluido com sucesso"); 
                break;
            }      
         }
     }
    
    public void consultarAnimal(String nome){
        for(Animal a: listaAnimais){
            if(nome.equalsIgnoreCase(a.getNome())){
                System.out.println("Animal procurado:");
                System.out.println(a);}
        }          
    }
    
    public void listarAnimais(){
        if(listaAnimais.isEmpty()) // Verifica se a lista está vazia
            System.out.println("Lista vazia\n");
        else{
            System.out.println("Dados Animais:\n");
            for(Animal a: listaAnimais){
                System.out.println(a);
            }
        }
    }
}
