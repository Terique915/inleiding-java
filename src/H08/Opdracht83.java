package H08;

import jdk.internal.util.xml.impl.Input;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht83 extends Applet {
    TextField tekstvak;
    Button Enter;
    double bedrag;



    public void init() {

        tekstvak= new TextField("bedrag",20);
        add(tekstvak);
        Enter=new Button("Enter");
        Enter.addActionListener(new Enter());
        add(Enter);
        bedrag=0;


    }


    public void paint(Graphics g) {

        g.drawString("Prijs Incusief Btw: " + bedrag,50,90);


    }
    class Enter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            double d = Double.parseDouble(s);
            bedrag = d * 1.21;
            repaint();




        }
    }


}
