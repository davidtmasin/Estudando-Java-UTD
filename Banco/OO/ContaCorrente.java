package Banco.OO;

public class ContaCorrente extends Conta{

	public ContaCorrente(String numConta, String agencia, double saldo) {
		super(numConta, agencia, saldo);
		
	}
	
	public void taxaManutencao() {
		double saldo = this.getSaldo();
		
		double taxa = saldo*0.05;
		
		this.setSaldo(saldo-taxa);
	}
	
	
	
}
