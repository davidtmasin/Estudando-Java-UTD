package hierarquia.Loja;

import java.util.Objects;

public abstract class Produto implements Comparable<Produto>{// a interface s? ser? executada nas classes filhas
	
	private int codigoDeBarras;
	private String nome;
	private double preco;
	
	public Produto(int codigoDeBarras, String nome, double preco) {
		this.codigoDeBarras = codigoDeBarras;
		this.nome = nome;
		this.preco = preco;
	}
		
	public long getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(int codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public abstract String toString();

	@Override
	public int hashCode() {//S? funcionam em cole??es hashMap
		return Objects.hash(codigoDeBarras, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return preco == other.preco;
	}	
	
	
	
}
