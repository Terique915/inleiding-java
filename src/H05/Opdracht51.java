package H05;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.ColorModel;

public class Opdracht51 extends Applet {
    //VARIABELEN DECLAREREN
    Color vulkleur;
    Color lijnkleur;
    int hoogte;
    int lengte;
    int arc;
    //X coordinaat voor figuren aan de linker zijde
    int X1;
    //X coordinaat voor figuren in het midden
    int X2;

    public void init() {
        //VARIABELEN DECLAREREN
        vulkleur=Color.MAGENTA;
        lijnkleur=Color.BLACK;
        lengte=220;
        hoogte = 120;
        arc= 30;
        X1=50;
        X2=350;




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
        g.drawLine(X1, 120, 270, 120);
        //Rechthoek
        g.drawRect(X1,160,lengte,hoogte);
        //Afgeronde Rechtohoek
        g.drawRoundRect(X1,310,lengte,100,arc,arc);
        //Cirkel
        g.drawArc(680,310,150,150,0,360);
        //Arc met oval
        g.drawOval(650,160,lengte,hoogte);
        g.setColor(vulkleur);
        g.fillArc(650,160,lengte,hoogte,30,arc);

        //Gevulde Rechthoek met Ovaal
        g.setColor(vulkleur);
        g.fillRect(X2,160,lengte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(X2,160,lengte,hoogte);

        //Gevulde Ovaal
        g.setColor(vulkleur);
        g.fillOval(X2,310,lengte,hoogte);




    }

}
