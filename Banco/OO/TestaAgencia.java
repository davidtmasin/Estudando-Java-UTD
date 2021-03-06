package Banco.OO;

public class TestaAgencia {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente("172344-99", "443", 5000);
		ContaCorrente cc2 = new ContaCorrente("172354-99", "443", 3500);
		ContaPoupanca cp1 = new ContaPoupanca("6655799-2", "171", 0, "51");
		
		Usuario u1 = new Usuario("David", 29, cc1);
		Usuario u2 = new Usuario("Jubileu", 20, cc2);
		Usuario u3 = new Usuario("Jailson Mendes", 24, cp1);
		/*
		cc1.realizarTransferencia(cc2, 500);
		cc1.realizarDeposito(4500);
		cc1.realizarSaque(6000);
		
		cc1.mostrarSaldo();
		System.out.println("--------------------");
		cc2.mostrarSaldo();
		*/
		
		u1.getContaCorrente().realizarTransferencia(cc2, 500);
		u1.getContaCorrente().mostrarSaldo();
		System.out.println("--------------------");
		u2.getContaCorrente().mostrarSaldo();
		System.out.println("--------------------");
		u3.getContaPoupanca().mostrarSaldo();
		
	}

}
