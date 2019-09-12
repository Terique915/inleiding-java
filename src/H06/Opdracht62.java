package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht62 extends Applet {

    int Seconden;

    int Uur;
    int Dag;
    int Jaar;
    int PERUUR;
    int PERDAG;
    int PERJAAR;


    public void init() {
        Seconden=60;
        //aantal minuten in een uur
        Uur=60;
        //aantal uren in een dag
        Dag= 24;
        //aantal dagen in een jaar
        Jaar= 365;
        //Aantal seconden in een uur
        PERUUR=Seconden*Uur;
        //Aantal seconden in een dag
        PERDAG= PERUUR*Dag;
        //aantal dagen in een jaar
        PERJAAR=PERDAG*Jaar;
    }


    public void paint(Graphics g) {
        g.drawString("Seconden per Uur", 50,30);
        g.drawString(String.valueOf(PERUUR),50,50);
        g.drawString("Seconden per Dag",50,70);
        g.drawString(String.valueOf(PERDAG),50,90);
        g.drawString("Seconden per Jaar",50,110);
        g.drawString(String.valueOf(PERJAAR),50,130);


    }
}
