package exerciciosmod01;
/*
 * Elabore um programa que escreve seu nome completo na primeira linha,
 * seu endereço na segunda, e o CEP e telefone na terceira.
 * 
 * 
 * */
public class Etiqueta {

	public static void main(String[] args) {
		
		String nomeCompleto ="David Teixeira de Masin";
		String enderecoCompleto = "Rua Coelho Neto, nº 1000, apto 04";
		String cep = "60336210";
		String telefone ="85 98964-7993";
		
		System.out.println(nomeCompleto);
		System.out.println(enderecoCompleto);
		System.out.println(cep + " | " +telefone);
		
	}
}
