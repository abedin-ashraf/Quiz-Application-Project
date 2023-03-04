
package quiz.application.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton rules, back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("Quiz Pro");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Times New Roman",Font.BOLD,35));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name: ");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        name.setForeground(Color.BLACK);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD, 18)); 
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}

