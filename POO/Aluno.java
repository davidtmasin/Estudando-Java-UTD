package POO;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

	//O encapsulamento afeta o n�vel de seguran�a das informa��es
	//Sem nada informado na frente dos atributos, o encasulapmento definido � o default
	//default, protected, public, private
	//public -> todo mundo consegue enxergar tudo 
	//private -> � o mais seguro, que fica restrito e acess�vel apenas pelos m�todos acessores
	private String nome;
	//private double notas []; o tipo primitivo inicia o valor com zero
	private double notas[];
	private double media;
	//private int faltas;
	private Integer faltas; //o tipo composto inicia o valor com NULL
	private String laboratorio;
	static int quantidadeAlunos; //Vari�vel de classe quando tem o static, ou seja, n�o pertence ao objeto 
	
	public Aluno() {}
	
	public Aluno(String nome) {
		this.nome = nome;
		double notas[] = {0, 0, 0};
		this.notas = notas;
		quantidadeAlunos++;

	}
	
	public Aluno(String nome, double notas[], int faltas) {
		this.nome = nome; //o this � para se referir ao atributo do objeto
		this.notas = notas;
		this.faltas = faltas;
		
	}
	
	public Aluno(String nome, double notas[], int faltas, String laboratorio) {
		this.nome = nome; //o this � para se referir ao atributo do objeto
		this.notas = notas;
		this.faltas = faltas;
		this.laboratorio = laboratorio;
	}
	
	//M�todos - a��es(verbos) que o objeto realiza [uma fun��o]
	
	public void imprimirDeclaracao() { //n�o ir� retornar nada, por isso o void e o public � para ficar vis�vel a todo o projeto
		System.out.println("Aluno(a): "+this.nome+"\nNotas: "+this.notas[0]+" "+this.notas[1]+" "+this.notas[2]);
		System.out.println("N� de faltas: "+this.faltas);
		System.out.println("Media: "+this.media);
		
	}
	
//M�todos Acessores [Getters and Setters]	

	//M�todos para retornar o nome
	public String getNome() {
		return this.nome;
	}
	
	//M�todo para alterar o nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(int posicao, double nota) {
		double notas[] = this.notas;
		notas[posicao] = nota;
		this.notas = notas;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double nota1, double nota2, double nota3) {		
		
		this.media = (nota1 + nota2 + nota3)/3;
			
	}
	
	//M�todo toString � para imprimir todo o objeto
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", notas=" + Arrays.toString(notas) + ", media=" + media + ", faltas=" + faltas
				+ ", laboratorio=" + laboratorio + "]";
	}
	
	//M�todo hasCode � para comparar objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(faltas, laboratorio, media, nome);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(faltas, other.faltas) && Objects.equals(laboratorio, other.laboratorio)
				&& Double.doubleToLongBits(media) == Double.doubleToLongBits(other.media)
				&& Objects.equals(nome, other.nome) && Arrays.equals(notas, other.notas);
	}
	
	public static void getQuantidadeAlunos() {
		System.out.println(quantidadeAlunos);
	}
	
	
	
	
}
