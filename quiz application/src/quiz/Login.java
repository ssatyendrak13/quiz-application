package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Login extends JFrame implements ActionListener{
    private JButton rules;
    private JButton back;
    JTextField tf;
    Login(){
        getContentPane().setBackground(Color.white); // color class present in awt package 
        setLayout(null); 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("simple minds ");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("viner hand itc" , Font.BOLD , 40));
        // font family = mangolian baiti or viner hand itc, font type = Font.bold , font size = 18
        heading.setForeground(Color.blue);
//        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810 , 150 , 300,20);
        name.setFont(new Font("mangolian baiti",Font.BOLD , 18));
        name.setForeground(Color.GRAY);
        add(name);
        
        tf = new JTextField();
        tf.setBounds(735,200,300,30);
        tf.setFont(new Font("Times new roman" , Font.BOLD, 20));
        add(tf);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,30);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270,120,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==rules) {
    		setVisible(false);
    		String name = tf.getText();
    		new Rules(name);
    	}else if(e.getSource()==back) {
    		setVisible(false);
    	}
    }
    
    public static void main(String args[]){
        
        new Login();
        
    }
    
}

