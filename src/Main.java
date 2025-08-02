import java.time.LocalDate;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		// Criação do Banco
		Banco bancoItau = new Banco("Itaú");
		
		// teste de contas iguais
		System.out.println("Tentativa de adicionar contas iguais:");
		bancoItau.adicionarConta(new ContaCorrente(new Cliente("João", Sexo.Masculino, LocalDate.of(1989, 5, 30), "137.736.170-54"), 200, 12345, 12345));
		bancoItau.adicionarConta(new ContaCorrente(new Cliente("João", Sexo.Masculino, LocalDate.of(1989, 5, 30), "137.736.170-54"), 200, 12345, 12345));
		System.out.println();

		// remoção de conta não existente
		System.out.println("Tentativa de remover uma conta não existente:");
		bancoItau.removerConta(54241, 12345);
		System.out.println();

		// adição de mais contas e exibição
		System.out.println("Adição de mais contas e exibição:");
		bancoItau.adicionarConta(new ContaCorrente(new Cliente("Joana", Sexo.Feminino, LocalDate.of(1999, 9, 9), "864.441.390-23"), 100, 54241, 12345));
		bancoItau.adicionarConta(new ContaCorrente(new Cliente("Carla", Sexo.Feminino, LocalDate.of(1992, 4, 12), "084.915.520-73"), 500, 58637, 12345));
		System.out.println(bancoItau.getListaContas());
		System.out.println();

		// remoção de uma conta
		System.out.println("Remoção de uma conta e exibição:");
		bancoItau.removerConta(12345, 12345);
		System.out.println(bancoItau.getListaContas());
		System.out.println();

		// deposita, sacar e exibir:
		System.out.println("Deposito e Saque:");
		Optional<Conta> contaUm = bancoItau.encontrarConta(12345, 54241);
		contaUm.ifPresent(conta -> conta.depositar(50));
		Optional<Conta> contaDois = bancoItau.encontrarConta(12345, 58637);
		contaDois.ifPresent(conta -> conta.sacar(50));
		System.out.println(bancoItau.getListaContas());
		System.out.println();


		// transferência
		System.out.println("Transferência bancária: ");
		if(contaUm.isPresent()) {
			Conta contaDestino = contaUm.get();
			contaDois.ifPresent(conta -> conta.transferencia(150, contaDestino));
		}
		System.out.println(bancoItau.getListaContas());
	}
}
