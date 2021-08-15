package exerciciosmod01;

import java.util.Scanner;
 
public class EntradaSaida {
	
	public static void main(String[] args) {
		
		//Variáveis
		String nome;
		int idade;
		double altura;
		
		
		//Lendo valores usando a classe Scanner
		Scanner leitorValores = new Scanner(System.in);
		
		System.out.println("Digite seu nome.");
		nome = leitorValores.nextLine();
		System.out.println("Nome: "+nome);
		
		
		System.out.println("Digite sua idade.");
		idade = leitorValores.nextInt();
		System.out.println("Idade: "+idade+" anos.");
		
		
		System.out.println("Digite sua altura.");
		altura = leitorValores.nextDouble();
		System.out.println("Altura: "+altura+"m.");
		
		
		System.out.printf("\nNome: %s.\nIdade: %d anos.\nAltura: %.2fm.", nome, idade, altura);
		
	}
}
