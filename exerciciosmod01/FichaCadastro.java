package exerciciosmod01;
/*
 * 
 * Utilizando as variáveis e constantes anteriormente criadas faça um programa 
 * que imprima a seguinte mensagem no console. Utilize o System.out.println(). 
 * 
 * */
public class FichaCadastro {

	public static void main(String[] args) {
		
		final String INSTITUICAO = "UTD";
		String nome="Osvaldo", curso="JAVA", modalidade="EAD";
		int idade=34;
		char sexo='M';
		
		System.out.println("=============="+INSTITUICAO+"==============");
		System.out.println("=======Ficha de cadastro=======");
		System.out.println("Nome: "+nome+" idade: "+idade);
		System.out.println("sexo: "+sexo);
		System.out.println("curso: "+curso+"    modalidade: "+modalidade);
	}
		
}
