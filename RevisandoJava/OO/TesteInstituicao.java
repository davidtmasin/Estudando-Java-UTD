 package RevisandoJava.OO;

import java.util.Scanner;

public class TesteInstituicao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Aluno aluno1 = new Aluno(1, "Jailson", "JAVA");
		Aluno aluno2 = new Aluno(2, "Paulo", "JAVAscript");
		/*
		List<Aluno> sala = new ArrayList<>();
		sala.add(aluno1);
		sala.add(aluno2);
		
		System.out.println("-------------------------");
		
		for(Aluno aluno : sala) {
			System.out.println(aluno);
			System.out.println("-------------------------");
		}
		*/
		System.out.print("Informe a primeira nota: ");
		double n1 = leitor.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double n2 = leitor.nextDouble();
		System.out.print("Informe a terceira nota: ");
		double n3 = leitor.nextDouble();
		
		aluno1.lancarNotas(n1);
		aluno1.lancarNotas(n2);
		aluno1.lancarNotas(n3);
		aluno1.calcularMedia(n1, n2, n3);
		aluno1.verNotas(); 
	}

}
