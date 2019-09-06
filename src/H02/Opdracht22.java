package H02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht22 extends Applet {
    //VARIABELN DECLAREREN
    String roepnaam;
    String achternaam;

    public void init() {
        //VARIABELEN INITIALISEREN
        roepnaam = "Terique";
        achternaam = "Bliden";

        String achternaam = "Blijden";
        setBackground(Color.white);
        setSize(500, 500);
    }


    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString(roepnaam, 30, 20);
        g.setColor(Color.blue);
        g.drawString(achternaam, 30, 30);

    }


}