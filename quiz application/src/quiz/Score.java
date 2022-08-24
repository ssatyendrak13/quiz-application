package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{

	Score(String name , int score){
		setBounds(400,150,750,550);
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("images/score7.jpg"));
		Image i2  = i.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i);
		image.setBounds(130,0,500,200);
		add(image);
		
		
		
		JLabel heading = new JLabel("Thank you "+name+" for playing quiz !");
		heading.setBounds(100,200,500,30);
		heading.setFont(new Font("tohoma",Font.PLAIN,24));
		add(heading);
		
		JLabel finalScore = new JLabel("your score is : "+score);
		finalScore.setBounds(100,250,500,30);
		finalScore.setFont(new Font("tohoma",Font.BOLD,24));
		add(finalScore);
		
		JButton submit = new JButton("Play Again ");
		submit.setBounds(260,340,200,40);
		submit.setFont(new Font("Tahoma",Font.PLAIN,22));
		submit.setBackground(new Color(30,144,255));
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		setVisible(false);
		new Login();
		
	}
	
	public static void main(String args[]) {
		new Score("user",0);
	}

}
