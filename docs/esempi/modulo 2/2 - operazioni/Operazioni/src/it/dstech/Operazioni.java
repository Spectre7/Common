package it.dstech;

import java.util.Scanner;

public class Operazioni {

	private static Scanner input;

	public static int somma(int n1, int n2) {
		int somma = n1 + n2;
		return somma;
	}

	public static int sottrazione(int n1, int n2) {
		int sottrazione = n1 - n2;
		return sottrazione;
	}

	public static int moltiplicazione(int n1, int n2) {
		int moltiplicazione = n1 * n2;
		return moltiplicazione;
	}

	public static double divisione(double n1, double n2) {
		double divisione = n1 / n2;
		return divisione;
	}

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int n1;
		int n2;

		System.out.println("Inserisci il primo numero");
		n1 = input.nextInt();

		System.out.println("Inserisci il secondo numero");
		n2 = input.nextInt();

		int moltiplicazione = moltiplicazione(n1, n2);
		int sottrazione = sottrazione(n1, n2);
		int somma = somma(n1, n2);
		double divisione = divisione(n1, n2);

		System.out.println("Il risultato della somma e' " + somma);
		System.out.println("Il risultato della divisione e' " + divisione);
		System.out.println("Il risultato della moltiplicazione e' " + moltiplicazione);
		System.out.println("Il risultato della sottrazione e' " + sottrazione);
	}
}