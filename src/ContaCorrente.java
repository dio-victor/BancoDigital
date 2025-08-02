public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente, double saldo, int numeroConta, int agencia) {
		super(cliente, saldo, numeroConta, agencia);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=-=-=Extrato Conta Corrente=-=-=\n" + this.toString());
	}
}
