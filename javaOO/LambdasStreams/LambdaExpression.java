package javaOO.LambdasStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		//Lambda Expression ? um recurso do Java 8 que implementa
		//a programa??o funcional
		//Presente nas fun??es de alta ordem
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Teca");
		lista.add("Tereza");
		lista.add("Calada");
		lista.add("Nenhuma");
		lista.add("Jubileu");
		
		//System.out.println(lista.contains("Jubileu"));
		//System.out.println(lista.get(3));
		//System.out.println(lista.isEmpty());
		//System.out.println(lista.indexOf("Calada"));
		
		/*
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		
		//Usando iterator para percorrer uma lista
		System.out.println("-------------------------------------------------------------------------");
		Iterator<String> iterator = lista.iterator();
		System.out.println("Percorrendo e imprimindo todos os elementos de uma lista usando Iterator");
		System.out.println("-------------------------------------------------------------------------");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------------------------------------------------------------------------");

		*/
		
		//stream pega uma lista e retorna uma sequ?ncia de dados
		//.filter
		//.map -> recebe uma fun??o, vai mapar toda uma cole??o e far? a a??o de acordo com a fun??o que recebeu
		//.reduce
						//item -> fun??o
		String resultadoTxt = lista.stream()
		
		//Serve para pular posi??es da stream
		//.skip(2)
		//.limit(2) //Limita o resultado a ser exibido, no exemplo, at? 02 alunos
		.filter(pessoa -> pessoa.equals("Tecazoide")) //Predicate > usa uma fun??o com teste l?gico que retorna um Optional
		
		//Percorre toda a stream, recebe o par?metro, cada item do array, 
		//e concatena com o texto entre as aspas, ao final jogo para o forEach que tem o consumer
		.map(pessoa -> "Aluno(a): " + pessoa)
		.reduce((acumulator, pessoa) -> acumulator+=""+pessoa)
		.orElse("Infelizmente n?o consegui localizar a pessoa informada.");
		
		//Vai percorrer a lista e imprimir todos os elementos presentes nela
		//.forEach(pessoa -> System.out.println(pessoa)); //forEach recebe um consumer (o consumer recebe um par?metro e retorna nada)
		
		//Forma mais resumida do forEach
		//.forEach(System.out::println); //Chamou a classe System.out e ela j? entende que tem que imprimir cada ocorr?ncia da stream
		System.out.println(resultadoTxt);
		
		System.out.println("-------------------------------------------------------------------------");

		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		
		int resultado = numeros.stream()
			.filter(number -> number%2==0)		
		//	.map(number -> Math.pow(number, 2))
		//	.forEach(System.out::println);
			.reduce((acumulador, number) -> acumulador+=number)//Recebe dois par?metros, Binary Operation, o acumulador e outro par?metro
			.get(); //Retorna algo que existe ou uma Exception Error
		
		System.out.println(resultado);
		
	}

}
