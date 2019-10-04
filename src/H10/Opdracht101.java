package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht101 extends Applet {
    TextField textvak;
    Button OK;
    double getal;
    String invoerString;



    @Override
    public void init() {
        textvak= new TextField(" ",10);
        textvak.addActionListener(new OK());
        add(textvak);
        OK=new Button("OK");
        OK.addActionListener(new OK());
        add(OK);
        getal=0;
    }

    @Override
    public void paint(Graphics g) {

        g.drawString("hoogstegetal:",50,70);
        g.drawString(String.valueOf(getal),150,70);
    }

    class OK implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            invoerString = textvak.getText();
            double invoer = Double.parseDouble(invoerString);

            if (invoer > getal){
                getal=invoer;
                repaint();
            }
        }
    }





}
