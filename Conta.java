
public abstract class Conta implements OperacoesConta{

	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 001;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Clientes cliente;
	
	public Conta(Clientes cliente) {
		// TODO Auto-generated constructor stub
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void extrato() {
		// TODO Auto-generated method stub
		imprimirInfoContas();
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void encerrarConta(Conta contaPrincipal) {
		// TODO Auto-generated method stub
		System.out.println("A sua conta " +contaPrincipal.getNumero()+" foi encerrada com sucesso!");
		
	}
		
	protected void imprimirInfoContas() {
		System.out.println(String.format("TITULAR: %s", this.cliente.getNome()));
		System.out.println(String.format("AGENCIA: %d", this.agencia));
		System.out.println(String.format("CONTA  : %d", this.numero));
		System.out.println(String.format("SALDO  : %.2f", this.saldo));
	}
}
