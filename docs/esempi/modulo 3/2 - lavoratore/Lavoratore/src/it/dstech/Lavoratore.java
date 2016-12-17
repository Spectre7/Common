package it.dstech;

public class Lavoratore {

	protected String nome;
	protected int livello;
	protected double stipendio = 1500;

	public Lavoratore(String n, int l) {
		nome = n;
		livello = l;
	}

	public void modificaStipendio(double s) {
		stipendio = s;
	}

	public void stampaStipendio() {
		System.out.println("Lo stipendio e': " + stipendio);
	}

}
