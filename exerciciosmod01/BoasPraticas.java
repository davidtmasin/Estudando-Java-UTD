package exerciciosmod01;
/*
 * Fa�a um programa que imprima uma lista num�rica de 
 * boas pr�ticas para a vida e/ ou para o aprendizado 
 * de programa��o. Eis alguns exemplos (bole tamb�m os seus):
1 � Tenha um sono regular.
2 � Pratique exerc�cios.
3 � Separe algumas horas do seu dia para o estudo.
4 � Aplique o m�todo POMODORO.
5 � Desenvolva projetos.
 * 
 * 
 * */

public class BoasPraticas {

	public static void main(String[] args) {
		
		String itensEnumerados[] = {
				"1: Elaborar um cronograma de estudo",
				"2: Cumprir a jornada m�nima de estudo",
				"3: Sempre praticar o que aprendeu",
				"4: Desistir JAMAIS!!!",
				"5: Participar de grupos de estudos",
				"6: Ficar antenados aos eventos de imers�o"
		};
		
		System.out.println("Lista de boas pr�ticas para aprender programa��o");
		
		for(int i = 0; i<=5; i++) {
			System.out.println(itensEnumerados[i]);
		}
	}
	
}
