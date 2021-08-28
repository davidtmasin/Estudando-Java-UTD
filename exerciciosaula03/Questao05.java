package exerciciosaula03;

import java.util.ArrayList;
import java.util.List;

public class Questao05 {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<>();
		//List<Integer> notas = new ArrayList<>();
		
		alunos.add("David");
		alunos.add("Teixeira");
		alunos.add("de Masin");
		
		System.out.println(alunos);
		
		alunos.add("Jubileu");
		
		System.out.println(alunos);
		
		alunos.sort(null);
		
		System.out.println(alunos);
		
		alunos.add(0, "Jailson");
		
		System.out.println(alunos);
		
		alunos.remove("de Masin");
		
		System.out.println(alunos);
		
		System.out.println(alunos.contains("David"));
		System.out.println(alunos.contains("Irineu"));
	}

}
