package corsojavagenesis.common.observer;

import javax.swing.JOptionPane;

public class B implements I {
	private int val;
	private A a;
	
	public void statoChanged() {
		// TODO Auto-generated method stub
		// rispondo all'evento statoChanged
		JOptionPane.showMessageDialog(null, "stato changed");
	}
}
