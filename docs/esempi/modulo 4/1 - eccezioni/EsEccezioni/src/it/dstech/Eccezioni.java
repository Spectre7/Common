package it.dstech;

public class Eccezioni {

	public static void main(String[] args) {
		
		String s = null;
		
		try {
			int l = s.length();
			System.out.println(s);
		} catch (Exception e) {
			System.out.println("stringa vuota");
		}
	}
}
