package it.dstech;

public class Vocabolario extends Libro {

	protected int numDefinizioni;

	public Vocabolario(int numP, int numD) {
		super(numP);
		numDefinizioni = numD;
	}

	public void definitionMessage() {
		super.pageMessage();
		System.out.println("Numero di definizioni: " + numDefinizioni);
		System.out.println("Numero medio di definizioni per pagina: " + numDefinizioni / numPagine);
	}
}