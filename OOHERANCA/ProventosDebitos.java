package OOHERANCA;

public interface ProventosDebitos {
	
	public abstract double calcularBeneficios();
	public abstract double calcularTaxas(double salario);
	public abstract double calcularSalario(double beneficios, double taxas);

}
