package Banco.OO;

public class Usuario {

	private String nome;
	private int idade;
	private ContaPoupanca contaPoupanca;
	private ContaCorrente contaCorrente;
	
	public Usuario(String nome, int idade, ContaPoupanca contaPoupanca) {
		this.nome = nome;
		this.idade = idade;
		this.contaPoupanca = contaPoupanca;
	}
	
	public Usuario(String nome, int idade, ContaCorrente contaCorrente) {
		this.nome = nome;
		this.idade = idade;
		this.contaCorrente = contaCorrente;
	}
	
	public Usuario(String nome, int idade, ContaPoupanca contaPoupanca, ContaCorrente contaCorrente) {
		this.nome = nome;
		this.idade = idade;
		this.contaPoupanca = contaPoupanca;
		this.contaCorrente = contaCorrente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
		
	
}
