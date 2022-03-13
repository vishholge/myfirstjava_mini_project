package Quiz.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    JButton b1;
    String username;
    int score;
    Score(String username,int score){
       this.username = username;
       this.score = score;
       setBounds(400,200,800,500);
       getContentPane().setBackground(Color.white);
       setLayout(null);

       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz/Game/icons/score.png"));
       Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l1 = new JLabel(i3);
       l1.setBounds(20,150,300,250);
       add(l1);

       JLabel l2 = new JLabel("Thank you for "+ username + " playing Quiz!!!");
       l2.setBounds(50,20,500,30);
       l2.setFont(new Font("RAILWAY",Font.PLAIN,20));;
       add(l2);

       JLabel l3 = new JLabel("Your Score is ="+ score);
       l3.setBounds(400,150,300,30);;
       l3.setFont(new Font("Jokerman",Font.BOLD,20));
       add(l3);

       JButton b1 = new JButton("Play again");
       b1.setBounds(450,200,110,20);
       b1.setBackground(Color.blue);
       b1.setForeground(Color.white);
       b1.addActionListener(this);
       add(b1);

    }
    public  void actionPerformed(ActionEvent ae){

            this.setVisible(false);
            new QuizGame().setVisible(true);


    }

    public static void main(String[] args) {
        //new Score("vish",100000).setVisible(true);
    }
}
