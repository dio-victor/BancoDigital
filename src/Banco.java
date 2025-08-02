import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class Banco {
	private String nome;
	private List<Conta> listaContas;

	public Banco(String nome) {
		this.nome = nome;
		this.listaContas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getListaContas() {
		return listaContas;
	}

	public void adicionarConta(Conta novaConta) {
		if(novaConta == null) {
			System.out.println("Conta inválida!");
			return;
		}

		if(this.listaContas.stream().anyMatch(conta -> conta.getAgencia() == novaConta.getAgencia() && conta.getNumero() == novaConta.getNumero())) {
			System.out.println("Conta já existente");
			return;
		}

		this.listaContas.add(novaConta);
	}

	public void removerConta(int numeroConta, int agencia) {
		boolean foiRemovido = this.listaContas.removeIf(conta -> conta.getAgencia() == agencia && conta.getNumero() == numeroConta);
		if(foiRemovido == false) {
			System.out.println("Conta não existe!");
		}
	}

	public Optional<Conta> encontrarConta(int agencia, int numeroConta) {
		return this.listaContas.stream().filter(conta -> conta.getAgencia() == agencia && conta.getNumero() == numeroConta).findAny();
	}
}
