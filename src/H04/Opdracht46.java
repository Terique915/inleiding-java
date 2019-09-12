package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht46 extends Applet {

    public void init() {
        setSize(500,500);

    }


    public void paint(Graphics g) {
        g.fillRect(50,120,150,370);
        g.setColor(Color.red);
        g.fillArc(80,140,80,80,0,360);
        g.setColor(Color.orange);
        g.fillArc(80,250,80,80,0,360);
        g.setColor(Color.green);
        g.fillArc(80,360,80,80,0,360);


    }
}
