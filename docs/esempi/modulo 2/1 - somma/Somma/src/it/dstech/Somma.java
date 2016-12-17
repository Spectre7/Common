package it.dstech;

public class Somma {

	public static int sommaWhile() {

		int somma = 0;
		int i = 0;

		while (i <= 9) {
			if (i % 3 == 0) {
				somma = somma + i;
			}
			i++;
		}
		System.out.println("La somma degli interi da 0 a 9 divisibili per 3 utilizzando il while e' " + somma);
		return somma;
	}

	public static int sommaFor() {

		int somma = 0;
		int n = 9;

		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				somma = somma + i;
			}
		}
		System.out.println("La somma degli interi da 0 a 9 divisibili per 3 utilizzando il for e' " + somma);
		return somma;
	}

	public static int sommaDoWhile() {

		int somma = 0;
		int i = 0;
		do {
			if (i % 3 == 0) {
				somma = somma + i;
			}
			i++;
		} while (i <= 9);
		System.out.println("La somma degli interi da 0 a 9 divisibili per 3 utilizzando il do while e' " + somma);
		return somma;
	}

	public static void main(String[] args) {

		sommaWhile();
		sommaFor();
		sommaDoWhile();
	}
}