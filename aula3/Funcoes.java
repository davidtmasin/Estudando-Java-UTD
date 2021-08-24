package aula3;

public class Funcoes {
	public static void main(String[] args) {
		//Dentro de um m�todo est�tico, recebe-se apenas fun��es est�ticas
		
		
		//Chamada da fun��o com retorno
		int result = soma(12, 6);
		
		System.out.println(result);
		
		//Chamada da fun��o sem retorno
		quadrado(7);
		
		//Chamada da fun��o com retorno e sem par�metros
		String texto = mensagem();
		System.out.println(texto);
		
		//Chamada da fun��o sem retorno e que n�o recebe par�metros
		olaMundo();
		
		//Operador tern�rio
		
		int nota = 5;
		String resultado = nota>=7?"Voc� foi aprovado!":"Voc� ficou de recupera��o!";
		System.out.println(resultado);
	}
	
	//Fun��o que retorna INT e recebe 02 par�metros
	static int soma(int x, int y) {
		
		return x + y;
	}
	
	//Fun��o sem retorno e recebe par�metro
	static void quadrado(int num) {
		
		System.out.println(num * num);
	}
	
	//Fun��o com retorno e sem par�metros
	static String mensagem() {
		
		return "Hello World!";
	}

	
	//Fun��o que n�o tem par�metros e n�o retorna nada
	static void olaMundo() {
		System.out.println("Desgra�a!");
	}
	
	
}
