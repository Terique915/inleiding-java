package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht42 extends Applet {

    public void init() {
        setSize(500,500);

    }


    public void paint(Graphics g) {
        g.drawRect(100,300,280,160);
       g.drawLine(100,300,230,200);
       g.drawLine(230,200,380,300);
       g.drawRect(300,330,50,60);
       g.drawRect(200,370,50,90);
    }

}
