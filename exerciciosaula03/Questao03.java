package exerciciosaula03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao03 {
	public static void main(String[] args) {
		int num, cent, dez, unid;
		
		Scanner leitor = new Scanner(System.in);
		
		//System.out.println("Digite o primeiro n�mero: ");
		//num = leitor.nextInt();
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			
		System.out.println("O n�mero digitado foi " + num + ".");
		
		cent = num / 100;
		
		System.out.println(cent + " centena(s).");
		
		dez = (num - cent * 100)  / 10;
		
		System.out.println(dez + " dezena(s).");
		
		//(num - centena * 100) % 10
		unid = num % 10;
		
		System.out.println(unid + " unidade(s).");
		
		System.out.println("O n�mero digitado invertido fica: "+unid+dez+cent);
		
	}
}
