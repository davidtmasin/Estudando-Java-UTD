package RevisandoJava.OO;

public abstract class Pessoa {

	private long id;
	private String nome;
	private static int populacao; //atributo de classe, atributo global
	
	public Pessoa(long id, String nome) {
		this.id = id;
		this.nome = nome;	
		populacao++;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract String toString();
	
	public static int mostraPopulacao() { //método static é da própria classe [super método]
		return populacao;
	}
	
}
