package aula1;
/*
 * TREINANDO UM PROGRAMA BÁSICO EM JAVA
 * CONHECIMENTO ADQUIRIDO NA AULA DO CURSO DE JAVA DA UTD
 * PROF. OSVALDO
 *
 */

public class OlaMundo {

	public static void main(String[] args) {
		
		
		//Declaração de variáveis 	
		int RandNumber1 = 1024, RandNumber2 = 2048;
		char RandLetter = 'D';
		double DecNumber = 10.01; //float DecNumber = 10.01f
		String MyName = "David";
		boolean isGay = false;
		double CompCircunf;
		double RaioCircunf = 10;
		
		//Declaração de constantes
		final double PI = 3.14;
		
		//Processamento de dados
		RandNumber1 = RandNumber2 * 2;
		DecNumber = (((RandNumber1 * DecNumber) / 2) * 5) - 14800;		
				
		CompCircunf = 2*PI*RaioCircunf;
		
		//Saída de dados
		System.out.println(RandNumber1);
		System.out.println(RandNumber2);
		System.out.println(RandLetter);
		System.out.println(DecNumber);
		System.out.println(RandLetter + " de " + MyName);
		System.out.println("David é gay? E a resposta é: ..... >>> " + isGay);
		
		System.out.printf("Number 1: %d \n",RandNumber1);
		System.out.printf("Number 2: %d \n",RandNumber2);
		System.out.printf("Number 3: %.2g \n",DecNumber); //%.2f
		System.out.printf("Numbers: %d \t %d",RandNumber1, RandNumber2);
		System.out.printf("\nMeu nome é %s.\n",MyName);
		System.out.printf("O comprimento da circunferência vale %.2f.",CompCircunf);
		
	}
}
