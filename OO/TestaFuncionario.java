package OO;

public class TestaFuncionario {

	public static void main(String[] args) {

		//Funcionario f1 = new Funcionario(101011001, "David Teixeira de Masin", "Analista de Testes 3", 3500);
		FuncionarioOperacional f1 = new FuncionarioOperacional(101011001, "David Teixeira de Masin", 
															   "Analista de Testes 3", 3500, 
															   "Tecnologia da Informação");
		/*
		f1.setMatricula((long) 101011001);		
		f1.setNome("David Teixeira de Masin");
		f1.setCargo("Analista de Testes 3");
		f1.setSalario(3500);
		*/
		
		System.out.println("Matrícula funcional: " + f1.getMatricula());
		System.out.println("Nome do funcionário: " + f1.getNome());
		System.out.println("Cargo do funcionário: " + f1.getCargo());
		System.out.println("Setor do funcionário: " + f1.getSetor());
		System.out.println("Salário do funcionário: R$" + f1.getSalario());
		
		FuncionarioOperacional f2 = new FuncionarioOperacional();
		FuncionarioOperacional f3 = new FuncionarioOperacional();
		
		//Funcionario.exibirNumFuncionarios();
		FuncionarioOperacional.exibirNumFuncionarios();
		
	}

}
