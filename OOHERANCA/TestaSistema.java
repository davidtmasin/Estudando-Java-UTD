package OOHERANCA;

public class TestaSistema{

	public static void main(String[] args) {

		Aluno a1 = new Aluno(122, 
							 "Jailson Mendes", 
							 33, 
							 "85989647993", 
							 "Rua abc, 123",
							 "Java");
		
		a1.atribuirNotas(0, 10);
		a1.atribuirNotas(1, 10);
		a1.atribuirNotas(2, 10);
		a1.imprimirNotas();
		System.out.println(a1.toString());
		
		Funcionario f1 = new Funcionario(666, "Xablau",25, 
										"8540028922", "Rua da Cachorra Maga, nº 333", 
										"TI", "Analista de Testes", 3500);
		
		System.out.println(f1.toString());
		
		
		
	}

}
