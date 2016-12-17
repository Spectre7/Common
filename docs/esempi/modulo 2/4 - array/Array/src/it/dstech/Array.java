package it.dstech;

import java.util.Scanner;

public class Array {

	private static Scanner input;

	public static void main(String[] args) {

		final int L = 5;
		int[] a;
		a = new int[L];
		leggi(a);
		System.out.println("** verifica acquisizione dati **");
		stampa(a);
	}

	public static void leggi(int[] v) {

		input = new Scanner(System.in);

		int i;
		System.out.println("Scrivi " + v.length + " interi");
		for (i = 0; i < v.length; i++)
			v[i] = input.nextInt();
		System.out.println();
	}

	public static void stampa(int[] v) {

		int i;
		System.out.println("Array letto: ");
		for (i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}

}
