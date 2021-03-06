package javaOO.LambdasStreams;

import java.util.Arrays;
import java.util.List;

public class UsingFunctionalProgramming {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<String> students = Arrays.asList("David", "Jos?", "Jubileu", 
											  "Coelho", "Karine", "Mariana", 
											  "Sophia", "Carol","Raquel", "Maria", 
											  "Sarah", "Bernardo");
		
		//Exibindo apenas 03 resultados da lista
		System.out.println("--------------------------------------------------------------");
		System.out.println("Exibindo apenas 03 resultados da lista");
		System.out.println("--------------------------------------------------------------");
		students.stream().limit(3).forEach(student -> System.out.println(student));
		
		//Exibindo apenas os nomes, da lista, que t?m a letra "a"
		System.out.println("--------------------------------------------------------------");
		System.out.println("Exibindo apenas os nomes, da lista, que t?m a letra 'a'");
		System.out.println("--------------------------------------------------------------");
		students.stream().filter(student -> student.contains("a")).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");

		//Mostrando os nomes da lista que t?m a letra "e"
		System.out.println("Mostrando os nomes da lista que t?m a letra 'e'");
		System.out.println("--------------------------------------------------------------");
		String verficacao = students.stream().filter(student -> student.contains("e")).reduce((acumulador, student) -> acumulador+="\n"+student).orElse("N?o h? alunos com a letra 'i' no nome");
		System.out.println(verficacao);
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Fazendo uma fun??o contendo IF-ELSE dentro de map()");
		System.out.println("- Se n?mero maior que 5, ser? multiplicado por 10");
		System.out.println("- Caso contr?rio, soma 2 ao n?mero");
		System.out.println("--------------------------------------------------------------");

		numbers.stream().map(number ->{
			if(number>5) {
					return number*10;					
				} else {
					return number+2;
				}
		}).forEach(System.out::println);;
		
		System.out.println("--------------------------------------------------------------");		
		
		
	}

}
