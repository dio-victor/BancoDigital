import java.time.LocalDate;

public class Cliente {
	private String nome;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String cpf;

	public Cliente(String nome, Sexo sexo, LocalDate dataNascimento, String cpf) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
