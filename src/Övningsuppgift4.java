import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-21
 * Time: 15:14
 * Project: Lektion16
 * Copyright: MIT
 */
public class Övningsuppgift4 extends JFrame implements ActionListener {

    private final JPanel p = new JPanel();
    private final JPanel buttonPanel = new JPanel();
    private final JTextArea area = new JTextArea(10,60);
    private final JButton doubleButton = new JButton("Double");
    private final JButton clearButton = new JButton("Clear");
    JScrollPane scrollPane = new JScrollPane(area);

    Övningsuppgift4 (){
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        p.setLayout(new BorderLayout());
        p.add(scrollPane, BorderLayout.CENTER);
        buttonPanel.add(doubleButton);
        buttonPanel.add(clearButton);
        p.add(buttonPanel, BorderLayout.SOUTH);
        doubleButton.addActionListener(this);
        clearButton.addActionListener(this);
        add(p);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton){
            area.setText("");
        }
        else if (e.getSource() == doubleButton){
            String newText = area.getText() + area.getText();
            area.setText(newText);
        }
    }




    public static void main(String[] args) {
        Övningsuppgift4 öu4 = new Övningsuppgift4();
    }


}
