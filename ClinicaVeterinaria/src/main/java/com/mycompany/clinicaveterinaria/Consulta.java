package com.mycompany.clinicaveterinaria;
import java.time.LocalTime;


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
        
        // Procurar de 20 em 20 minutos um veterinario disponivel:
        public boolean DisponibilidadeQualquerHorario(Clinica clinica, LocalTime hora){
            while(!hora.equals(LocalTime.of(12, 0)) && !hora.equals(LocalTime.of(18, 0))){
                Veterinario veterinario = clinica.EncontrarVeterinario(this.getAgendado().getEspecialidade(), this.getAgendado().getDate(), hora);
                if(veterinario != null){
                    this.setVeterinario(veterinario);
                    return true;
                } else{
                    hora = hora.plusMinutes(20);
                }
                // se o horario da manha ta cheio, tenta ve o horario da tarde:
                if(hora.equals(12)){
                    hora = LocalTime.of(14, 0);
                }
            }
            System.out.println("Nao temos medico disponivel no momento, tente outro dia!");
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
