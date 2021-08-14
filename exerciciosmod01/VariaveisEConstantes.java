package exerciciosmod01;
/*
 * 
 * Classe demonstrativa de variáveis e constantes
 * 
 * versão 1.0
 * 
 * autor: David Teixeira
 * 
 * 
 * */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		//Criação de variáveis
		String nome;
		int idade;
		double peso, altura;
		char sexo, cnh;
		boolean doadorOrgaos;
		
		//Atribuição de valores às variáveis
		nome = "David Teixeira de Masin";
		idade = 29;
		peso = 100;
		altura = 1.8;
		sexo = 'M';
		cnh = 'S';
		doadorOrgaos = false;
		
		//Criação de constantes
		final double ACELERACAO_GRAVIDADE_TERRA;
		
		//Atribuição de valores às constantes
		ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		
		//Apresentação de valores no console
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+altura);
		System.out.println("Sexo: "+sexo);
		System.out.println("Habilitação: "+cnh);
		System.out.printf("Doador de órgãos: %b\n",doadorOrgaos);
		System.out.println("A gravidade da Terra é de "+ACELERACAO_GRAVIDADE_TERRA+"m/s²");
		
	}
	
}
