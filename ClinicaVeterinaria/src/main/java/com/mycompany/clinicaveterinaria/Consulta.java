package com.mycompany.clinicaveterinaria;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Consulta{
    
	private Agendamento agendado;
	private String problema;
	private String diagnostico;
	private String medicamento;
        private Veterinario veterinario;
        
        public Consulta(Agendamento agendado) {
          this.agendado = agendado;    
        }
        
        public boolean verificarDisponibilidade(Clinica clinica){
            Veterinario veterinarioDisp = clinica.EncontrarVeterinario(this.getAgendado().getEspecialidade().getNome(), this.getAgendado().getDate(), this.getAgendado().getHora());
            if(veterinarioDisp != null){
                this.setVeterinario(veterinarioDisp);
                return true;
            } else{
                System.out.println();
                System.out.println("Nao temos medico disponivel no momento, porfavor aguarde mais 20 min!"); // Podemos fazer um metodo que verifica qual o proximo horario disponivel...                
                return false;
            }
        }
        
        // Procurar de 20 em 20 minutos um veterinario disponivel:
        public boolean DisponibilidadeQualquerHorario(Clinica clinica, LocalTime hora){
            while(!hora.equals(LocalTime.of(12, 0)) && !hora.equals(LocalTime.of(18, 0))){
                Veterinario veterinarioDisp = clinica.EncontrarVeterinario(this.getAgendado().getEspecialidade().getNome(), this.getAgendado().getDate(), hora);
                if(veterinarioDisp != null){
                    this.setVeterinario(veterinarioDisp);
                    veterinarioDisp.addConsultas(agendado);
                    this.getAgendado().setHora(hora);
                    return true;
                } else{
                    hora = hora.plusMinutes(20);
                }
                // se o horario da manha ta cheio, tenta ve o horario da tarde:
                if(hora.equals(12)){
                    System.out.print("nao encontramos no horario da manha medicos disponiveis, tentando no horario da tarde...");
                    hora = LocalTime.of(14, 0);
                }
            }
            System.out.println("Nao temos medico disponivel no momento, tente outro dia!");
            return false;
              
        }
        
        public void EmitirProntuario(String problema, String diagnostico, String medicamento){
            this.problema = problema;
            this.diagnostico = diagnostico;
            this.medicamento = medicamento;
        }
        
        public void ImprimirProntuario(){
            //criar um formatacao Br
            DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Formata a data
             String dataFormatada = this.getAgendado().getDate().format(formatoBR);
            System.out.println();
            System.out.println("Prontuario do Animal: ");
            
            System.out.println("Animal: " + this.getAgendado().getAnimal().getNome());
            System.out.println("Tutor: " + this.getAgendado().getAnimal().getTutor().getNome());
            System.out.println("Data: " + dataFormatada);
            System.out.println("Hora da consulta: " + this.getAgendado().getHora());
            System.out.println("Veterinario que atendeu: " + this.getVeterinario().getNome());
            System.out.println("Problema do Animal: " + this.getProblema());
            System.out.println("Diagnostico: " + this.getDiagnostico());
            System.out.println("Medicacao: " + this.getMedicamento());
            System.out.println("Valor da consulta: " + this.agendado.ValorConsulta());
            
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

   
    public Agendamento getAgendado() {
        return agendado;
    }

    public void setAgendado(Agendamento agendado) {
        this.agendado = agendado;
    }
    
    
        
        
}
