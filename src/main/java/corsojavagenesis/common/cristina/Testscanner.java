package corsojavagenesis.common.cristina;

import java.util.Scanner;

public class Testscanner {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
		int token = s.nextInt();
		if(token == 0)
			break;
		System.out.println("valore =" + token);
		}
		s.close();
	}

}
