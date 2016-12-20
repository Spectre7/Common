package corsojavagenesis.common.progetti.Francesco.src;
import java.awt.*;
import javax.swing.*;

public class GUILogin extends JFrame {

	 private static String titolo = "Login";
	 private int alt = 100, larg= 500;
	 private JLabel logLabel = new JLabel("Nome account: ");
	 private JTextField  logTxtField = new JTextField();
	 private JLabel pswLabel= new JLabel("Passowrd: ");
	 private JTextField  pswTxtField = new JTextField();
	 private JButton logButton = new JButton("Login");
	 private JPanel griglia = new JPanel(new GridLayout(2,2));
	 private JPanel ricerca = new JPanel(new GridLayout(1,1));
	 private EventListener Listn = new EventListener();
	 

	

	public GUILogin(){
		 	super(titolo);
		 	this.setSize(larg, alt); //set dimensioni finestra
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set chiusura all'uscita
		    
		    //set parametri Listn
		    
		    Listn.setLogTxt(logTxtField);
		    Listn.setPswTxt(pswTxtField);
		    
		    //Set eventi
		    logButton.addActionListener(Listn);
		    
		    //inserimento elementi nel layout
		    griglia.add(logLabel);
		    griglia.add(logTxtField);
		    griglia.add(pswLabel);
		    griglia.add(pswTxtField);
		    ricerca.add(logButton);
		    
		    //inserimento layout nella finestra		    
		    Container frmContentPane = this.getContentPane();
		    frmContentPane.add(griglia, BorderLayout.CENTER);
		    frmContentPane.add(ricerca, BorderLayout.SOUTH);
		    

		    
		    //this.pack();//ridimensiona al minimo
		    this.setLocationRelativeTo(null);//Centramento finestra
		    this.setVisible(true); //set visibilità
	 }

	  
}
