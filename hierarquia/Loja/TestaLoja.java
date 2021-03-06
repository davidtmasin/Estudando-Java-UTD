package hierarquia.Loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLoja {
	public static void main(String [] args) {
		
		Livro livro1 = new Livro(616, "A lenda do chupa-cabra", 225.85, "Jubileu da Silva Xablau");
		Livro livro2 = new Livro(666, "A permiss?o digital", 65.85, "Titio Mark");
		Livro livro3 = new Livro(166, "A dedilhada fatal", 165.99, "Nando Moura");
		
		PenDrive penDrive1 = new PenDrive(777, "Kingstom", 80, 16);
		PenDrive penDrive2 = new PenDrive(727, "Multilaser", 65, 16);
		PenDrive penDrive3 = new PenDrive(777, "ScanDisk", 88, 16);
		
		//System.out.println(livro1.equals(livro2));
		
		/*
		System.out.println(livro1.toString());
		System.out.println("-----------------------------------------");
		System.out.println(livro2.toString());
		*/
		
		List<Livro> livros = new ArrayList<>(); 
		
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		
		Collections.sort(livros);
		
		
		System.out.println("Pendrives ordenados do menor pre?o para o maior");
		System.out.println("-----------------------------------------");
				
		for(Livro book : livros ) {
			System.out.println(book);
			System.out.println("-----------------------------------------");
			
		}
		
		System.out.println();

		List<PenDrive> penDrives = new ArrayList<>(); 
		
		penDrives.add(penDrive1);
		penDrives.add(penDrive2);
		penDrives.add(penDrive3);
		
		System.out.println("Livros ordenados do menor pre?o para o maior");
		System.out.println("-----------------------------------------");
				
		for(PenDrive pdrive : penDrives ) {
			System.out.println(pdrive);
			System.out.println("-----------------------------------------");
			
		}		 
	}	
}
