package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht105 extends Applet {


    TextField textvak;
    Button OKbutton;
    double cijfers;
    double gemiddelde;
    String invoerString;
    String stringtext;



    @Override
    public void init() {
        textvak= new TextField(" ",10);
        textvak.addActionListener(new OKbutton());
        add(textvak);
        OKbutton=new Button("OK");
        OKbutton.addActionListener(new OKbutton());
        add(OKbutton);
        invoerString=" ";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(invoerString,50,80);
        g.drawString(stringtext,200,80);
        g.drawString(String.valueOf(cijfers),50,50);
        g.drawString(String.valueOf(gemiddelde),200,50);


    }
    class OKbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            invoerString=textvak.getText();
            double cijfer=Double.parseDouble(invoerString);
            cijfers=cijfer;
            if (cijfer<=5.4){
                invoerString="onvoldoende";

            }
            if(cijfer>=5.5 && cijfer<=10){
                invoerString="Voldoende";
            }




            gemiddelde=cijfer;
            if(gemiddelde==cijfer){
                gemiddelde=cijfer;
                }
            else {
                gemiddelde=gemiddelde/2;

            }
            if(gemiddelde>=1 && gemiddelde<=5.4){
               stringtext="niet geslaagd";
            }
            if(gemiddelde>=5.5 && gemiddelde<=10){
                stringtext="geslaagd";
            }
                    repaint();

        }
    }



}