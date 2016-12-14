package corsojavagenesis.common.networking;

public class TestReference {

	public static void main(String[] args) {
		Sock s = new Sock();
		
		OggettoReferenziato o = s.getOut();
		
		System.out.println("Valore: " + o.printValore());
		
		
		o.valore = 200;
		
		
		OggettoReferenziato o2 = s.getOut();
		
		
		System.out.println("Valore: " + o2.printValore());

	}

}
