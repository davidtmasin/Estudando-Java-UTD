package OO;

public class FuncionarioOperacional extends Funcionario implements Gratificacao, Descontos{
	
	private String setor;
	
	public FuncionarioOperacional() {
		super();
	}
	
	public FuncionarioOperacional(long matricula, String nome, String cargo, double salario, String setor) {
		super(matricula, nome, cargo, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return this.setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public double PL() {
		return this.getSalario() * 1.5;
	}
	
	public double auxilioCreche() {
		return 200.0;
	}
	
	public double auxilioViagem() {
		return 0.0;
	}
	
	public double FGTS() {
		return this.getSalario()*0.09;
	}
	
	public double valeAlimentacao() {
		return this.getSalario()*0.05;
	}
	
	public double valeTransporte() {
		return this.getSalario()*0.06;
	}
	
	public double INSS() {
		
		if(this.getSalario() <= 1100 ) {
			return this.getSalario()*0.075;
		} else if(this.getSalario() > 1100 || this.getSalario() <= 2203.48) {
			return this.getSalario()*0.09;
		} else if(this.getSalario() > 2203.48 || this.getSalario() <= 3305.22) {
			return this.getSalario()*0.12;
		} else {
			return this.getSalario()*0.14;
		}
	}
	
public double IRPF() {
		
		if(this.getSalario() >= 1903.99 || this.getSalario() <= 2826.65) {
			return this.getSalario()*0.075;
		} else if(this.getSalario() > 2826.65 || this.getSalario() <= 3751.05) {
			return this.getSalario()*0.15;
		} else if(this.getSalario() > 3751.05 || this.getSalario() <= 4664.68) {
			return this.getSalario()*0.225;
		} else {
			return this.getSalario()*0.275;
		}
	}
}
