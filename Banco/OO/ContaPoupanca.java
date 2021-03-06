package Banco.OO;

public class ContaPoupanca extends Conta{

	private String variacao;
	
	public ContaPoupanca(String numConta, String agencia, double saldo, String variacao) {
		super(numConta, agencia, saldo);
		
		this.variacao = variacao;
	}
							//double selic
	public void geraRendimento() {
		
		double saldo = this.getSaldo();
							//saldo*=selic;
		double rendimento = saldo*=0.005;
		
		this.setSaldo(saldo + rendimento);
		
	}
	
	public void mostrarSaldo() {
		
		System.out.println("Ag?ncia: " + this.getAgencia());
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Varia??o: " + this.variacao);
		System.out.println("Saldo: R$" + this.getSaldo());
	}
	
}
