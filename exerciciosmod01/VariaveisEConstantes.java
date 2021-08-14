package exerciciosmod01;
/*
 * 
 * Classe demonstrativa de vari�veis e constantes
 * 
 * vers�o 1.0
 * 
 * autor: David Teixeira
 * 
 * 
 * */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		//Cria��o de vari�veis
		String nome;
		int idade;
		double peso, altura;
		char sexo, cnh;
		boolean doadorOrgaos;
		
		//Atribui��o de valores �s vari�veis
		nome = "David Teixeira de Masin";
		idade = 29;
		peso = 100;
		altura = 1.8;
		sexo = 'M';
		cnh = 'S';
		doadorOrgaos = false;
		
		//Cria��o de constantes
		final double ACELERACAO_GRAVIDADE_TERRA;
		
		//Atribui��o de valores �s constantes
		ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		
		//Apresenta��o de valores no console
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+altura);
		System.out.println("Sexo: "+sexo);
		System.out.println("Habilita��o: "+cnh);
		System.out.printf("Doador de �rg�os: %b\n",doadorOrgaos);
		System.out.println("A gravidade da Terra � de "+ACELERACAO_GRAVIDADE_TERRA+"m/s�");
		
	}
	
}
