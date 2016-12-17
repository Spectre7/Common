package it.dstech;

public class Libro {

	protected int numPagine;

	public Libro(int num) {
		numPagine = num;
	}

	public void pageMessage() {
		System.out.println("Numero di pagine: " + numPagine);
	}

}
