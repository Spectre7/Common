package corsojavagenesis.common.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;

import corsojavagenesis.common.networking.Server;

import java.awt.Font;

public class Hello {

	private JFrame frame;
	private Server server;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hello window = new Hello();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hello() {
		server = new Server(9090);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JButton btnNewButton = new JButton("Avvia Server");
		

		
		ActionListener actionListener; 
		btnNewButton.addActionListener(actionListener = new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				server.start();
				
			}
			
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Quello che succede avviene a seguito del click sul pulsante.
				JOptionPane.showMessageDialog(null, "Click");
				
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JTree tree = new JTree();
		frame.getContentPane().add(tree, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("Testo Pulsante");
		btnNewButton_1.setFont(new Font("Traditional Arabic", Font.PLAIN, 11));
		frame.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
	}

}
