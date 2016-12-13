package helloeclipse.ContoCorrente;

public class ContoCorrente {
	
	private double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double versamento(double importo){
		this.saldo=this.saldo+importo;
		return this.saldo;
	}
	
	public double preleva(double importo){
		
		if(importo<=this.saldo){
		this.saldo=this.saldo - importo;
		return this.saldo;
		}
		else{
			System.out.println("Importo non disponibile");
			return this.saldo;
		}
	}
	
	public ContoCorrente (){
		this.saldo=0;
	}
	
	public ContoCorrente(double importo){
		this.saldo=importo;
	}
	

}
