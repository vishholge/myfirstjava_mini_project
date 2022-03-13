package Quiz.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizGame extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1;
    QuizGame(){
        setBounds(400,200,1000,500);//

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz/Game/icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 500, 500);
        add(l1);

        JLabel l2 = new JLabel("TEST YOURSELF");
        l2.setFont(new Font("Tahoma ",Font.BOLD,30));
        l2.setBounds(630,50,300,50);
        l2.setForeground(Color.blue);
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name:");
        l3.setFont(new Font("Mangolian Baiti ",Font.BOLD,16));
        l3.setBounds(680,160,300,50);
        l3.setForeground(Color.blue);
        add(l3);

        t1  = new JTextField();
        t1.setBounds(630,220,250,20);
        add(t1);

        b1 = new JButton("Rules");
        b1.setBounds(630,270,100,25);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Exit");
        b2.setBounds(780,270,100,25);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);


    }
    public  void  actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }
        else{
            System.exit(0);
        }
    }

//    private Component setContentPane() {
//        return ;
//    }

    public static void main(String[] args) {
	// write your code here
        new QuizGame();


    }


}
