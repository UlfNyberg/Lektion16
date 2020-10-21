import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-21
 * Time: 09:45
 * Project: Lektion16
 * Copyright: MIT
 */
public class Övningsuppgift7 extends JFrame  {

    JPanel panel7 = new JPanel();
    JButton button7 = new JButton("Röd?");
    JButton button8 = new JButton("Blå?");



    Övningsuppgift7(){

        setLayout(new FlowLayout());
        this.add(panel7);
        panel7.add(button7);
        button7.setOpaque(true);
        button7.addMouseListener(musLyss);

        setTitle("Motion Mouse");
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //lite test text blablblabla
        //lite mer text

    }

    MouseAdapter musLyss = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent() == button7)
                button7.setBackground(Color.GREEN);
            super.mouseClicked(e);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            if (e.getComponent() == button7)
                button7.setBackground(Color.MAGENTA);
            super.mouseMoved(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getComponent() == button7)
                button7.setBackground(Color.RED);
            super.mouseEntered(e);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if (e.getComponent() == button7)
                button7.setBackground(Color.BLACK);
            super.mouseExited(e);
        }
    };








    public static void main(String[] args) {
        Övningsuppgift7 öb7 = new Övningsuppgift7();
    }


}
