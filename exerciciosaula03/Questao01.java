package exerciciosaula03;

public class Questao01 {

	public static void main(String[] args) {
		boolean prop_01, prop_02;
		

		System.out.println("\n------------------------");
		System.out.println("\nTabela Verdade E (AND)");
		System.out.println("-> 'F' E 'F': "+(false && false));
		System.out.println("-> 'V' E 'F': "+(true && false));
		System.out.println("-> 'F' E 'V': "+(false && true));
		System.out.println("-> 'V' E 'V': "+(true && true));
		System.out.println("\n------------------------");
		System.out.println("\nTabela Verdade OU (OR)");
		System.out.println("-> 'F' OU 'F': "+(false || false));
		System.out.println("-> 'V' OU 'F': "+(true || false));
		System.out.println("-> 'F' OU 'V': "+(false || true));
		System.out.println("-> 'V' OU 'V': "+(true || true));
		System.out.println("\n------------------------");
		
		
	}
	
}
