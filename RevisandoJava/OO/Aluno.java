package RevisandoJava.OO;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
	
	private String curso; 
	private List<Double> notas = new ArrayList<>();
	//Se eu quiser que meu array tenha apenas 03 posi??es
	//private List<Double> notas = new Arrays.asList(0.0, 0.0, 0.0);
	
	public Aluno(long id, String nome, String curso) {
		super(id, nome);
		this.curso = curso;
	}

	@Override
	public String toString() {
		
		return "Aluno(a) ID: " + getId()+ "\nNome: " + getNome() + "\nCurso: "+ curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void lancarNotas(double nota) {
		notas.add(nota);
	}
	
	public void verNotas() {
		System.out.println(getNome() + " ");
		for(double nota : notas) {
			System.out.println(nota);
		}		
	}
	
	public void calcularMedia(double AV1, double AV2, double AV3) {

		double media = (AV1+AV2+AV3)/3;
		
		System.out.print("A m?dia do aluno(a) " + getNome());
		System.out.printf(" ? %.1f.",media);
		System.out.println();
				
	}
	
	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	

}
