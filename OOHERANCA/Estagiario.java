package OOHERANCA;

public class Estagiario extends Funcionario implements ProventosDebitos{
	private String cursoFaculdade;
	private String cargaHoraria;
	
	
	public Estagiario(int registro, String nome, int idade, String telefone, String endereco, String setor,
			String cargo, double salario, String cursoFaculdade, String cargaHoraria) {
		super(registro, nome, idade, telefone, endereco, setor, cargo, salario);
		
		this.cursoFaculdade = cursoFaculdade;
		this.cargaHoraria = cargaHoraria;
		
	}
	
	
	

	public String getCursoFaculdade() {
		return cursoFaculdade;
	}



	public void setCursoFaculdade(String cursoFaculdade) {
		this.cursoFaculdade = cursoFaculdade;
	}



	public String getCargaHoraria() {
		return cargaHoraria;
	}



	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}




	@Override
	public double calcularBeneficios() {
		
		double valeRefeicao = 205.50;		
		double valeTransporte = 2.8*30;
		
		return valeRefeicao + valeTransporte;
	}

	@Override
	public double calcularTaxas(double salario) {
		
		double FGTS = salario * 0.06;
		
		return FGTS;
	}

	@Override
	public double calcularSalario(double beneficios, double taxas) {

		return getSalario() + beneficios - taxas;
	}
	
	
	
}
