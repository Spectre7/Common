package corsojavagenesis.common.progetti.Francesco.src;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EventListener implements ActionListener{
	
	private JTextField logTxt;
	private JTextField pswTxt;




	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		
		JOptionPane.showMessageDialog(null,"Il nome account è: " +logTxt.getText()+ "\n la password è:"+pswTxt.getText());
		
	}




	public JTextField getLogTxt() {
		return logTxt;
	}




	public void setLogTxt(JTextField logTxt) {
		this.logTxt = logTxt;
	}




	public JTextField getPswTxt() {
		return pswTxt;
	}




	public void setPswTxt(JTextField pswTxt) {
		this.pswTxt = pswTxt;
	}
}
