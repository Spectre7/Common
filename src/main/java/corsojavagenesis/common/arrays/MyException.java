package corsojavagenesis.common.arrays;

public class MyException extends Exception  {

	public MyException(){
		super();
	}
	
	
	public void messaggio(){
		System.out.println("Attenzione primo parametro non può essere inferiore al secondo");
	}
}
