package lista05exercicio05;

public class Autonomo extends Prestador {
	private long cpf;

	public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autonomo [cpf=" + cpf + "]";
	}
	
	public void Imprimirdados() {
		super.Imprimirdados();
		System.out.println("CPF:"+this.cpf);
	
	}
	
}	
