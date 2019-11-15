package typometer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class EnterName {

	private JFrame frmEnterName;
	private JTextField textField;
	static public String Name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnterName window = new EnterName();
					window.frmEnterName.setVisible(true);
					window.frmEnterName.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EnterName() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEnterName = new JFrame();
		frmEnterName.setResizable(false);
		frmEnterName.setTitle("Enter Name");
		frmEnterName.setBounds(100, 100, 450, 300);
		frmEnterName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEnterName.getContentPane().setLayout(null);
		
		Typometer.icon=new ImageIcon(getClass().getResource("icon.png"));
		frmEnterName.setIconImage(Typometer.icon.getImage());
		
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name");
		lblEnterYourName.setForeground(Color.WHITE);
		lblEnterYourName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEnterYourName.setBounds(145, 23, 146, 36);
		frmEnterName.getContentPane().add(lblEnterYourName);
		
		textField = new JTextField();
		textField.setBounds(98, 84, 218, 36);
		frmEnterName.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Name=textField.getText();
				frmEnterName.dispose();
				StartGame.main(new String[] {});
			}
		});
		btnStartGame.setBounds(145, 150, 115, 36);
		frmEnterName.getContentPane().add(btnStartGame);
		
		JLabel lblNewLabel_1 = new JLabel(Typometer.img);
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frmEnterName.getContentPane().add(lblNewLabel_1);
	}
}
