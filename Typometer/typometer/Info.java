package typometer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class Info extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info frame = new Info();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Info() {
		setResizable(false);
		setTitle("Info");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Typometer.icon=new ImageIcon(getClass().getResource("icon.png"));
		setIconImage(Typometer.icon.getImage());
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Typometer.main(new String[] {});
			}
		});
		btnBack.setBounds(161, 216, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblTypometer = new JLabel("Typometer");
		lblTypometer.setFont(Typometer.font);
		lblTypometer.setForeground(Color.WHITE);
		lblTypometer.setBounds(131, 29, 185, 38);
		contentPane.add(lblTypometer);
		
		JLabel lblMadeByAdnan = new JLabel("Made by Adnan");
		lblMadeByAdnan.setFont(Typometer.font);
		lblMadeByAdnan.setForeground(Color.WHITE);
		lblMadeByAdnan.setBounds(69, 59, 342, 142);
		contentPane.add(lblMadeByAdnan);
		
		JLabel lblNewLabel_1 = new JLabel(Typometer.img);
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		getContentPane().add(lblNewLabel_1);
	}
}
