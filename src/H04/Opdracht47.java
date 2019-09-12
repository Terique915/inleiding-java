package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht47 extends Applet {

    public void init() {
        setSize(600,600);

    }


    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRoundRect(50,50,300,300,100,100);
        //Rechter zijde
        g.setColor(Color.BLACK);
        g.fillArc(80,100,80,80,0,360);
        g.fillArc(80,230,80,80,0,360);
        //Linker zijde
        g.fillArc(230,100,80,80,0,360);
        g.fillArc(230,230,80,80,0,360);



    }
}
