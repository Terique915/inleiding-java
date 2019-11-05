package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class POH12 extends Applet {
    TextField textvak;
    TextField textvak2;
    Button okbutton;
    String[] namen;
    String[] nummers;

    @Override
    public void init() {
        textvak = new TextField("Namen",15);
        add(textvak);
        textvak2 = new TextField("Nummers",15);
        add(textvak2);
        okbutton = new Button("OK");
        okbutton.addActionListener(new Okbutton());
        add(okbutton);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(namen[10],50,100);
        g.drawString(nummers[10],150,100);
    }

    class Okbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            namen[10] = textvak.getText();
            nummers[10] = textvak2.getText();
            repaint();
        }

    }
}
