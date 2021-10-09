package OOHERANCA;

import java.util.Arrays;

public class Aluno extends Pessoa{

	private String turma;
	private double notas[];
	
	Aluno(int registro, String nome, int idade, String telefone, String endereco, String turma) {
		
		super(registro, nome, idade, telefone, endereco); //O super chama o construtor de Pessoa
		double notas[] = {0,0,0};
		this.notas = notas;
		this.turma = turma;

	}
	
	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
		
	public void atribuirNotas(int posicao, double nota) {
		
		double notas[] = this.notas;
		notas[posicao] = nota;
		this.notas = notas;
		
	}
	
	public void imprimirNotas() {
		
		System.out.println("Av1: " + notas[0]);
		System.out.println("Av2: " + notas[1]);
		System.out.println("Trabalho: " + notas[2]); 
		
	}

	@Override
	public String toString() {
		return "\n[Aluno]\nTurma: " + turma + 
				"\nNotas: " + Arrays.toString(notas) + 
				"\nRegistro: " + getRegistro() + 
				"\nNome: " + getNome() + 
				"\nTelefone: " + getTelefone() + 
				"\nEndereço: " + getEndereco()+ 
				"\nIdade: " + getIdade();
	}
	
	
	
}
