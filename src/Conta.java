public abstract class Conta implements IConta {
	protected Cliente cliente;
	protected double saldo;
	protected int numero;
	protected int agencia;

	public Conta(Cliente cliente, double saldo, int numero, int agencia) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
	}

	@Override
	public void depositar(double valorDeposito) {
		if(valorDeposito < 0) {
			System.out.println("Não é possível sacar valores negativos");
			return;
		}

		this.saldo += valorDeposito;
	}

	@Override
	public void sacar(double valorSaque) {
		if(valorSaque < 0) {
			System.out.println("Não é possível sacar valores negativos");
			return;
		}

		if(valorSaque > this.saldo) {
			System.out.println("Não é possivel sacar um valor maior que o saldo disponível!");
			return;
		}

		this.saldo -= valorSaque;
	}

	@Override
	public void transferencia(double valorTransferencia, IConta contaDestino){
		this.sacar(valorTransferencia);
		contaDestino.depositar(valorTransferencia);
	}

	@Override
	public String toString() {
		return "Titular: " + cliente.getNome() + "\nAgência: " + agencia + "\nNúmero da Conta: " + numero + "\nSaldo: " + saldo + "\n";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}
}
