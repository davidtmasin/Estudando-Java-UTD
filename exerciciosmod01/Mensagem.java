package exerciciosmod01;
/*
 * 
 * Escreva um programa que imprima um poema
 * 
 * */
import java.util.Random; //Usar a biblioteca  Random para gerar n�s alet�rios
public class Mensagem {
	public static void main(String[] args) {
		
		String listaPoema[] = {
				"O menino quer um burrinho\r\n"
				+ "para passear.\r\n"
				+ "Um burrinho manso,\r\n"
				+ "que n�o corra nem pule,\r\n"
				+ "mas que saiba conversar.",
				
				"Eu sou pequeno, me dizem,\r\n"
				+ "e eu fico muito zangado.\r\n"
				+ "Tenho de olhar todo mundo\r\n"
				+ "com o queixo levantado.",
		};
		
		//instanciar um objeto da classe Random 
		//usando o construtor padr�o
        Random poema = new Random();

      //n�mero inteiro aleat�rio entre 0 e 1
       
        System.out.println(listaPoema[poema.nextInt(2)]);
        
		
		
	}
}
