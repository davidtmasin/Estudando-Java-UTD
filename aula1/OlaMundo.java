package aula1;
/*
 * TREINANDO UM PROGRAMA B�SICO EM JAVA
 * CONHECIMENTO ADQUIRIDO NA AULA DO CURSO DE JAVA DA UTD
 * PROF. OSVALDO
 *
 */

public class OlaMundo {

	public static void main(String[] args) {
		
		
		//Declara��o de vari�veis 	
		int RandNumber1 = 1024, RandNumber2 = 2048;
		char RandLetter = 'D';
		double DecNumber = 10.01; //float DecNumber = 10.01f
		String MyName = "David";
		boolean isGay = false;
		double CompCircunf;
		double RaioCircunf = 10;
		
		//Declara��o de constantes
		final double PI = 3.14;
		
		//Processamento de dados
		RandNumber1 = RandNumber2 * 2;
		DecNumber = (((RandNumber1 * DecNumber) / 2) * 5) - 14800;		
				
		CompCircunf = 2*PI*RaioCircunf;
		
		//Sa�da de dados
		System.out.println(RandNumber1);
		System.out.println(RandNumber2);
		System.out.println(RandLetter);
		System.out.println(DecNumber);
		System.out.println(RandLetter + " de " + MyName);
		System.out.println("David � gay? E a resposta �: ..... >>> " + isGay);
		
		System.out.printf("Number 1: %d \n",RandNumber1);
		System.out.printf("Number 2: %d \n",RandNumber2);
		System.out.printf("Number 3: %.2g \n",DecNumber); //%.2f
		System.out.printf("Numbers: %d \t %d",RandNumber1, RandNumber2);
		System.out.printf("\nMeu nome � %s.\n",MyName);
		System.out.printf("O comprimento da circunfer�ncia vale %.2f.",CompCircunf);
		
	}
}
