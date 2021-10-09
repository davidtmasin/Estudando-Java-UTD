package IntefaceFuncaoAltaOrdem;

import java.util.Scanner;

//Este exemplo, s� funciona para uma interface que possui apenas 01 m�todo

public class FuncoesAltaOrdem {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		int num1 = leitor.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int num2 = leitor.nextInt();
			
		FuncoesAltaOrdem fao = new FuncoesAltaOrdem();
		
		//Express�es lambda
		Operacao soma = (int a, int b) -> a+b;
		Operacao subtracao = (int a, int b) -> a-b;
		Operacao divisao = (int a, int b) -> a/b;
		Operacao multiplicacao = (int a, int b) -> a*b;
		
		/*
		System.out.println("O resultado da soma: " + calcular(soma, num1, num2));
		System.out.println("O resultado da subtra��o: " + calcular(subtracao, num1, num2));
		System.out.println("O resultado da divis�o: " + calcular(divisao, num1, num2));
		System.out.println("O resultado da multiplica��o: " + calcular(multiplicacao, num1, num2));
		*/
		
		System.out.println("O resultado da soma: " + fao.calcular(soma, num1, num2));
		System.out.println("O resultado da subtra��o: " + fao.calcular(subtracao, num1, num2));
		System.out.println("O resultado da divis�o: " + fao.calcular(divisao, num1, num2));
		System.out.println("O resultado da multiplica��o: " + fao.calcular(multiplicacao, num1, num2));
	}
	
	//public static double calcular(Operacao op, int a, int b) {
	public double calcular(Operacao op, int a, int b) { //Vou precisar instanciar um objeto para poder chamar o m�todo calcular
		return op.executar(a, b);
	}
}

interface Operacao{
	public double executar(int a, int b);
}
