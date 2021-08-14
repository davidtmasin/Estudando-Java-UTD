package exerciciosmod01;
/*
 * 
 * Classe de explica��o e demonstra��o dos operadores
 * 
 * vers�o 1.0
 * 
 * autor: David Teixeira
 * 
 * */


public class Operadores {

	public static void main(String[] args) {
		//Declara��o de vari�veis
		int num1=10, num2=8;	
		
		//Operadores Aritm�ticos + - * / %
		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int produto = num1 * num2;
		double divisao = (double)num1 / num2; //Feito um cast aqui para evitar que ocorra o truncamento dos n�meros inteiros.
		int modulo = num1 % num2;
		
		//Apresenta��o do resultado
		System.out.println("Operadores aritm�ticos");
		System.out.printf("O resultado da soma vale: %d.\n",+soma);
		System.out.printf("O resultado da subtra��o vale: %d.\n",+subtracao);
		System.out.printf("O produto vale: %d.\n",produto);
		System.out.printf("A divis�o vale: %.2f.\n",divisao);
		System.out.printf("O m�dulo vale: %d.\n", modulo);
		
		
		//Operadores de incremento e decremento ++ --
		System.out.println("\nOperadores de incremento e decremento");
		System.out.println(++num1);//pr�-incremento, soma logo de in�cio.
		System.out.println(num1++); //pos-incremento, s� soma +1 ao final
		System.out.println(num1);
		
		System.out.println(num1+=10);
		System.out.println(num1*=3);
		System.out.println(num1/=4);
		System.out.println(num1);
		

		//Operadores de relacionamento = != < > <= >=	
		System.out.println("\nOperadores de relacionamento");
		System.out.println(num1 = num2);
		System.out.println(num1 != num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		
		
		//Operadores l�gicos && ||
		System.out.println("\nOperador AND");
		System.out.println(false&&false);
		System.out.println(false&&true);
		System.out.println(true&&false);
		System.out.println(true&&true);
		
		System.out.println("\nOperador OR");
		System.out.println(false||false);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(true||true);
	}
	
}

