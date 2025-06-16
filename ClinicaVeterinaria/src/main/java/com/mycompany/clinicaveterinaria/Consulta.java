public class Consulta{

	
	private String problema;
	private String diagnostico;
	private String medicamento;
        private Veterinario veterinario;
        private float preco;

        public Consulta(String problema, String diagnostico, String medicamento, Veterinario veterinario, float preco) {
        this.problema = problema;
        this.diagnostico = diagnostico;
        this.medicamento = medicamento;
        this.veterinario = veterinario;
        this.preco = preco;
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
        
        
}
