package typometer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class ShowScore extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowScore frame = new ShowScore();
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
	public ShowScore() {
		setResizable(false);
		setTitle("High Score");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 493);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setIconImage(Typometer.icon.getImage());
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Typometer.main(new String[] {});
				
			}
		});
		btnBack.setBounds(210, 420, 98, 23);
		contentPane.add(btnBack);
		
		JLabel lblRank = new JLabel("Rank");
		lblRank.setBackground(Color.LIGHT_GRAY);
		lblRank.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRank.setForeground(Color.WHITE);
		lblRank.setBounds(10, 12, 46, 19);
		contentPane.add(lblRank);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBackground(Color.LIGHT_GRAY);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(115, 11, 46, 20);
		contentPane.add(lblName);
		
		JLabel lblScore = new JLabel("Time(Seconds)");
		lblScore.setBackground(Color.LIGHT_GRAY);
		lblScore.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblScore.setForeground(Color.WHITE);
		lblScore.setBounds(241, 11, 107, 20);
		contentPane.add(lblScore);
		
		JLabel label = new JLabel("1");
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setForeground(Color.WHITE);
		label.setBounds(10, 40, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(10, 80, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBackground(Color.LIGHT_GRAY);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(10, 120, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBackground(Color.LIGHT_GRAY);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(10, 160, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setBackground(Color.LIGHT_GRAY);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(10, 200, 46, 14);
		contentPane.add(label_4);
		
		JLabel label6 = new JLabel("6");
		label6.setBackground(Color.LIGHT_GRAY);
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label6.setBounds(10, 235, 46, 14);
		contentPane.add(label6);
		
		JLabel label_10 = new JLabel("7");
		label_10.setBackground(Color.LIGHT_GRAY);
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_10.setBounds(10, 275, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("8");
		label_11.setBackground(Color.LIGHT_GRAY);
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_11.setBounds(10, 315, 46, 14);
		contentPane.add(label_11);
		
		JLabel label_15 = new JLabel("9");
		label_15.setBackground(Color.LIGHT_GRAY);
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_15.setBounds(10, 355, 46, 14);
		contentPane.add(label_15);
		
		JLabel label_17 = new JLabel("10");
		label_17.setBackground(Color.LIGHT_GRAY);
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_17.setBounds(10, 395, 46, 14);
		contentPane.add(label_17);
		
		
		
		JLabel name1 = new JLabel("Name 1");
		name1.setBackground(Color.LIGHT_GRAY);
		name1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name1.setForeground(Color.WHITE);
		name1.setBounds(115, 40, 86, 14);
		contentPane.add(name1);
		
		JLabel name2 = new JLabel("Name 2");
		name2.setBackground(Color.LIGHT_GRAY);
		name2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name2.setForeground(Color.WHITE);
		name2.setBounds(115, 80, 86, 14);
		contentPane.add(name2);
		
		JLabel name3 = new JLabel("Name 3");
		name3.setBackground(Color.LIGHT_GRAY);
		name3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name3.setForeground(Color.WHITE);
		name3.setBounds(115, 120, 86, 14);
		contentPane.add(name3);
		
		JLabel name4 = new JLabel("Name 4");
		name4.setBackground(Color.LIGHT_GRAY);
		name4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name4.setForeground(Color.WHITE);
		name4.setBounds(115, 160, 86, 14);
		contentPane.add(name4);
		
		JLabel name5 = new JLabel("Name 5");
		name5.setBackground(Color.LIGHT_GRAY);
		name5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name5.setForeground(Color.WHITE);
		name5.setBounds(115, 200, 86, 14);
		contentPane.add(name5);
		
		JLabel name6 = new JLabel("Name 6");
		name6.setBackground(Color.LIGHT_GRAY);
		name6.setForeground(Color.WHITE);
		name6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name6.setBounds(115, 235, 86, 14);
		contentPane.add(name6);
		
		JLabel name7 = new JLabel("Name 7");
		name7.setBackground(Color.LIGHT_GRAY);
		name7.setForeground(Color.WHITE);
		name7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name7.setBounds(115, 275, 86, 14);
		contentPane.add(name7);
		
		JLabel name8 = new JLabel("Name 8");
		name8.setBackground(Color.LIGHT_GRAY);
		name8.setForeground(Color.WHITE);
		name8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name8.setBounds(115, 315, 86, 14);
		contentPane.add(name8);
		
		JLabel name9 = new JLabel("Name 9");
		name9.setBackground(Color.LIGHT_GRAY);
		name9.setForeground(Color.WHITE);
		name9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name9.setBounds(115, 355, 86, 14);
		contentPane.add(name9);

		JLabel name10 = new JLabel("Name 10");
		name10.setBackground(Color.LIGHT_GRAY);
		name10.setForeground(Color.WHITE);
		name10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		name10.setBounds(115, 395, 86, 14);
		contentPane.add(name10);
		
		
		
		JLabel score1 = new JLabel("Time 1");
		score1.setBackground(Color.LIGHT_GRAY);
		score1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score1.setForeground(Color.WHITE);
		score1.setBounds(241, 40, 86, 14);
		contentPane.add(score1);
		
		JLabel score2 = new JLabel("Time 2");
		score2.setBackground(Color.LIGHT_GRAY);
		score2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score2.setForeground(Color.WHITE);
		score2.setBounds(241, 80, 86, 14);
		contentPane.add(score2);
		
		JLabel score3 = new JLabel("Time 3");
		score3.setBackground(Color.LIGHT_GRAY);
		score3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score3.setForeground(Color.WHITE);
		score3.setBounds(241, 120, 86, 14);
		contentPane.add(score3);
		
		JLabel score4 = new JLabel("Time 4");
		score4.setBackground(Color.LIGHT_GRAY);
		score4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score4.setForeground(Color.WHITE);
		score4.setBounds(241, 160, 86, 14);
		contentPane.add(score4);
		
		JLabel score5 = new JLabel("Time 5");
		score5.setBackground(Color.LIGHT_GRAY);
		score5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score5.setForeground(Color.WHITE);
		score5.setBounds(241, 200, 86, 14);
		contentPane.add(score5);
		
		JLabel score6 = new JLabel("Time 6");
		score6.setBackground(Color.LIGHT_GRAY);
		score6.setForeground(Color.WHITE);
		score6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score6.setBounds(241, 235, 86, 14);
		contentPane.add(score6);
		
		JLabel score7 = new JLabel("Time 7");
		score7.setBackground(Color.LIGHT_GRAY);
		score7.setForeground(Color.WHITE);
		score7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score7.setBounds(241, 275, 86, 14);
		contentPane.add(score7);
		
		JLabel score8 = new JLabel("Time 8");
		score8.setBackground(Color.LIGHT_GRAY);
		score8.setForeground(Color.WHITE);
		score8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score8.setBounds(241, 315, 86, 14);
		contentPane.add(score8);
		
		JLabel score9 = new JLabel("Time 9");
		score9.setBackground(Color.LIGHT_GRAY);
		score9.setForeground(Color.WHITE);
		score9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score9.setBounds(241, 355, 86, 14);
		contentPane.add(score9);
		
		JLabel score10 = new JLabel("Time 10");
		score10.setBackground(Color.LIGHT_GRAY);
		score10.setForeground(Color.WHITE);
		score10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		score10.setBounds(241, 395, 86, 14);
		contentPane.add(score10);
		
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				EnterName.main(new String[] {});
			}
		});
		btnPlayAgain.setBounds(327, 420, 107, 23);
		contentPane.add(btnPlayAgain);
		
		
		
		
		/*JLabel lblNewLabel_1 = new JLabel(Typometer.img);
		lblNewLabel_1.setBounds(0, -1, 434, 455);
		getContentPane().add(lblNewLabel_1);*/
		
		
		
		
		
		
		
		
		try {
			Statement stmt=DBConnection.getConnection().createStatement();
			stmt.executeUpdate("use typometer;");
			stmt.executeUpdate("ALTER TABLE highscore ORDER BY time ASC;");
			
			ResultSet rs=stmt.executeQuery("select name,time from highscore;");
			//ResultSet rs=stmt.executeQuery("select Name, time, Rank() over ( ORDER BY time asc ) ranking from highscore;");
				rs.next();
				name1.setText(rs.getString("name"));
				score1.setText(rs.getString("time"));
				rs.next();
				name2.setText(rs.getString("name"));
				score2.setText(rs.getString("time"));
				rs.next();
				name3.setText(rs.getString("name"));
				score3.setText(rs.getString("time"));
				rs.next();
				name4.setText(rs.getString("name"));
				score4.setText(rs.getString("time"));
				rs.next();
				name5.setText(rs.getString("name"));
				score5.setText(rs.getString("time"));
				rs.next();
				name6.setText(rs.getString("name"));
				score6.setText(rs.getString("time"));
				rs.next();
				name7.setText(rs.getString("name"));
				score7.setText(rs.getString("time"));
				rs.next();
				name8.setText(rs.getString("name"));
				score8.setText(rs.getString("time"));
				rs.next();
				name9.setText(rs.getString("name"));
				score9.setText(rs.getString("time"));
				rs.next();
				name10.setText(rs.getString("name"));
				score10.setText(rs.getString("time"));
				stmt.executeUpdate("delete from highscore where time >"+score10.getText()+";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
