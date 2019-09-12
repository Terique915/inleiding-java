package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht44 extends Applet {
    //VARIABELEN DECLAREREN



    public void init() {
        setSize(500,500);
    }


    public void paint(Graphics g) {
        //Verticale as
        g.drawLine(50,50,50,450);
        g.drawString("10", 25, 440);
        g.drawString("20", 25, 400);
        g.drawString("30", 25, 360);
        g.drawString("40", 25, 320);
        g.drawString("50", 25, 280);
        g.drawString("60", 25, 240);
        g.drawString("70", 25, 200);
        g.drawString("80", 25, 160);
        g.drawString("90", 25, 120);
        g.drawString("100", 25, 80);
        //Horizontale as
        g.drawLine(50,450,450,450);
        g.drawString("Valarie", 70, 480);
        g.drawString("Jeroen", 190, 480);
        g.drawString("Hans", 310, 480);

        g.setColor(Color.MAGENTA);
        g.fillRect(60,320,80,130);
        g.setColor(Color.red);
        g.fillRect(180,80,80,370);
        g.setColor(Color.blue);
        g.fillRect(300,160,80,290);





    }
}
