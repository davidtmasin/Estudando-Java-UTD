package POO;

import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		/*
		double notas [] = {10, 9, 8};
		
		Aluno a1 = new Aluno();
		
		a1.nome = "David";		
		a1.notas = notas;
		a1.faltas = 20;
		a1.laboratorio = "Laboratório B";
		
		System.out.println("-----------------------");*/
		/*
		System.out.println("Aluno(a): "+a1.nome+"\nNotas: "+a1.notas[0]+" "+a1.notas[1]+" "+a1.notas[2]);
		System.out.println("Nº de faltas: "+a1.faltas);
		*/
		
		/*
		a1.imprimirDeclaracao();
		
		System.out.println("-----------------------");
		
		Aluno a2 = new Aluno("Jubileu", notas, 10);
		*/
		
		/*
		System.out.println("Aluno(a): "+a2.nome+"\nNotas: "+a2.notas[0]+" "+a2.notas[1]+" "+a2.notas[2]);
		System.out.println("Nº de faltas: "+a2.faltas);
		*/
		/*
		a2.imprimirDeclaracao();
		
		System.out.println("-----------------------");
		
		Aluno m3 = new Aluno("Sandro", notas, 20, "Laboratório A");
		m3.imprimirDeclaracao();
		
		System.out.println("-----------------------");
		*/
		int faltas;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o nome do aluno(a): ");
		String nome = leitor.nextLine();
		
		Aluno aluno = new Aluno(nome);
		Aluno a2 = new Aluno("Jubileu");
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = leitor.nextDouble();		
		aluno.setNotas(0, nota1);
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = leitor.nextDouble();		
		aluno.setNotas(1, nota2);
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = leitor.nextDouble();		
		aluno.setNotas(2, nota3);
		
		System.out.print("Digite a quantidade de faltas: ");
		faltas = leitor.nextInt();		
		aluno.setFaltas(faltas);
		
		aluno.setMedia(nota1, nota2, nota3);
		
		//aluno.setNotas(1, 10);
		//aluno.setNotas(2, 10);
		
		//System.out.println(aluno.getNome());
		//aluno.imprimirDeclaracao();
		aluno.imprimirDeclaracao();
		//System.out.println(aluno.getFaltas());
		System.out.println(aluno.toString());
		
		//System.out.println(aluno.quantidadeAlunos);
		Aluno.getQuantidadeAlunos();
	}

}
