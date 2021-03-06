package hierarquia.Loja;

public class PenDrive extends Produto{
	private int memoria;
	
	public PenDrive(int codigoDeBarras, String nome, double preco, int memoria) {
		super(codigoDeBarras, nome, preco);
		
		this.memoria = memoria;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public String toString() {
		return "Pendrive\n" + "Marca do pendrive: " + getNome() + "\nPre?o do pendrive: R$" + getPreco() + "\nMem?ria do pendrive: " + memoria + "GB";
	}

	@Override
	public int compareTo(Produto o) {
		if(getPreco() > o.getPreco()) {
			return 1; //Avan?a a ordem do objeto, deixando-o na frente
		} else if(getPreco() < o.getPreco()) {
			return -1; //Recua a ordem do objeto, deixando-o atr?s
		} else {
			return 0; //Mant?m o objeto na mesma ordem
		}
	}


}
