package helloeclipse;

import helloeclipse.ContoCorrente.*;
//import java.io.*;
import java.util.*;

public class Helloworld {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		// TODO Auto-generated method stub
		
		int c[];
		System.out.println("inserisci la dimensione dell'array");
		int l= s.nextInt();
		
		c=new int[l];
		
		for(int y=0;y<l;y++){
			System.out.println("Inserisci l'intero da inserire nell'array");
			c[y]=s.nextInt();
		}
		
		for(int in=0;in<c.length;in++){
			System.out.println(c[in]);
		}
		
		InvertiArray i= new InvertiArray(c);
		for(int in=0; in<c.length;in++){
			System.out.println(i.a[in]);
		}
		s.close();

	}

}
