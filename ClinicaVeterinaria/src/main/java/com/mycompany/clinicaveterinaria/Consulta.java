package com.mycompany.clinicaveterinaria;
import java.time.LocalDateTime;


public class Consulta{
	
	private String problema;
	private String diagnostico;
	private String medicamento;
        private Veterinario veterinario;
        private float preco;
        private Agendamento agendado;

        public Consulta(String problema, String diagnostico, String medicamento, float preco) {
        this.problema = problema;
        this.diagnostico = diagnostico;
        this.medicamento = medicamento;
        this.preco = preco;
        }
        
        public boolean verificarDisponibilidade(Clinica clinica){
            Veterinario veterinario = clinica.EncontrarVeterinario(this.getAgendado().getEspecialidade(), this.getAgendado().getDate(), this.getAgendado().getHora());
            if(veterinario != null){
                this.setVeterinario(veterinario);
                return true;
            } else{
                System.out.println("Nao temos medico disponivel no momento, porfavor aguarde mais 20 min!"); // Podemos fazer um metodo que verifica qual o proximo horario disponivel...                
                return false;
            }
        }
        
        public boolean DisponibilidadeQualquerHorario(Clinica clinica){
            
            return false;
            
        }
        
        

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
        }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Agendamento getAgendado() {
        return agendado;
    }

    public void setAgendado(Agendamento agendado) {
        this.agendado = agendado;
    }
    
    
        
        
}
