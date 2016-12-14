package corsojavagenesis.common.cristina;

public class Utility {
	

	/** riceve in ingresso un array e stampa a video l'originale e quello invertito componente per componente
	 * 
	 * @param arr array in ingresso
	 */


	public static void ArrayInverso(int[] arr){
				
		int l=arr.length;
		int[] arr_inv = new int[l];
		for (int i=0;i<l;i++){
		arr_inv[i]=arr[l-1-i];
		System.out.println("\n array iniziale [" + arr[i] + "]\n array invertito [" + arr_inv[i] + "]");
		}
		
	
	}
	
	/** riceve in ingresso un array e restituisce l'array invertito
	 * 
	 * @param arr array in ingresso
	 * @return array invertito in uscita
	 */
		
	public int[] ArrayInverso1(int[] arr){
		int l=arr.length;
		
		int[] arr_inv = new int[l];
		for (int i=0;i<l;i++)
		arr_inv[i]=arr[l-1-i];
		return arr_inv;
		
		
	
	}
		
}
