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
            veterinarioDisp.addAgenda(agendado);
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
                veterinarioDisp.addAgenda(agendado);
                this.getAgendado().setHora(hora);
                System.out.println("\nNo horario das: " + hora + " voce vai ser atendindo pelo Dr. " + veterinarioDisp.getNome() + "\n");
                return true;
                
            }
                hora = hora.plusMinutes(20);
                
            // se o horario da manha ta cheio, tenta ve o horario da tarde:
            if(hora.equals(LocalTime.of(12, 0))){
                System.out.print("\nNao encontramos no horario da manha medicos disponiveis, tentando no horario da tarde...\n");
                hora = LocalTime.of(14, 0);
            }
        }
        System.out.println("\nNao temos medico disponivel no momento, tente outro dia!\n");
        return false;
          
    }
    
    //Encontrar o primeiro horario disponivel e so retornar o horario:
    public LocalTime ProximoHorario(Clinica clinica, LocalTime hora){
        while(!hora.equals(LocalTime.of(12, 0)) && !hora.equals(LocalTime.of(18, 0))){
            Veterinario veterinarioDisp = clinica.EncontrarVeterinario(this.getAgendado().getEspecialidade().getNome(), this.getAgendado().getDate(), hora);
            if(veterinarioDisp != null){
                return hora;
   
            }
            
            hora = hora.plusMinutes(20);
                
            // se o horario da manha ta cheio, tenta ve o horario da tarde:
            if(hora.equals(LocalTime.of(12, 0))){
                hora = LocalTime.of(14, 0);
            }
        }
        return null;
    }
    
    public void EmitirProntuario(String problema, String diagnostico, String medicamento){
        // quando a consulta ja é feita, ela nao é mais agendada:
        this.getAgendado().getAnimal().cancelarAgendamento(this.getAgendado().getDate(),this.getAgendado().getHora());
        this.getVeterinario().cancelarAgendamento(this.getAgendado().getDate(),this.getAgendado().getHora());
        this.problema = problema;
        this.diagnostico = diagnostico;
        this.medicamento = medicamento;
        
    }
    
    public String ImprimirProntuario(){
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = this.getAgendado().getDate().format(formatoBR);

    String prontuario =
      "\nProntuário do Animal:\n" +
      "Animal: " + this.getAgendado().getAnimal().getNome() + "\n" +
      "Tutor: " + this.getAgendado().getAnimal().getTutor().getNome() + "\n" +
      "Data: " + dataFormatada + "\n" +
      "Hora da consulta: " + this.getAgendado().getHora() + "\n" +
      "Veterinário que atendeu: " + this.getVeterinario().getNome() + "\n" +
      "Problema do Animal: " + this.getProblema() + "\n" +
      "Diagnóstico: " + this.getDiagnostico() + "\n" +
      "Medicação: " + this.getMedicamento() + "\n" +
      "Valor da consulta: R$ " + this.getAgendado().ValorConsulta();

     return prontuario;      
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
