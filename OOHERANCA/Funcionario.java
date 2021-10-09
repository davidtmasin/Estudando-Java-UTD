package OOHERANCA;

public class Funcionario extends Pessoa implements ProventosDebitos{
	
	private double salario;
	private String cargo;
	private String setor;
	
	//Construtor sem a herança, usa o public
	public Funcionario(String setor, String cargo, double salario) {
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Funcionario(int registro, String nome, int idade, String telefone, String endereco, String setor, String cargo, double salario){
		super(registro, nome, idade, telefone, endereco); 
		
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
		
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "\n[Funcionario]\nRegistro: "+ getRegistro() + "\nNome: " + getNome() + 
				"\nTelefone: " + getTelefone() + "\nEndereco: "+ getEndereco() + 
				"\nIdade: " + getIdade() + "\nSalário: " + salario + 
				"\nCargo: " + cargo + "\nSetor: " + setor;
		
		
	}

	@Override
	public double calcularBeneficios() {

		double cestaBasica = 647.87;
		double planoDeSaude = 174.87;
		double valeRefeicao = 411;
		
		return cestaBasica + valeRefeicao + valeRefeicao;
	}

	@Override
	public double calcularTaxas(double salario) {

		double valeTransporte = salario * (0.06);
		
		double FGTS = salario * (0.08);

		return valeTransporte + FGTS;
	}

	@Override
	public double calcularSalario(double beneficios, double taxas) {

		return salario + beneficios - taxas;
	}
	
	
	
}
