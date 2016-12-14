package helloEclipse;

//import helloEclipse.ContoCorrente.*;
import helloEclipse.Utility;


public class Helloworld {

	public static void main(String[] args) {
		
		Utility mioarray = new Utility();
		
		
		
		 int[] arr1 = new int[4];
		arr1[0]=2;
		arr1[1]=4;
		arr1[2]=6;
		arr1[3]=8;
		 
		Utility.ArrayInverso(arr1);
		
		int[] arr_inv;
		arr_inv=mioarray.ArrayInverso1(arr1);
		
		
		System.out.println("\n array iniziale ");
				for (int i=0;i<arr1.length;i++)			
				System.out.println(arr1[i]);
		
		System.out.println("\n array invertito ");			
		for (int i=0;i<arr_inv.length;i++)
			System.out.println(arr_inv[i]);
	}

}











//TODO Auto-generated method stub
		//System.out.println("Hello eclipse");
		/*ContoCorrente cc= new ContoCorrente(500);
		cc.prelievo(100);
		cc.versamento(1000);
		System.out.println("il saldo di cc =" + cc.getSaldo());
		
	
	
		ContoCorrenteFido ccfido = new ContoCorrenteFido();
		
		System.out.println("\n conto corrente fido =" + ccfido.getSaldo()); // importa il valore del padre cioè del costruttore di default ContoCorrente()
	*/
	//ContoCorrente cc = new ContoCorrente();
	//ContoCorrente cc2= new ContoCorrente();
	
	//ContoCorrente.nomeOperazione(); OK
	//cc.nomeOperazione(); NO
	
	//int count = ContoCorrente.counter();
	
	//System.out.println("il counter = " + count); // sarà uguale a 2
		