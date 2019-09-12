package H04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        //Woorden
        g.drawString("lijn", 120, 140);
        g.drawString("Rechthoek", 120, 300);
        g.drawString("Afgeronde Rechthoek", 100, 440);
        g.drawString("GevuldeRechthoek", 420, 300);
        g.drawString("Gevulde Ovaal", 420, 450);
        g.drawString("Taartpunt met Ovaal eromheen", 680, 300);
        g.drawString("Cirkel", 740, 490);

        //Lijn
        g.drawLine(50, 120, 270, 120);
        //Rechthoek
        g.drawRect(50,160,220,120);
        //Afgeronde Rechtohoek
        g.drawRoundRect(50,310,220,100,30,30);
        //Cirkel
        g.drawArc(680,310,150,150,0,360);
        //Arc met oval
        g.drawOval(650,160,220,120);
        g.setColor(Color.magenta);
        g.fillArc(650,160,220,120,30,30);

        //Gevulde Rechthoek met Ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(350,160,220,120);
        g.setColor(Color.BLACK);
        g.drawOval(350,160,220,120);

        //Gevulde Ovaal
        g.setColor(Color.magenta);
        g.fillOval(350,310,220,120);




    }
}
