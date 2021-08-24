package aula3;

import java.util.ArrayList;

/*
 * 
 * Classe que especifica a criação e manipulação de Arrays
 * 
 * */
public class Vetores {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		System.out.println(numeros[2]);
		
		char consoantes[]= {'b', 'c', 'd','f', 'g'};
		
		System.out.println(consoantes[4]);
		
		ArrayList<Integer> pares = new ArrayList<>(); //Integer ou Double ou Float

		//adicionar valores ao ArrayList<>
		pares.add(2);
		pares.add(6);
		//posição do ArrayList<> e o  valor que deseja inserir
		pares.add(1, 4); 
		pares.add(24);
		pares.add(10);
		pares.add(8);
		//Ordenar em ordem crescente
		pares.sort(null);
		//Remover o index desejado do ArrayList<>
		pares.remove(4);
		
		System.out.println(pares);
		System.out.println(pares.get(4));//para escolher uma posição no ArrayList<>, terá que utilizar o método get()
	}
}
