package helloeclipse.ContoCorrente;

public class InvertiArray {
	
	public int[]a;
	
	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public InvertiArray (int [] arr){
		a = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			this.a[i]=arr[arr.length-i-1];
		}
	}
	
	

}
