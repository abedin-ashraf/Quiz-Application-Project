
package quiz.application.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    
    JButton playagain, close;
    Score(String name, int score){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading = new JLabel("Thank you "+ name + " for playing Quiz Pro");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel userscore = new JLabel("Your score is "+score+"");
        userscore.setBounds(350,200,300,30);
        userscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(userscore);
        
        playagain = new JButton("Play Again");
        playagain.setBounds(380,270,120,30);
        playagain.setBackground(new Color(30,144,255));
        playagain.setForeground(Color.WHITE);
        playagain.addActionListener(this);
        add(playagain);
        
        close = new JButton("Close");
        close.setBounds(380,320,120,30);
        close.setBackground(new Color(30,144,255));
        close.setForeground(Color.WHITE);
        close.addActionListener(this);
        add(close);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == playagain){
            setVisible(false);
            new Login();
        }else if(ae.getSource() == close){
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args) {
       new Score("User", 0);
    }
}
