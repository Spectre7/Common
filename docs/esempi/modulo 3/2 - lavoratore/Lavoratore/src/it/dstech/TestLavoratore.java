package it.dstech;

import java.util.Scanner;

public class TestLavoratore {

	private static Scanner q;

	public static void main(String[] args) {

		q = new Scanner(System.in);

		Lavoratore A;
		System.out.print("Inserisci nome: ");
		String n = q.nextLine();

		System.out.print("Inserisci livello: ");
		int l = q.nextInt();

		System.out.print("Hai gli straordinari pagati?(s/n)");
		String v = q.next();

		if ((v.equals("s")) || (v.equals("S"))) {
			System.out.print("Inserisci numero ore straordinario: ");
			int o = q.nextInt();
			A = new LavoratoreConStraordinariPagati(n, l, o);
		} else
			A = new Lavoratore(n, l);

		A.stampaStipendio();
	}
}
