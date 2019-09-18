package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opdracht81 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String bericht;


    public void init() {
        tekstvak= new TextField("teksvak",20);
        add(tekstvak);

        knop2= new Button("OK");
        knop2.addActionListener(new Knop2listener());
        add(knop2);
        knop= new Button("Reset");
        knop.addActionListener(new Knoplistener());
        add(knop);
        bericht="berich hier";
    }


    public void paint(Graphics g) {
        g.drawString(bericht,50,100);

    }
    class Knoplistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");


        }
    }
    class Knop2listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            bericht=tekstvak.getText();
            repaint();

        }
    }
}
