package aula3;
/*
 * Classe explicativa sobre as expressões aritméticas
 * 
 * versão: 1.0
 * 
 * autor: David Teixeira
 * 
 * */
public class ExpressoesAritmeticas {

	public static void main(String[] args) {
		
		int resultado1 = (10 + 2) * 3 / 2;
		
		boolean resultado2 = 27 + 40 > 20 + 100 - 20;
		
		boolean resultado3 = 30 == 3 * 10 && 50 < 15;
		
		double potencia = Math.pow(resultado1, 1.5);
		
		System.out.println(resultado1);
		
		System.out.println(resultado2);
		
		System.out.println(resultado3);
		
		System.out.println(potencia);
		
		System.out.println(Math.ceil(potencia));
		System.out.println(Math.floor(potencia));
		System.out.println(Math.round(potencia));
	}
}
