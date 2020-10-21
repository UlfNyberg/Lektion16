import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-20
 * Time: 21:03
 * Project: Lektion16
 * Copyright: MIT
 */
public class Övningsuppgift2 extends JFrame implements ActionListener {


    JPanel panel = new JPanel();

    JPanel questions = new JPanel();
    JPanel answers = new JPanel();
    JPanel finalVerdictPanel = new JPanel();

    JLabel mätarställningNuLabel = new JLabel("Ange mätarställning nu: ");
    JLabel mätarställningGammalLabel = new JLabel("Ange mätarställning för ett år sedan: ");
    JLabel förbrukadBensinLabel = new JLabel("Ange antal liter förbrukad bensin: ");
    JLabel antalKördaMil = new JLabel(" ");
    JLabel antalLiterBensinLabel = new JLabel(" ");
    JLabel förbrukningPerMilLabel = new JLabel(" ");

    JTextField mätarställningNu = new JTextField(30);
    JTextField mätarställningGammal = new JTextField(30);
    JTextField förbrukadBensin = new JTextField(30);


    Övningsuppgift2 (){

        //lägger ut delpanelerna
        setLayout(new BorderLayout());
        add("West", questions);
        add("East", answers);
        add("South", finalVerdictPanel);


        questions.setLayout(new GridLayout(3,1));
        questions.add(mätarställningNuLabel);;
        questions.add(mätarställningGammalLabel);
        questions.add(förbrukadBensinLabel);

        answers.setLayout(new GridLayout(3,1));
        answers.add(mätarställningNu);
        answers.add(mätarställningGammal);
        answers.add(förbrukadBensin);

        finalVerdictPanel.setLayout(new GridLayout(1,3));
        finalVerdictPanel.add(antalKördaMil);
        finalVerdictPanel.add(antalLiterBensinLabel);
        finalVerdictPanel.add(förbrukningPerMilLabel);

        mätarställningNu.addActionListener(this);
        mätarställningGammal.addActionListener(this);
        förbrukadBensin.addActionListener(this);


        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    protected static double forbrukingPerMil (double amountOfGas, double antalKördaMil){
        return amountOfGas/antalKördaMil;
    }

    protected static double antalKördaMil (double currentMätarställning, double oldMätarställning){
        return currentMätarställning-oldMätarställning;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mätarställningNu || e.getSource() == mätarställningGammal ||
        e.getSource() == förbrukadBensin){
            //fortsätting följer
        }

    }




    public static void main(String[] args) {
        Övningsuppgift2 öu = new Övningsuppgift2();
    }


}
