package it.dstech;

public class TestLibroVocabolario {
	
	public static void main(String[] args) {
		
		Libro b;

		b = new Libro(1500);
		System.out.println("*********\n* LIBRO *\n*********");
		b.pageMessage();

		b = new Vocabolario(1500, 52500);
		System.out.println("***************\n* VOCABOLARIO *\n***************");
		 
//		 il comando:
//		 b.definitionMessage();
//		 darebbe un errore in compilazione:
//		 b e' una variabile di tipo Libro, ma definitionMessage()
//		 un metodo della sottoclasse Vocabolario.
//		 dato che il "tipo effettivo" di b e' Vocabolario, possiamo fare
//		 un cast:

		((Vocabolario) b).definitionMessage();
	}
}
