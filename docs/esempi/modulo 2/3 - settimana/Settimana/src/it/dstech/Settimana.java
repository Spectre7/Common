package it.dstech;

import java.util.Scanner;

public class Settimana {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int giorno = 0;

		do {
			System.out.println("Inserisci numero da 1 a 7 per stampare il nome del giorno per esteso, oppure 8 per terminare:");
			giorno = input.nextInt();
			Giorno(giorno);
		} while (giorno != 8);
		System.out.println("Grazie per l'utilizzo");
	}

	public static void Giorno(int giorno) {
		switch (giorno) {

		case 1:
			System.out.println("Lunedi");
			break;
		case 2:
			System.out.println("Martedi");
			break;
		case 3:
			System.out.println("Mercoledi");
			break;
		case 4:
			System.out.println("Giovedi");
			break;
		case 5:
			System.out.println("Venerdi");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
			break;

		}

	}
}