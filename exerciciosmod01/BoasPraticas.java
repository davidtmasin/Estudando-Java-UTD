package exerciciosmod01;
/*
 * Faça um programa que imprima uma lista numérica de 
 * boas práticas para a vida e/ ou para o aprendizado 
 * de programação. Eis alguns exemplos (bole também os seus):
1 – Tenha um sono regular.
2 – Pratique exercícios.
3 – Separe algumas horas do seu dia para o estudo.
4 – Aplique o método POMODORO.
5 – Desenvolva projetos.
 * 
 * 
 * */

public class BoasPraticas {

	public static void main(String[] args) {
		
		String itensEnumerados[] = {
				"1: Elaborar um cronograma de estudo",
				"2: Cumprir a jornada mínima de estudo",
				"3: Sempre praticar o que aprendeu",
				"4: Desistir JAMAIS!!!",
				"5: Participar de grupos de estudos",
				"6: Ficar antenados aos eventos de imersão"
		};
		
		System.out.println("Lista de boas práticas para aprender programação");
		
		for(int i = 0; i<=5; i++) {
			System.out.println(itensEnumerados[i]);
		}
	}
	
}
