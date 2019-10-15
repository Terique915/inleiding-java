package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staafdiagram extends Applet {
    TextField textvak1;
    TextField textvak2;
    TextField textvak3;
    Button OKbutton;

    @Override
    public void init() {
        setSize(600,350);
        textvak1= new TextField(" ",10);
        add(textvak1);
        textvak2= new TextField(" ",10);
        add(textvak2);
        textvak3= new TextField(" ",10);
        add(textvak3);
        OKbutton= new Button("Toon");
        add(OKbutton);
    }

    @Override
    public void paint(Graphics g) {

        g.drawLine(50,50,50,300);
        g.drawLine(50,300,500,300);
        //gewichten
        g.drawString("20",30,280);
        g.drawString("40",30,240);
        g.drawString("60",30,200);
        g.drawString("80",30,160);
        g.drawString("100",25,120);
        g.drawString("120",25,80);
        //Namen
        g.drawString("Valarie",80,320);
        g.drawString("Jeroen",220,320);
        g.drawString("Hans",380,320);
    }
    class OKbutton implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            textvak1.getText();
            textvak2.getText();
            textvak3.getText();


        }
    }
}
