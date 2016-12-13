package corsojavagenesis.common.arrays;

public class ClassConEccezione {

	/**
	 * 
	 * @param a
	 * @param b
	 * @throws MyException - E' sollevata quando il primo parametro è minore del secondo
	 */
	public void metodo(int a, int b) throws MyException {
		if (a<b){
			throw new MyException();
		}
	}

}
