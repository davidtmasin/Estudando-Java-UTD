package OOHERANCA;

public abstract class Pessoa { //Para tornar uma classe como não instanciável, usa-se o termo abstract
	
	private int registro;
	private String nome;
	private int idade;
	private String telefone;
	private String endereco;
	
	Pessoa() {}
	
	public Pessoa(int registro, String nome, int idade, String telefone, String endereco) {
		
		this.registro = registro;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	/*@Override
	public String toString() {
		return "Pessoa [registro=" + registro + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone
				+ ", endereco=" + endereco + "]";
	}
	*/
	//o método abstract é somente uma assinatura
	//Quando há um método abstract dentro de uma classe abstract,
	//todas as classes filhas devem implementar este método
	public abstract String toString(); 
	 
}
