
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Clientes cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extrato() {
		System.out.println("### EXTRATO CONTA CORRENTE ###");
		super.imprimirInfoContas();
	}
}
	
