package quiz.application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import  javax.swing.JFrame;

public class Score extends JFrame implements ActionListener{
    static JLabel qno;


    Score(String name , int score ) {
        setBounds(0,0,900,950);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

        //image
        JLabel imageLabel = new JLabel();
        ImageIcon i1 = new ImageIcon("../icons/score.png");
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        imageLabel.setIcon(i3);
        imageLabel.setBounds(0, 0, 750, 950);
        add(imageLabel);

       JLabel heading = new JLabel("Thankyou "+ name + " for Playing Simple MInes");
        heading.setBounds(20,30,700,30);
        heading.setFont(new Font("Tahona",Font.PLAIN,26));
        add(heading);

        //Display Score
        JLabel scoreDisplay = new JLabel("Your Score is "+ score);
        scoreDisplay.setBounds(350,200,300,30);
        scoreDisplay.setFont(new Font("Tahona",Font.PLAIN,26));
        add(scoreDisplay);

        JButton PlayAgain = new JButton("Play Again ");
        PlayAgain.setBounds(399,250,200,40);
        PlayAgain.setBackground(Color.GREEN);
        PlayAgain.setFont(new Font("Tahoma",Font.PLAIN,22));
        PlayAgain.setForeground(Color.WHITE);
        PlayAgain.addActionListener(this);

//        next.addActionListener(this);
        add(PlayAgain);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {


        new Score("User ", 0 );

    }
}
