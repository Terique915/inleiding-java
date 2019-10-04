package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht102 extends Applet {
    TextField textvak;
    Button OKbutton;
    double getal;
    double getal2;
    String invoerString;



    @Override
    public void init() {
        textvak= new TextField(" ",10);
        textvak.addActionListener(new OKbutton());
        add(textvak);
        OKbutton=new Button("OK");
        OKbutton.addActionListener(new OKbutton());
        add(OKbutton);
        getal=0;
        getal2=0;
    }

    @Override
    public void paint(Graphics g) {

        g.drawString("hoogste getal:",50,70);
        g.drawString(String.valueOf(getal),150,70);

        g.drawString("kleinste getal",50,90);
        g.drawString(String.valueOf(getal2),150,90);
    }

    class OKbutton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            invoerString = textvak.getText();
            double invoer = Double.parseDouble(invoerString);

            if (invoer > getal){
                getal=invoer;
                repaint();
            }
            else {
                getal2=getal;
                getal2=invoer;
            }

        }
    }
}
