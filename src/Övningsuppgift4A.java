import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-21
 * Time: 15:50
 * Project: Lektion16
 * Copyright: MIT
 */
public class Övningsuppgift4A extends JFrame implements ActionListener {

    private final JPanel p = new JPanel();
    private final JPanel buttonPanel = new JPanel();

    private final JTextArea area = new JTextArea(10,60);
    private final JTextField inputField = new JTextField(15);
    private final JLabel textByTextField = new JLabel("Filnamn: ");

    private final JButton openButton = new JButton("Öppna");
    private final JButton saveButton = new JButton("Spara");
    private final JButton printButton = new JButton("Skriv ut");
    private final JButton exitButton = new JButton("Avsluta");
    JScrollPane scrollPane = new JScrollPane(area);

    Övningsuppgift4A (){
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        p.setLayout(new BorderLayout());
        p.add(scrollPane, BorderLayout.CENTER);
        buttonPanel.add(textByTextField);
        buttonPanel.add(inputField);
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(printButton);
        buttonPanel.add(exitButton);
        p.add(buttonPanel, BorderLayout.NORTH);
        openButton.addActionListener(this);
        saveButton.addActionListener(this);
        printButton.addActionListener(this);
        exitButton.addActionListener(this);
        add(p);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openButton){
            area.setText("");
        }
        else if (e.getSource() == saveButton){
            String newText = area.getText() + area.getText();
            area.setText(newText);
        }
    }




    public static void main(String[] args) {
        Övningsuppgift4A öu4A = new Övningsuppgift4A();
    }

}
