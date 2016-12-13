package corsojavagenesis.common.arrays;

public class SintassiArray {
	

	

	
	

	public static void main(String[] args) {
		
		SintassiArray s = new SintassiArray();
		
		
		int[] b;
		int[] c = new int[4]; 
		
		b = new int[10];
		
		
		c[0]=1;
		c[1]=2;
		c[2]=3;
		c[3]=4;
		
		
		for (int i=0;i<4;i++){
			c[i] = i+1;
		}
		
		
		System.out.println("c[2] = " + c[2]);
		
		
		
		
		class Inverti{
			public int[] invertiArray(int[] arrayDaInvertire){
				int[] arrayInvertito=null;
				// codice che inverte l'array
				
				return arrayInvertito;
				
			}
			
			
		}
		
		int[] arr = new int[2];
		
		arr[0] = 1;
		arr[1] = 2;
		
		int[] arrayInvertito = new Inverti().invertiArray(arr);
		
		

	}

}
