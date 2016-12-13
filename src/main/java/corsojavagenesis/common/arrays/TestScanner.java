package corsojavagenesis.common.arrays;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
	
		while(s.hasNext()){
			int token = s.nextInt();   //primo token della lista			
			System.out.println("Valore inserito: " + token);			
		}

		
		s.close();
	}
}
