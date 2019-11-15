package typometer;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mysql.jdbc.Connection;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Window.Type;


public class Typometer {

	public static ImageIcon icon,img,playIcon;
	private JFrame frmTypometer;
	public static Font font = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost/test";
		String userName="root";
		String password="1234";
		
		try {
			Class.forName(driver);
			Connection con=(Connection) DriverManager.getConnection(url, userName, password);
			final Statement stmt=con.createStatement();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Typometer window = new Typometer();
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
	public Typometer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTypometer = new JFrame();
		frmTypometer.setTitle("TYPOMETER");
		frmTypometer.getContentPane().setBackground(SystemColor.controlDkShadow);
		frmTypometer.setBounds(100, 100, 450, 300);
		frmTypometer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTypometer.getContentPane().setLayout(null);
		icon=new ImageIcon(getClass().getResource("icon.png"));
		frmTypometer.setIconImage(icon.getImage());
		img = new ImageIcon(getClass().getResource("background.png"));
		playIcon = new ImageIcon(getClass().getResource("play.png"));
		
		
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("gta.ttf").openStream());
		} catch (FontFormatException | IOException e2) {
			e2.printStackTrace();
		}   

		GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		genv.registerFont(font);
		font = font.deriveFont(35f);
		
		
		JLabel lblNewLabel = new JLabel("Welcome to typometer game");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(SystemColor.activeCaptionBorder);
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(29, 0, 366, 64);
		frmTypometer.getContentPane().add(lblNewLabel);
		
		JButton startGameButton = new JButton("Start game");
		startGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frmTypometer.dispose();
				EnterName.main(new String[] {});
			}
		});
		startGameButton.setBounds(143, 60, 106, 23);
		frmTypometer.getContentPane().add(startGameButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitButton.setBounds(143, 220, 106, 23);
		frmTypometer.getContentPane().add(exitButton);
		
		JButton infoButton = new JButton("Info");
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Info info = new Info();
				info.setVisible(true);
				frmTypometer.setVisible(false);
			}
		});
		infoButton.setBounds(143, 100, 106, 23);
		frmTypometer.getContentPane().add(infoButton);
		
		JButton highScoreButton = new JButton("High Score");
		highScoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowScore.main(new String[] {});
				frmTypometer.dispose();
			}
		});
		highScoreButton.setBounds(143, 140, 106, 23);
		frmTypometer.getContentPane().add(highScoreButton);
		
		JButton btnRules = new JButton("Rules");
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rules.main(new String[] {});
				frmTypometer.dispose();
			}
		});
		btnRules.setBounds(143, 180, 106, 23);
		frmTypometer.getContentPane().add(btnRules);
		
		JLabel lblNewLabel_1 = new JLabel(img);
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frmTypometer.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(playIcon);
		lblNewLabel_2.setBounds(69, 60, 64, 23);
		frmTypometer.getContentPane().add(lblNewLabel_2);
	}
}
