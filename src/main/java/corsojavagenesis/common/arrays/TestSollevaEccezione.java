package corsojavagenesis.common.arrays;

public class TestSollevaEccezione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassConEccezione e = new ClassConEccezione();
		
		try {
			e.metodo(5, 10);
		} catch (MyException e1) {
			System.out.println("0");
			
		} catch (Exception e2){
			
		}
		
		System.out.println("no errori");
		
		String s = new String("bla bla");
		
		
		

	}

}
