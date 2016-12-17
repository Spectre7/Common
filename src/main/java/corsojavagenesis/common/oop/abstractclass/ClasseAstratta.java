package corsojavagenesis.common.oop.abstractclass;

public abstract class ClasseAstratta {
	private int prop;
	
	// Costruttore di default
	public ClasseAstratta(){
		System.out.println("Costruttore pubblico di Classe Astratta");
		
		this.prop=10;
	}
	
	public int getPrp(){
		return this.prop;
	}
	
	public abstract int nome(int a);
}
