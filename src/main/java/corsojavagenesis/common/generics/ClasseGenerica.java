package corsojavagenesis.common.generics;

public class ClasseGenerica<K> {
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	private K key;

	public void saluta() {
		System.out.println("Ciao");
		
	}
	
	
}
