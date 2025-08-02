public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente, double saldo, int numeroConta, int agencia) {
		super(cliente, saldo, numeroConta, agencia);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=-=-=Extrato Conta Poupança=-=-=z\n" + this.toString());
	}
}
