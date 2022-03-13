package Quiz.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quizqns extends JFrame implements ActionListener {
    JButton next,submit;
    JLabel qno, question;
    String[][] q = new String[10][5];
    String [] pa = new String[10];
    String [] qa = new String[10];

    public  static  int count =0;
    public  static int score = 0;


    JRadioButton op1,op2,op3,op4;
    ButtonGroup options;
    String username;


        Quizqns(String username){
            this.username = username;
            setBounds(400,100,915,700);

            getContentPane().setBackground(Color.white);
            setLayout(null);
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz/Game/icons/quiz.jpg"));
            JLabel l1 = new JLabel(i1);
            l1.setBounds(0,0,915,300);
            add(l1);

            qno = new JLabel("");
            qno.setBounds(80,350,40,30);
            qno.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(qno);

             question = new JLabel(" ");
            question.setBounds(100,350,900,30);
            question.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(question);

            q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
            q[0][1] = "JVM";
            q[0][2] = "JDB";
            q[0][3] = "JDK";
            q[0][4] = "JRE";

            q[1][0] = "What is the return type of the hashCode() method in the Object class?";
            q[1][1] = "int";
            q[1][2] = "Object";
            q[1][3] = "long";
            q[1][4] = "void";

            q[2][0] = "Which package contains the Random class?";
            q[2][1] = "java.util package";
            q[2][2] = "java.lang package";
            q[2][3] = "java.awt package";
            q[2][4] = "java.io package";

            q[3][0] = "An interface with no fields or methods is known as?";
            q[3][1] = "Runnable Interface";
            q[3][2] = "Abstract Interface";
            q[3][3] = "Marker Interface";
            q[3][4] = "CharSequence Interface";

            q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
            q[4][1] = "Stack";
            q[4][2] = "String memory";
            q[4][3] = "Random storage space";
            q[4][4] = "Heap memory";

            q[5][0] = "Which of the following is a marker interface?";
            q[5][1] = "Runnable interface";
            q[5][2] = "Remote interface";
            q[5][3] = "Readable interface";
            q[5][4] = "Result interface";

            q[6][0] = " Which keyword is used for accessing the features of a package?";
            q[6][1] = "import";
            q[6][2] = "package";
            q[6][3] = "extends";
            q[6][4] = "export";

            q[7][0] = "In java, jar stands for?";
            q[7][1] = "Java Archive Runner";
            q[7][2] = "Java Archive";
            q[7][3] = "Java Application Resource";
            q[7][4] = "Java Application Runner";

            q[8][0] = "Which of the following is a mutable class in java?";
            q[8][1] = "java.lang.StringBuilder";
            q[8][2] = "java.lang.Short";
            q[8][3] = "java.lang.Byte";
            q[8][4] = "java.lang.String";

            q[9][0] = "Which of the following option leads to the portability and security of Java?";
            q[9][1] = "Bytecode is executed by JVM";
            q[9][2] = "The applet makes the Java code secure and portable";
            q[9][3] = "Use of exception handling";
            q[9][4] = "Dynamic binding between objects";

            qa[0]= "JDB";
            qa[1] = "int";
            qa[2] = "java.util package";
            qa[3] = "Marker Interface";
            qa[4] = "Heap memory";
            qa[5] = "Remote interface";
            qa[6] = "import";
            qa[7] = "Java Archive";
            qa[8] = "java.lang.StringBuilder";
            qa[9] = "Bytecode is executed by JVM";


            op1 = new JRadioButton("vish");
            op1.setBounds(150,400,400,20);
            op1.setFont(new Font("Dialog",Font.PLAIN,15));
            op1.setBackground(Color.white);
            add(op1);

            op2 = new JRadioButton("vish");
            op2.setBounds(150,450,400,20);
            op2.setFont(new Font("Dialog",Font.PLAIN,15));
            op2.setBackground(Color.white);
            add(op2);

            op3 = new JRadioButton("vish");
            op3.setBounds(150,500,400,20);
            op3.setFont(new Font("Dialog",Font.PLAIN,15));
            op3.setBackground(Color.white);
            add(op3);

            op4= new JRadioButton("vish");
            op4.setBounds(150,550,500,20);
            op4.setFont(new Font("Dialog",Font.PLAIN,15));
            op4.setBackground(Color.white);
            add(op4);

            options = new ButtonGroup();
            options.add(op1);
            options.add(op2);
            options.add(op3);
            options.add(op4);

            next = new JButton("Next");
            next.setFont(new Font("Tahoma",Font.PLAIN,15));
            next.setBounds(700,500,100,25);
            next.setBackground(Color.blue);
            next.setForeground(Color.white);
            next.addActionListener(this);
            add(next);

            submit = new JButton("Submit");
            submit.setFont(new Font("Tahoma",Font.PLAIN,15));
            submit.setEnabled(false);
            submit.setBounds(700,550,100,25);
            submit.setBackground(Color.blue);
            submit.setForeground(Color.white);
            submit.addActionListener(this);
            add(submit);



//             = new JButton("Next");
//            next.setFont(new Font("Tahoma",Font.PLAIN,20));
//            next.setBounds(700,450,100,25);
//            next.setBackground(Color.blue);
//            next.setForeground(Color.white);
//            add(next);
            start(0);


            setVisible( true);
        }
        public  void  start(int count){
            qno.setText(""+(count+1)+".");
            question.setText(q[count][0]);
            op1.setLabel(q[count][1]);
            op1.setActionCommand(q[count][1]);
            op2.setLabel(q[count][2]);
            op2.setActionCommand(q[count][2]);
            op3.setLabel(q[count][3]);
            op3.setActionCommand(q[count][3]);
            op4.setLabel(q[count][4]);
            op4.setActionCommand(q[count][4]);
            options.clearSelection();
        }
        public  void actionPerformed(ActionEvent ae){
            if(ae.getSource()==next){
                //repaint();
                if(options.getSelection() ==null){
                    pa [count] = "";
                }
                else{
                    pa[count] = options.getSelection().getActionCommand();
                }
                count++;

                if(count == 9){
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }

                if(count== 9){
                    if(options.getSelection() ==null){
                        pa [count] = "";
                    }
                    else{
                        pa[count] = options.getSelection().getActionCommand();
                    }
                }
                start(count);

            }
            else if(ae.getSource() == submit) {
                //ans_given = 1;
                if (options.getSelection() == null) {
                    pa[count] = "";
                } else {
                    pa[count] = options.getSelection().getActionCommand();
                }

                for (int i = 0; i < pa.length; i++) {
                    if (pa[i].equals(qa[i])) {
                        score += 10;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);

            }
        }

    public static void main(String[] args) {
        //new Quizqns();
    }
}
