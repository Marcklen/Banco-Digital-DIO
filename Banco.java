
public class Banco {

	public static void main(String[] args) {
		//creating a new Client to apply to the other accountings
		Clientes marcklen = new Clientes();
		marcklen.setNome("Marcklen");
		
		//creating a new checking account
		Conta ccorrente = new ContaCorrente(marcklen);
		ccorrente.depositar(120);
		
		//creating a new savings account
		Conta cpoupanca = new ContaPoupanca(marcklen);
		ccorrente.transferir(20, cpoupanca);
		
		cpoupanca.depositar(88);
		ccorrente.extrato();
		cpoupanca.extrato();
		System.out.println("----------------------");
		cpoupanca.transferir(8, ccorrente);
		ccorrente.extrato();
		cpoupanca.extrato();
		System.out.println("----------------------");
		ccorrente.encerrarConta(ccorrente);
		System.out.println("----------------------");
		cpoupanca.encerrarConta(cpoupanca);
		
	}
}
