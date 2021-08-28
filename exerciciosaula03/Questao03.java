package exerciciosaula03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao03 {
	public static void main(String[] args) {
		int num, cent, dez, unid;
		
		Scanner leitor = new Scanner(System.in);
		
		//System.out.println("Digite o primeiro número: ");
		//num = leitor.nextInt();
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			
		System.out.println(num);
		
	}
}
