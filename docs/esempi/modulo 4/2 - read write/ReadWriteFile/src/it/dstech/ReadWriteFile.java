package it.dstech;

import java.io.*;

public class ReadWriteFile {

	final static int slot = 5;

	public static void main(String args[]) throws IOException {
		
		caricaesalva();
		stampa();
	}

	static void caricaesalva() throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader h = new BufferedReader(input);

		int i;
		int A[] = new int[slot];
		int B[] = new int[slot];

		for (i = 0; i < A.length; i++) {
			System.out.print("A - inserisci " + (i + 1) + "° numero:");
			A[i] = Integer.parseInt(h.readLine().trim());
		}

		for (i = 0; i < B.length; i++) {
			System.out.print("B - inserisci " + (i + 1) + "° numero:");
			B[i] = Integer.parseInt(h.readLine().trim());
		}

		PrintWriter f = null;

		try {
			f = new PrintWriter(new FileWriter("sommaArray.txt"));
		} catch (IOException e) {
			System.err.println("errore");
		}
		for (i = 0; i < slot; i++)
			f.println(A[i] + B[i]);
		f.close();
	}

	static void stampa() {

		BufferedReader f = null;

		int i = 0;
		int T[] = new int[slot];
		String s = "";
		try {
			f = new BufferedReader(new FileReader("sommaArray.txt"));
			while (s != null) {
				s = f.readLine();
				if (s != null) {
					T[i] = Integer.parseInt(s.trim());
					i++;
				}
			}
			f.close();
		} catch (IOException e) {
			System.err.println("errore");
		}
		for (i = 0; i < slot; i++)
			System.out.print(T[i] + " ");
	}
}
