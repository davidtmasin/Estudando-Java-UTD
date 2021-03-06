package OO;

public abstract class Funcionario {
	
	private long matricula;
	private String nome;
	//private String setor;
	private String cargo;
	private double salario;
	private static long numFuncionario; //atributo compartilhado por todas as classes herdadeiras de Funcion?rio
	
	public Funcionario() {
		
		numFuncionario++;
	}
	
	public Funcionario(long matricula, String nome, String cargo, double salario) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;	
		
		numFuncionario++;
		
	}
	
	public long getMatricula() {
		return matricula;
	}
	

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCargo() {
		return cargo;
	}
	
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	public double getSalario() {
		return salario;
	}
	
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//M?todo ? uma fun??o aplicada a um objeto
	public static void exibirNumFuncionarios() { //Quando se acrescenta static a um m?todo, ser? poss?vel chamar a classe.metodo() sem usar o objeto.metodo()
		System.out.println(numFuncionario);
	}
	
	
}
