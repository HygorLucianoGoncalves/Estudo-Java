
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// bonificação
	public abstract double getBonificacao();

	// setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// gettess
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}
}
