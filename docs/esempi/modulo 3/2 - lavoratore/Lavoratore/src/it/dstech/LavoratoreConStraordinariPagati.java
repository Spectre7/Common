package it.dstech;

public class LavoratoreConStraordinariPagati extends Lavoratore {

	protected int oreStraordinario;
	protected static double retribuzioneOraria = 10.0;

	public LavoratoreConStraordinariPagati(String n, int l, int o) {
		super(n, l);
		oreStraordinario = o;
	}

	public void stampaStraordinari() {
		System.out.println("Il numero di ore di straordinario e': " + oreStraordinario);
	}

	public void stampaStipendio() {
		super.stampaStipendio();
		System.out.println("Con gli straordinari e': " + (stipendio + (retribuzioneOraria * oreStraordinario)));
	}

}
