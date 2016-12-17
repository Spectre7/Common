package it.dstech;

import java.util.ArrayList;
import java.util.Scanner;

public class Benzine {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		ArrayList T = new ArrayList(3);
		T.add(new Distributore("Paperopoli", "Paperino", 200));
		T.add(new Distributore("Paperopoli", "Pippo", 300));
		T.add(new Distributore("Topolinea", "Topolino", 100));

		int i, ch = 0, scelta, var, scelta2 = 0;

		System.out.println("Seleziona il distributore");

		for (i = 0; i < T.size(); i++)
			System.out.println(i + "]" + ((Distributore) T.get(i)).getProprietario());
		ch = tastiera.nextInt();
		if (ch < 0 || ch >= T.size())
			ch = 0;
		// paperino è distributore di default

		System.out.println();

		while (scelta2 != 1) {

			System.out.printf("1)Rifornimento \n2)Rifornimento Pompa \n3)Calcolo incasso giornaliero \n4)Comparazione");

			System.out.printf("\n\nInserisci la tua scelta: ");
			scelta = tastiera.nextInt();

			switch (scelta) {
			case 1:
				System.out.printf(
						"Ins.num.litri da prelevare ,capacita: " + ((Distributore) T.get(ch)).litri() + " litri: ");
				var = ((Distributore) T.get(ch)).rifornisci(tastiera.nextInt());
				System.out.printf("Sono stati spesi: " + var + "\n");
				((Distributore) T.get(ch)).setIncasso(var);
				System.out.printf("Vuoi continuare?	\nDigita 0 per confermare oppure 1 per negare: ");
				scelta2 = tastiera.nextInt();
				break;
			case 2:
				System.out.printf("La pompa contiene " + ((Distributore) T.get(ch)).litri()
						+ "\nInserisci la quantita  di litri da inserire: ");
				((Distributore) T.get(ch)).aggiungi(tastiera.nextInt());
				System.out.printf("Vuoi continuare?\nDigita 0 per confermare oppure 1 per negare: ");
				scelta2 = tastiera.nextInt();
				break;
			case 3:
				System.out.printf("L'incasso totale di oggi:" + ((Distributore) T.get(ch)).Incassog());
				System.out.printf("Vuoi continuare?\nDigita 0 per confermare oppure 1 per negare: ");
				scelta2 = tastiera.nextInt();
				break;
			case 4:
				Distributore Dch = (Distributore) T.get(ch);
				for (i = 0; i < T.size(); i++) {
					if (i != ch) {
						Distributore Di = (Distributore) T.get(i);
						if (Dch.compareTo(Di) > 0)
							System.out.println(Dch.getProprietario() + " ha più benzina di " + Di.getProprietario());
						else
							System.out.println(Dch.getProprietario() + " ha meno benzina di " + Di.getProprietario());
					}
				}
				break;
			}
		}
	}
}
