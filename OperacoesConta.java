
public interface OperacoesConta {
	
	void extrato();
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, Conta contaDestino);
	void encerrarConta(Conta conta);
	
}
