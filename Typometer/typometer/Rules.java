package typometer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;

public class Rules {

	private JFrame frmTypometer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rules window = new Rules();
					window.frmTypometer.setVisible(true);
					window.frmTypometer.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTypometer = new JFrame();
		frmTypometer.setResizable(false);
		frmTypometer.setTitle("Rules");
		frmTypometer.setBounds(100, 100, 450, 300);
		frmTypometer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTypometer.getContentPane().setLayout(null);
		
		frmTypometer.setIconImage(Typometer.icon.getImage());
		
		JLabel lblNewLabel = new JLabel("Rules for Typometer");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(149, 11, 150, 40);
		frmTypometer.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnInThisGame = new JTextPane();
		txtpnInThisGame.setText("In this game the speed of your typing skill will be tested.\r\nA random character will appear on the screen and you'll have to press that character key to continue.\r\nIn this way you'll have to press 5 characters correctly. \r\nThe time required to type all the characters is your score. \r\nThe faster you type the better it is.");
		txtpnInThisGame.setBounds(76, 62, 259, 146);
		frmTypometer.getContentPane().add(txtpnInThisGame);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTypometer.dispose();
				Typometer.main(new String[] {});
			}
		});
		btnMainMenu.setBounds(149, 219, 102, 23);
		frmTypometer.getContentPane().add(btnMainMenu);
		
		JLabel lblNewLabel_1 = new JLabel(Typometer.img);
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frmTypometer.getContentPane().add(lblNewLabel_1);
	}
}
