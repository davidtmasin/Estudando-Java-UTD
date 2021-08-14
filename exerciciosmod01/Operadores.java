package exerciciosmod01;
/*
 * 
 * Classe de explicação e demonstração dos operadores
 * 
 * versão 1.0
 * 
 * autor: David Teixeira
 * 
 * */


public class Operadores {

	public static void main(String[] args) {
		//Declaração de variáveis
		int num1=10, num2=8;	
		
		//Operadores Aritméticos + - * / %
		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int produto = num1 * num2;
		double divisao = (double)num1 / num2; //Feito um cast aqui para evitar que ocorra o truncamento dos números inteiros.
		int modulo = num1 % num2;
		
		//Apresentação do resultado
		System.out.println("Operadores aritméticos");
		System.out.printf("O resultado da soma vale: %d.\n",+soma);
		System.out.printf("O resultado da subtração vale: %d.\n",+subtracao);
		System.out.printf("O produto vale: %d.\n",produto);
		System.out.printf("A divisão vale: %.2f.\n",divisao);
		System.out.printf("O módulo vale: %d.\n", modulo);
		
		
		//Operadores de incremento e decremento ++ --
		System.out.println("\nOperadores de incremento e decremento");
		System.out.println(++num1);//pré-incremento, soma logo de início.
		System.out.println(num1++); //pos-incremento, só soma +1 ao final
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
		
		
		//Operadores lógicos && ||
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

