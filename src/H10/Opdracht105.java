package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht105 extends Applet {


    TextField textvak;
    Button OKbutton;
    double gemiddelde;

    String invoerString;



    @Override
    public void init() {
        textvak= new TextField(" ",10);
        textvak.addActionListener(new OKbutton());
        add(textvak);
        OKbutton=new Button("OK");
        OKbutton.addActionListener(new OKbutton());
        add(OKbutton);
        gemiddelde=1;
        invoerString=" ";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(invoerString,50,80);
        g.drawString(String.valueOf(gemiddelde),50,50);


    }
    class OKbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            invoerString=textvak.getText();
            double cijfer=Double.parseDouble(invoerString);
            if (cijfer<=5.4){
                invoerString="onvoldoende";

            }
            if(cijfer>=5.5){
                invoerString="Voldoende";
            }
            gemiddelde=cijfer;


            repaint();

        }
    }



}
