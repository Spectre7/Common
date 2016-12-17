package it.dstech;

import java.util.Scanner;

public class SommaScanner {

	private static Scanner q;

	public static int sommaWhile() {

		q = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int somma = 0;
		int i = 0;
		int n;
		n = q.nextInt();

		while (i <= n) {
			if (i % 3 == 0) {
				somma = somma + i;
			}
			i++;
		}
		System.out.println("La somma degli interi da 0 a " + n + " divisibili per 3 utilizzando il while e' " + somma);
		return somma;
	}

	public static int sommaFor() {

		q = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int somma = 0;
		int n;
		n = q.nextInt();

		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				somma = somma + i;
			}
		}
		System.out.println("La somma degli interi da 0 a " + n + " divisibili per 3 utilizzando il for e' " + somma);
		return somma;
	}

	public static int sommaDoWhile() {

		q = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int somma = 0;
		int i = 0;
		int n;
		n = q.nextInt();
		do {
			if (i % 3 == 0) {
				somma = somma + i;
			}
			i++;
		} while (i <= n);
		System.out.println("La somma degli interi da 0 a 9 divisibili per 3 utilizzando il do while e' " + somma);
		return somma;
	}

	public static void main(String[] args) {

		sommaWhile();
		sommaFor();
		sommaDoWhile();
	}

}
