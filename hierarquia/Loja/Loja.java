package hierarquia.Loja;

public class Loja {

	private Livro livro;
	private PenDrive penDrive;
	
	public Loja() {}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public PenDrive getPenDrive() {
		return penDrive;
	}

	public void setPenDrive(PenDrive penDrive) {
		this.penDrive = penDrive;
	}	
	
}
