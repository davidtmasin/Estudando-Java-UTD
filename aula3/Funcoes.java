package aula3;

public class Funcoes {
	public static void main(String[] args) {
		//Dentro de um método estático, recebe-se apenas funções estáticas
		
		
		//Chamada da função com retorno
		int result = soma(12, 6);
		
		System.out.println(result);
		
		//Chamada da função sem retorno
		quadrado(7);
		
		//Chamada da função com retorno e sem parâmetros
		String texto = mensagem();
		System.out.println(texto);
		
		//Chamada da função sem retorno e que não recebe parâmetros
		olaMundo();
		
		//Operador ternário
		
		int nota = 5;
		String resultado = nota>=7?"Você foi aprovado!":"Você ficou de recuperação!";
		System.out.println(resultado);
	}
	
	//Função que retorna INT e recebe 02 parâmetros
	static int soma(int x, int y) {
		
		return x + y;
	}
	
	//Função sem retorno e recebe parâmetro
	static void quadrado(int num) {
		
		System.out.println(num * num);
	}
	
	//Função com retorno e sem parâmetros
	static String mensagem() {
		
		return "Hello World!";
	}

	
	//Função que não tem parâmetros e não retorna nada
	static void olaMundo() {
		System.out.println("Desgraça!");
	}
	
	
}
