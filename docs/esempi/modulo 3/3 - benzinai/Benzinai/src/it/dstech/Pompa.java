package it.dstech;

public class Pompa {

	private int tipop, carb_cont;
	protected int capacita_serb;

	public Pompa(int num) {
		this.capacita_serb = num;
	}

	public int getTipoP() {
		return tipop;
	}

	public void setTipoP(int tipop) {
		this.tipop = tipop;
	}

	public int getCarb_cont() {
		return carb_cont;
	}

	public void setCarb_cont(int carb_cont) {
		this.carb_cont = carb_cont;
	}

	public int getCapacitaSerb() {
		return capacita_serb;
	}

	public void setCapacitaSerb(int capacita_serb) {
		this.capacita_serb = capacita_serb;
	}

	public void aggiungic(int c) {// aggiunge il carburante
									// carb_cont=carb_cont+c;
	}

}
