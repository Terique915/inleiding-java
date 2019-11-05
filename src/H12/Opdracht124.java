package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht124 extends Applet implements ActionListener {
    TextField textvak;
    Button okbutton;
    boolean Gevonden;
    int index;
    int[] getallen = {1, 2, 4, 6, 7, 9, 10};

    @Override
    public void init() {
        textvak = new TextField(" ",10);
        add(textvak);
        okbutton = new Button("OK");
        okbutton.addActionListener(this);
        add(okbutton);

        Gevonden = false;
    }

    @Override
    public void paint(Graphics g) {
        if (Gevonden){
            g.drawString("Waarde gevonden het index is "+index,50,70);
        }
        else{
            g.drawString("Waarde niet gevonden",50,70);
        }
    }


        @Override
        public void actionPerformed(ActionEvent e) {
            int input = Integer.parseInt(textvak.getText());

            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == input) {
                    Gevonden = true;
                    index = i;


                }
                repaint();
            }
        }
}
