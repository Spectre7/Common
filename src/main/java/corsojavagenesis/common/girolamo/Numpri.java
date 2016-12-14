package corsojavagenesis.common.girolamo;

public class Numpri {

	public void versepri(int a) {
		int i;
		int flag=0;
		if(a==2){
			System.out.println("primo");			
		}
		if(a%2==0&&a!=2){
			System.out.println("non primo");
			flag=1;
		}
		for(i=3; i<a/i; i=i+2){
		   if(a%i==0){
			System.out.println(i +" è divisore");   
			flag=1;
		   }
	    }
		if(flag==0){
			System.out.println("primo");
		}else{
			System.out.println("non primo");
		}
		
   }
}
