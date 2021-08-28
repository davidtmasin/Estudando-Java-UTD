package exerciciosaula03;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		int num1, num2, maior;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		num1 = leitor.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = leitor.nextInt();
		
		maior = ((num1 + num2) + Math.abs(num1-num2))/2;
		
		System.out.println("O maior número é: "+maior);
	}

}
