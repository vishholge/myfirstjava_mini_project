package Quiz.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton b1,b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(400,200,700,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome  "+ username + "  to Quiz Game");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
        l1.setBounds(40,20,600,30);
        add(l1);

        JLabel l2 = new JLabel("Rules:-");
        l2.setBounds(20,50,100,50);
        l2.setForeground(Color.blue);
        add(l2);

        JLabel l3 = new JLabel("");
        l3.setBounds(20,50,650,400);
        l3.setFont(new Font("Tahoma",Font.BOLD,12));
        l3.setText(
                "<html>"+
                        "1. Do not  try to search answers of quetions on Internate" + "<br><br>" +
                        "2. Attempt only if you know the answer otherwise wrong ans will minimize your score" + "<br><br>" +
                        "3. Don't try to move away from camera " + "<br><br>" +
                        "4. If other person caught in camera then test will be automatically terminated" + "<br><br>" +
                        "5. Minimum internet speed should be 150kbps " + "<br><br>" +
                        "6. Once you fail you are allowed to reattempt after 15 days" + "<br><br>" +
                        "7. your age should above 18" + "<br><br>" +
                        "8. your face should be match to your photo which you already submited" + "<br><br>" +
                "<html>");



        add(l3);

         b1 = new JButton("Back");
        b1.setBounds(30,400,100,25);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(500,400,100,25);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);



        setVisible(true);
    }
    public  void  actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new QuizGame().setVisible(true);
        }
        else {
            this.setVisible(false);
            new Quizqns(username).setVisible(true);
        }
    }
    public static void main(String[] args) {

        //new Rules("vish");
    }
}
