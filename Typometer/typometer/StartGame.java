package typometer;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

public class StartGame extends JFrame implements KeyListener {

	private JFrame frame;
	private JTextField textField;
	public static int i=0;
	public static long endTime;
	public static long startTime;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGame window = new StartGame();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartGame() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		startTime = System.currentTimeMillis();
		i=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		addKeyListener(this);
		
		frame.setIconImage(Typometer.icon.getImage());
		
		
		Character[] x = new Character[6];
		Random rand = new Random();
		x[i] =CharGenerator.getChar();
		JLabel questionShow = new JLabel(String.valueOf(x[i]));
		questionShow.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		questionShow.setBounds(rand.nextInt(401)+40, rand.nextInt(151)+40, 61, 23);
		frame.getContentPane().add(questionShow);
		
		
		
		
	
	frame.addKeyListener(new KeyListener() {

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()==x[i]) {
				if(i<5) {
					i++;
					x[i]=CharGenerator.getChar();
					questionShow.setBounds(rand.nextInt(401)+40, rand.nextInt(151)+40, 61, 23);
					questionShow.setText(String.valueOf(x[i]));	
					System.out.println(i);
				}
				else if(i==5) {
					endTime = System.currentTimeMillis();
					final float sec = (endTime - startTime) / 1000F;
					JOptionPane.showMessageDialog(null, "Correct answer! \n Your time was "+sec+" second\n Check the high score to see if you've made it","Result",JOptionPane.PLAIN_MESSAGE);
					
					
					
					try {
						Statement stmt=DBConnection.getConnection().createStatement();
						stmt.executeUpdate("use typometer");
						stmt.executeUpdate("insert into highscore values ('"+EnterName.Name+"','"+sec+"')");
					} catch (SQLException E) {
						E.printStackTrace();
					}
					frame.dispose();
					Typometer.main(new String[] {});
				}
				
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}});
	
}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
}