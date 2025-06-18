package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;


public class Tutor {
	private String nome;
	private String cpf;
	private String email;
	private int telefoneContato;
	private String endereco;
	private ArrayList<Animal> animais;
	
	public Tutor(String nome, String cpf, String email, int telefoneContato, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefoneContato = telefoneContato;
		this.endereco = endereco;
                animais = new ArrayList();
	}
	
	public void addAnimais(Animal animal){
		this.animais.add(animal);

	}

	public ArrayList<Animal> getAnimais(){
		return this.animais;
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
            for(Animal a: animais){
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
           /* for(Animal a: animais){
                if(nome.equalsIgnoreCase(a.getNome())){
                    animais.remove(a);
                break;}
            } Funcionou mas vi que é arriscado*/
            for(int i = 0; i <animais.size(); i++){
                if(animais.get(i).getNome().equalsIgnoreCase(nome)){
                    animais.remove(i);
                     System.out.println("Animal excluido com sucesso"); 
                    break;
                }      
            }
        }
        
        public void consultarAnimal(String nome){
            for(Animal a: animais){
                if(nome.equalsIgnoreCase(a.getNome())){
                    System.out.println("Animal procurado:");
                    System.out.println(a);}
            }          
        }
        
        public void listarAnimais(){
            if(animais.isEmpty()) // Verifica se a lista está vazia
                System.out.println("Lista vazia\n");
            else{
                System.out.println("Dados Animais:\n");
                for(Animal a: animais){
                    System.out.println(a);
                }
            }
        }


}
