import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-20
 * Time: 09:59
 * Project: Lektion16
 * Copyright: MIT
 */
public class Minilab5 extends JFrame implements ActionListener {

    private JPanel p = new JPanel();
    private  JCheckBox red = new JCheckBox("Röd", false);
    private  JCheckBox yellow = new JCheckBox("Gul", false);
    private  JCheckBox blue = new JCheckBox("Blå", false);
    private JLabel displayArea = new JLabel(" ");
    private JButton button = new JButton("Klicka här");


    Minilab5 (){
        this.add(p);
        p.setLayout(new GridLayout(5,1));
        p.add(red); p.add(yellow); p.add(blue); p.add(displayArea); p.add(button);


        //red.addActionListener(this);
        //yellow.addActionListener(this);
        //blue.addActionListener(this);
        button.addActionListener(this);
        pack();
        setTitle("Knappfärg");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (red.isSelected()){
            p.setBackground((Color.RED));
            displayArea.setText("Du valde rött");
        }
        else if (yellow.isSelected()){
            p.setBackground((Color.YELLOW));
            displayArea.setText("Du valde gult");
        }
        else if (blue.isSelected()){
            p.setBackground((Color.BLUE));
            displayArea.setText("Du valde blått");
        }
        else if (red.isSelected() && blue.isSelected() ){
            p.setBackground((Color.MAGENTA));
            displayArea.setText("Du valde lila");
        }
        else if (blue.isSelected() && yellow.isSelected()){
            p.setBackground((Color.GREEN));
            displayArea.setText("Du valde grönt");
        }
        else if (blue.isSelected() && yellow.isSelected() && red.isSelected()){
            displayArea.setText("Du valde brunt");
        }
        else
            displayArea.setText("Ingen färg vald");

    }


    public static void main(String[] args) {
        Minilab5 ml = new Minilab5();

    }



}
