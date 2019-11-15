package typometer;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class random extends JFrame implements KeyListener{

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					random window = new random();
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
	public random() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.addKeyListener(this);
		getContentPane().setLayout(null);
		
		Random rand = new Random();
		char question = CharGenerator.getChar();
		JLabel questionShow = new JLabel(String.valueOf(question));
		questionShow.setBounds(rand.nextInt(401)+40, rand.nextInt(151)+40, 61, 23);
		frame.getContentPane().add(questionShow);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//frame.getContentPane().remove(questionShow);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
