
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Clientes cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extrato() {
		System.out.println("### EXTRATO CONTA POUPANÇA ###");
		super.imprimirInfoContas();
	}
}
