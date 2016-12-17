package corsojavagenesis.common.observer;

import java.util.ArrayList;

public class A {
	private int a;
	public boolean statoChanged;
	private ArrayList<I> listeners;
	
	public void setA(int a){
		this.a=a;
		
		for (int i=0;i<=listeners.size();i++){
			listeners.get(i).statoChanged();
		}
	}
	
	public void metodo(){
		System.out.println("invocato metodo di A package observer");
	}
	
	
	
	
}
